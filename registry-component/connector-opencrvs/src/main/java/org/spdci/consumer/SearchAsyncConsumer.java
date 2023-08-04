package org.spdci.consumer;

import lombok.extern.slf4j.Slf4j;
import org.spdci.common.Payload;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
@Slf4j
public class SearchAsyncConsumer {

    WebClient webClient = WebClient.create("http://localhost:8080");

    @Value("${rabbitmq.queue.name}")
    private String searchQueue;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @RabbitListener(queues = {"${rabbitmq.queue.name}"})
    public void receiveMsg(Payload payload) {
        rabbitTemplate.receive(searchQueue);
        makeApiCall(payload);
    }
    private void makeApiCall(Payload payload) {
        Mono<String> response = webClient.post()
                .uri("/on-search")
                .bodyValue(payload)
                .retrieve()
                .bodyToMono(String.class);

        response.subscribe();
    }
}

package com.ahi.crvs.subscriber.controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.PathParam;

import org.apache.commons.lang.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ahi.crvs.subscriber.pojo.Context;
import com.ahi.crvs.subscriber.pojo.EventInfo;
import com.ahi.crvs.subscriber.pojo.Identifier;
import com.ahi.crvs.subscriber.pojo.Resource;
import com.ahi.crvs.subscriber.pojo.WebhooksEventData;
import com.ahi.crvs.subscriber.pojo.WebhooksGetResponse;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class WebhookController {

	private List<WebhooksEventData> eventDataList = new ArrayList<>();

	@Autowired
	ObjectMapper objectMapper;

	@GetMapping(value = "/webhooks", produces = "application/json")
	public WebhooksGetResponse ping(@PathParam("mode") String mode, //
			@PathParam("challenge") String challenge, @PathParam("topic") String topic) {

		log.info("Receive GET : Mode {} Challenge : {} , Topic {}", mode, challenge, topic);

		WebhooksGetResponse response = new WebhooksGetResponse();

		if (StringUtils.hasText(challenge)) {
			response.setChallenge(challenge);
		} else {
			response.setChallenge(RandomStringUtils.randomNumeric(10));
		}

		response.setChallenge(challenge);
		return response;
	}

	@PostMapping(value = "/webhooks")
	public ResponseEntity<String> dataReceiver(@RequestBody String eventData) {
		try {

			log.info(eventData);

			WebhooksEventData readValue = objectMapper.readValue(eventData, WebhooksEventData.class);
			log.info(readValue.getEvent().getHub().getTopic());
			
			eventDataList.add(readValue);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return ResponseEntity.ok("");
	}

	@GetMapping(value = "/api/eventData", produces = "application/json")
	public ResponseEntity<List<EventInfo>> getEventData() {
		log.info("Received data from CRVS");
		List<EventInfo> events = new ArrayList<>();
		if (!eventDataList.isEmpty()) {
			for (WebhooksEventData event : eventDataList) {
				EventInfo e = new EventInfo();
				e.setEvent(event.getEvent().getHub().getTopic());
				e.setEventDate(event.getTimestamp());
				if (!CollectionUtils.isEmpty(event.getEvent().getContext())) {
					for (Context context : event.getEvent().getContext()) {
						for (Resource resource : context.getEntry()) {
							if (resource.getResource().getResourceType().equalsIgnoreCase("Patient")) {
								String firstName = resource.getResource().getName().get(0).getGiven().get(0);
								String lastName = resource.getResource().getName().get(0).getFamily().get(0);
								e.setFirstName(firstName);
								e.setLastName(lastName);
								for (Identifier identifier : resource.getResource().getIdentifier()) {
									if (identifier.getType().contains("REGISTRATION")) {
										e.setDocumentId(identifier.getValue());
									}
								}
							}

						}
					}
				}
				events.add(e);
			}
		}

		//System.out.println(RandomStringUtils.randomNumeric(10));
		return ResponseEntity.ok(events);
	}

}

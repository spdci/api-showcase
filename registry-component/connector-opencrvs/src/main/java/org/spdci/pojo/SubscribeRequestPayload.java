package org.spdci.pojo;

import jakarta.persistence.*;
import lombok.Data;
import org.spdci.enums.Frequency;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.UUID;

@Data
@Entity
@Table(name = "subscribe_request_payload")
public class SubscribeRequestPayload {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "subscribe_id")
    private UUID subscribeId;

    @Column(name = "transaction_id")
    private String transactionId;

    @Column(name = "query", columnDefinition = "TEXT")
    private String query;

    @Column(name = "created_dtm")
    @DateTimeFormat(pattern = "dd.MM.yyyy hh:mm:ss")
    private Date createdDtm;

    @Enumerated(EnumType.STRING)
    @Column(name = "is_subscribe")
    private SubscribeStatus isSubscribe;

    @Enumerated(EnumType.STRING)
    @Column(name = "frequency")
    private Frequency frequency;
}

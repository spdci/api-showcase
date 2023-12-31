package org.spdci.pojo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "request")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String transactionId;
    @Column(length = 5000)
    private String requestPayload;
    private String status;
    private String reasonCode;
    private String errorCode;
    private String errorMessage;
    @Column(name = "created_dtm")
    @DateTimeFormat(pattern = "dd.MM.yyyy hh:mm:ss")
    private Date createdDtm;
}

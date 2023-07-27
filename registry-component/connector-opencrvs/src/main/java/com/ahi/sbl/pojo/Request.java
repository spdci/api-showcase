package com.ahi.sbl.pojo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.spdci.common.Payload;
import org.spdci.enums.RequestStatus;
import org.spdci.enums.SearchStatusReasonCode;

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
    private String requestPayload;
    private String status;
    private String reasonCode;
    private String errorCode;
    private String errorMessage;
}

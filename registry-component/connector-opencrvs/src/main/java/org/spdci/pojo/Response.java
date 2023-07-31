package org.spdci.pojo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.spdci.common.Payload;

import java.util.UUID;

@Entity
@Table(name = "response")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Response {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String transactionId;
    @Column(length = 5000)
    private String responsePayload;
    private String errorCode;
    private String errorMessage;
}
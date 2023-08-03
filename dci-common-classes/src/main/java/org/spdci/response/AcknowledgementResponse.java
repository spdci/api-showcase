package org.spdci.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.spdci.common.ErrorCode;
import org.spdci.enums.AckStatus;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AcknowledgementResponse {
    private AckStatus ackStatus;
    private LocalDateTime timestamp;
    private ErrorCode error;
    private String correlationId;
    
    public static AcknowledgementResponse getAck(ErrorCode error, String transactionId) {
    	return AcknowledgementResponse.builder()//
    			.ackStatus(AckStatus.ACK)//
    			.timestamp(LocalDateTime.now())//
    			.error(error)//
    			.correlationId(transactionId)//
    			.build();
    }
    public static AcknowledgementResponse getAck(String transactionId) {
    	return AcknowledgementResponse.builder()//
    			.ackStatus(AckStatus.ACK)//
    			.timestamp(LocalDateTime.now())//
    			.error(null)//
    			.correlationId(transactionId)//
    			.build();
    }
    public static AcknowledgementResponse getAck() {
    	return AcknowledgementResponse.builder()//
    			.ackStatus(AckStatus.ACK)//
    			.timestamp(LocalDateTime.now())//
    			.error(null)//
    			.correlationId(null)//
    			.build();
    }
    
    public static AcknowledgementResponse getNack(ErrorCode error, String transactionId) {
    	return AcknowledgementResponse.builder()//
    			.ackStatus(AckStatus.NACK)//
    			.timestamp(LocalDateTime.now())//
    			.error(error)//
    			.correlationId(transactionId)//
    			.build();
    }
    public static AcknowledgementResponse getNack(String transactionId) {
    	return AcknowledgementResponse.builder()//
    			.ackStatus(AckStatus.NACK)//
    			.timestamp(LocalDateTime.now())//
    			.error(null)//
    			.correlationId(transactionId)//
    			.build();
    }
    public static AcknowledgementResponse getNack() {
    	return AcknowledgementResponse.builder()//
    			.ackStatus(AckStatus.NACK)//
    			.timestamp(LocalDateTime.now())//
    			.error(null)//
    			.correlationId(null)//
    			.build();
    }
}

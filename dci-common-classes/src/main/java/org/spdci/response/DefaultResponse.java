package org.spdci.response;

import lombok.Getter;
import lombok.Setter;
import org.spdci.common.ErrorCode;
import org.spdci.enums.AckStatus;

import java.time.LocalDateTime;

@Getter
@Setter
public class DefaultResponse {
    private AckStatus ackStatus;
    private LocalDateTime timestamp;
    private ErrorCode error;
    private String correlationId;
}

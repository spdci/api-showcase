package org.spdci.pojo.common;

import lombok.Data;
import org.spdci.common.EncryptedHeader;
import org.spdci.common.ErrorCode;
import org.spdci.enums.AckStatus;

import java.time.LocalDateTime;

@Data
public class UnSubscribeMessage {

    private AckStatus ackStatus;
    private LocalDateTime timestamp;
    private ErrorCode error;
    private String correlationId;
    private EncryptedHeader encryptedHeader;
    private String data;
    private String encryptedKey;
    private String authTag;
    private String iv;
}

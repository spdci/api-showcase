package org.spdci.pojo.common;

import lombok.Data;

@Data
public class Header {
    private String action;
    private String version;
    private String messageId;
    private String messageTs;
    private String senderId;
    private String receiverId;
    private boolean isEncrypted;
    private String encryptionAlgorithm;
    private Boolean async;
    private String callbackEndpoint;
}

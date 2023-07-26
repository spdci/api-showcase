package org.spdci.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Header {
    private String version;
    private String messageId;
    private String messageTs;
    private String senderId;
    private String receiverId;
    private String action;
    private int totalCount;
    private boolean isEncrypted;
    private String encryptionAlgorithm;
    private Boolean async;
    private String callbackEndpoint;
    private int CompletedCount;
}

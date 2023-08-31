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
    private String action;
    private String senderId;
    private String senderUri;
    private String receiverId;
    private int totalCount;
    private String encryptionAlgo;



    private String status;
    private String status_reason_code;
    private String status_reason_message;
    private int CompletedCount;
}

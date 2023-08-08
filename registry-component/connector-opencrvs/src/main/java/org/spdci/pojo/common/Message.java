package org.spdci.pojo.common;

import lombok.Data;
import org.spdci.common.EncryptedHeader;
import org.spdci.pojo.request.SubscribeRequest;

@Data
public class Message {

    private String transactionId;
    private SubscribeRequest subscribeRequest;

    private EncryptedHeader encryptedHeader;
    private String data;
    private String encryptedKey;
    private String authTag;
    private String iv;

}

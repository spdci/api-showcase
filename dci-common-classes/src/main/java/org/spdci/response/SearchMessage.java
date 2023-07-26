package org.spdci.response;

import org.spdci.common.EncryptedHeader;
import org.spdci.common.Message;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchMessage extends Message {
    private String transactionId;
    private SearchResponse searchResponse;

    private EncryptedHeader encryptedHeader;
    private String data;
    private String encryptedKey;
    private String authTag;
    private String iv;
}

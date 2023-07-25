package com.ahi.response;

import com.ahi.common.EncryptedHeader;
import com.ahi.common.Message;
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

package org.spdci.common;


import org.spdci.request.SearchRequest;
import org.spdci.request.SubscribeRequest;
import org.spdci.response.SearchResponse;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Message   {
    private String transactionId;
    private SearchRequest searchRequest;

    private SearchResponse searchResponse;
    private SubscribeRequest subscribeRequest;

    private EncryptedHeader encryptedHeader;
    private String data;
    private String encryptedKey;
    private String authTag;
    private String iv;
}

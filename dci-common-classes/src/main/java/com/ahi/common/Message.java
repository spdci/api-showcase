package com.ahi.common;


import com.ahi.request.SearchRequest;
import com.ahi.response.SearchResponse;
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

    private EncryptedHeader encryptedHeader;
    private String data;
    private String encryptedKey;
    private String authTag;
    private String iv;
}

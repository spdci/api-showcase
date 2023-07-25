package com.ahi.request;

import com.ahi.common.IMessage;
import com.ahi.common.Message;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "@class")
@JsonTypeName("SearchMessage")
public class SearchMessage implements IMessage {
    private String transactionId;
    private SearchRequest searchRequest;
}

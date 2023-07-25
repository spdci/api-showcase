package com.ahi.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class SearchResponse {
    private String version;
    private List<SearchResponseObject> data;
}

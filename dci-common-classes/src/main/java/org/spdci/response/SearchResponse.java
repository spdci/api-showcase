package org.spdci.response;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Data
public class SearchResponse {
    private String version;
    private List<SearchResponseObject> data;
}

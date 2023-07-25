package com.ahi.request;

import com.ahi.common.Pagination;
import com.ahi.common.SearchSortList;
import com.ahi.enums.CREventType;
import com.ahi.enums.RegistryType;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
@Getter
@Setter
public class SearchRequestObject {
    private String referenceId;
    private LocalDateTime timestamp;
    private RegistryType registryType;
    private CREventType eventType;
    private SearchCriteria searchCriteria;
    private List<String> filter;
    private List<SearchSortList> sort;
    private Pagination pagination;
    private String locale;
}

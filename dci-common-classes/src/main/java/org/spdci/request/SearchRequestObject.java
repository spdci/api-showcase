package org.spdci.request;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

import org.spdci.common.Pagination;
import org.spdci.common.SearchSortList;
import org.spdci.enums.CREventType;
import org.spdci.enums.RegistryType;
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

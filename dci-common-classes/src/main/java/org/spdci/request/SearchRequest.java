package org.spdci.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.spdci.common.Pagination;
import org.spdci.common.SearchSortList;
import org.spdci.enums.CREventType;
import org.spdci.enums.RegistryType;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SearchRequest {
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

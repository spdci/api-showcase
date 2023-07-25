package com.ahi.response;

import com.ahi.common.CRRecord;
import com.ahi.common.Pagination;
import com.ahi.enums.CREventType;
import com.ahi.enums.RegistryType;
import com.ahi.enums.RequestStatus;
import com.ahi.enums.SearchStatusReasonCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class SearchResponseObject {
    private String referenceId;
    private LocalDateTime timestamp;
    private RequestStatus status;
    private SearchStatusReasonCode statusReasonCode;
    private String statusReasonMessage;
    private RegistryType registryType;
    private CREventType eventType;
    private List<CRRecord> registryData;
    private Pagination pagination;
    private String locale;
}

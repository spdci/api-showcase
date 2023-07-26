package org.spdci.response;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

import org.spdci.common.CRRecord;
import org.spdci.common.Pagination;
import org.spdci.enums.CREventType;
import org.spdci.enums.RegistryType;
import org.spdci.enums.RequestStatus;
import org.spdci.enums.SearchStatusReasonCode;

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

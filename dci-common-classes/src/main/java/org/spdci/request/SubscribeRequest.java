package org.spdci.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.spdci.enums.CREventType;
import org.spdci.enums.Frequency;
import org.spdci.enums.RegistryType;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SubscribeRequest {
    private String referenceId;
    private LocalDateTime timestamp;
    private RegistryType registryType;
    private CREventType eventType;
    private Frequency frequency;
    private SearchCriteria subscribeCriteria;
    private List<String> filter;
    private String locale;
}

package org.spdci.pojo.request;

import lombok.Data;
import org.spdci.enums.CREventType;
import org.spdci.enums.RegistryType;
import org.spdci.pojo.enums.Frequency;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
public class SubscribeRequest {
    private String referenceId;

    private LocalDateTime timestamp;

    private RegistryType registryType;

    private CREventType eventType;

    private Frequency frequency;

    private String subscribeCriteria;

    private List<String> filter = new ArrayList<>();

    private String locale;

}

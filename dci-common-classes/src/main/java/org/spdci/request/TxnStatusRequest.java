package org.spdci.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.spdci.enums.SearchType;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TxnStatusRequest {
    private String referenceId;
    private SearchType searchType;
    private String transactionId;

    private String locale;
}

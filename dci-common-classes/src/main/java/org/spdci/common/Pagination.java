package org.spdci.common;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pagination {
    private int pageSize;
    private int pageNumber;
    private int totalRecord;
}

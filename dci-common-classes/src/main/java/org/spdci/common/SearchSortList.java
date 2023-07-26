package org.spdci.common;

import org.spdci.enums.SortingOrder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SearchSortList {
    private String attributeName;
    private SortingOrder sortOrder;
}

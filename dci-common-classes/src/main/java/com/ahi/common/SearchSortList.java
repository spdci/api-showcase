package com.ahi.common;

import com.ahi.enums.SortingOrder;
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

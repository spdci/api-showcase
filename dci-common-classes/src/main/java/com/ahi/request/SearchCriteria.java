package com.ahi.request;

import com.ahi.common.CRRecord;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SearchCriteria {

    CRRecord query;
    List<CustomQuery> customQuery;

}

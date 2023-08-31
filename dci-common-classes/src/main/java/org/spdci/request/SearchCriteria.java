package org.spdci.request;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

import org.spdci.common.CRRecord;

@Getter
@Setter
public class SearchCriteria {

    CRRecord query;


    List<RecordType> record_type;

}

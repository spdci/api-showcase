package com.ahi.common;

import com.ahi.enums.Relationship;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CRRelatedPerson {
    private String relationCode;
    private List<Identifier> identifiers;
    private HumanName name;
    private Relationship relationship;
}

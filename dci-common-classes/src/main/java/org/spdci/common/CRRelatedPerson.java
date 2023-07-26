package org.spdci.common;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

import org.spdci.enums.Relationship;

@Getter
@Setter
public class CRRelatedPerson {
    private String relationCode;
    private List<Identifier> identifiers;
    private HumanName name;
    private Relationship relationship;
}

package org.spdci.common;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GeoLocation {
    private String globalCode;
    private Geometry geometry;
}

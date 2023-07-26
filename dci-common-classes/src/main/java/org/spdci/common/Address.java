package org.spdci.common;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address {
    private String addressLine1;
    private String addressLine2;
    private String locality;
    private String subRegionCode;
    private String regionCode;
    private String postalCode;
    private String countryCode;
    private GeoLocation geoLocation;
}

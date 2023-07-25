package com.ahi.enums;

public enum SexCode {
    Male("1"),
    Female("2"),
    Others("3"),
    Unknown("4");

    private final String code;

    SexCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public static String getCodeByName(SexDisplayText dname) {
        for (SexCode code : values()) {
            if (code.name().equalsIgnoreCase(dname.name())) {
                return code.code;
            }
        }
        return null;
    }


}

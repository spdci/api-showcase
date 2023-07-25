package com.ahi.common;

import com.ahi.enums.SexCode;
import com.ahi.enums.SexDisplayText;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Sex {
    private String code;
    private SexDisplayText displayText;


    public SexDisplayText getDisplayText() {
        return displayText;
    }

    public void setDisplayText(SexDisplayText displayText) {
        this.displayText = displayText;
        this.code = SexCode.getCodeByName(displayText);
    }

    public String getCode() {
        return code;
    }

}

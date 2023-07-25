package com.ahi.common;

import com.ahi.enums.ExpressionOperator;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Expression {
    private int seqNum;
    private String attributeName;
    private ExpressionOperator operator;
    private String attributeValue;
}

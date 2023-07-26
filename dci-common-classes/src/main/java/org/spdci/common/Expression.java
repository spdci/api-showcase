package org.spdci.common;

import org.spdci.enums.ExpressionOperator;

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

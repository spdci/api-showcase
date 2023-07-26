package org.spdci.request;

import org.spdci.common.Expression;
import org.spdci.enums.ExpressionCondition;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class CustomQuery {
    private Expression expression1;
    private ExpressionCondition condition;
    private Expression expression2;

}

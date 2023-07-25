package com.ahi.request;

import com.ahi.common.Expression;
import com.ahi.enums.ExpressionCondition;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class CustomQuery {
    private Expression expression1;
    private ExpressionCondition condition;
    private Expression expression2;

}

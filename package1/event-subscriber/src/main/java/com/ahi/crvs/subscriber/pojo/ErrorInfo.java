package com.ahi.crvs.subscriber.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class ErrorInfo {
	private String code;
	private String message;
}

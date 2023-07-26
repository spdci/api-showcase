package com.ahi.sbl.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Builder
public class AhiInternalServerError extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private String success;
	private String return_message;
	private String error_code;
}

package com.ahi.gateway.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrResponse {

	private String success;

	private String return_message;

	private String error_code;

}

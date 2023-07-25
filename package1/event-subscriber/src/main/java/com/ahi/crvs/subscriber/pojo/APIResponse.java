package com.ahi.crvs.subscriber.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class APIResponse {

	private Object data;

	private ErrorInfo error;

	private String status;

	public APIResponse(Object data) {
		if (data instanceof ErrorInfo) {
			this.setStatus("error");
			this.error = (ErrorInfo) data;
		} else {
			this.setStatus("success");
			this.data = data;
		}

	}

	public void setStatus(String status) {
		this.status = status;
	}

}

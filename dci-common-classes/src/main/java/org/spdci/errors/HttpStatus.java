package org.spdci.errors;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Builder
public class HttpStatus {
	private String error_code;
	private String error_message;

}

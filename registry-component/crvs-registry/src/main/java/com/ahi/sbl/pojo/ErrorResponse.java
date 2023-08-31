package com.ahi.sbl.pojo;

import lombok.*;

@Data
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@EqualsAndHashCode(callSuper=false)
public class ErrorResponse extends ApiResponse {
	private String errorMessage;
	@Builder
	public ErrorResponse(String success, String message, String errorMessage) {
		super(success, message);
	}
}

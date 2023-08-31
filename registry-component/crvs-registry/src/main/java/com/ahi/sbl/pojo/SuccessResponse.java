package com.ahi.sbl.pojo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
 
@Data
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class SuccessResponse<T> extends ApiResponse {
	
	private List<T> data;
	
	@Builder
	public SuccessResponse(String success, String message, String errorMessage) {
		super(success, message);
	}
}

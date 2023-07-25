package com.ahi.sbl.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OPTRequest {
	private String firstName;
	private String contactNo;
	private String uin;
}

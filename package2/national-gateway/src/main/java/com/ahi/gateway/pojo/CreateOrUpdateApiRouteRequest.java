package com.ahi.gateway.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateOrUpdateApiRouteRequest {

	@NotBlank
	private String path;

	private String header;

	@NotBlank
	private String uri;
}

package com.ahi.gateway.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(TableName.API_ROUTE)
public class ApiRoute {

	@Id
	private Long id;
	private String header;
	private String uri;
}

package com.ahi.crvs.subscriber.pojo;

import java.util.List;

import lombok.Data;

@Data
public class Context {
	private String resourceType;
	private List<Resource> entry;
	
}

package com.ahi.crvs.subscriber.pojo;

import java.util.List;

import lombok.Data;

@Data
public class Name {
	private String use;
	private List<String> given;
	private List<String> family; 
}

package com.ahi.crvs.subscriber.pojo;

import java.util.List;

import lombok.Data;

@Data
public class Event {
	private Hub hub;
	private List<Context> context;
}

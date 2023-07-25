package com.ahi.crvs.subscriber.pojo;

import lombok.Data;

@Data
public class Payload {
	private String id;
	private String timestamp;
	private Event event;

}

package com.ahi.crvs.subscriber.pojo;

import lombok.Data;

@Data
public class WebhooksEventData {
	private String timestamp;
	private String id;
	private Event event;

}

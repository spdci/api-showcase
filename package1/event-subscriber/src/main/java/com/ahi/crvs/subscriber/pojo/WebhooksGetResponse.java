package com.ahi.crvs.subscriber.pojo;

import lombok.Data;

@Data
public class WebhooksGetResponse {
	private String mode;
	private String challenge;
	private String topic;
}

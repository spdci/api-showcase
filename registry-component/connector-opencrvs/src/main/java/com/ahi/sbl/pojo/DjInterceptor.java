package com.ahi.sbl.pojo;

import ca.uhn.fhir.rest.client.api.IHttpResponse;
import ca.uhn.fhir.rest.client.interceptor.CapturingInterceptor;

public class DjInterceptor extends CapturingInterceptor {

	@Override
	public void interceptResponse(IHttpResponse theResponse) {
		System.out.println("This is data");
	}

}

package obg.spdci.services.impl;

import org.spdci.response.AcknowledgementResponse;

import obg.spdci.services.SearchService;

public class SearchServiceImpl implements SearchService {

	@Override
	public AcknowledgementResponse onStatus(String payload) {

		return AcknowledgementResponse.getAck();
	}

}

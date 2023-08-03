package obg.spdci.services;

import org.spdci.response.AcknowledgementResponse;

public interface SearchService {
	public AcknowledgementResponse onStatus(String payload);
}

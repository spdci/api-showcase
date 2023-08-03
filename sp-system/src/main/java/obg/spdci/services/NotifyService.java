package obg.spdci.services;

import org.spdci.response.AcknowledgementResponse;

public interface NotifyService {
	public AcknowledgementResponse notify(String payload);
}

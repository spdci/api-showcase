package org.spdci.pojo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.spdci.common.Payload;
import org.spdci.pojo.request.SubscribePayload;
import org.spdci.response.AcknowledgementResponse;

@Getter
@NoArgsConstructor
public class ResponseWrapper {

    private AcknowledgementResponse acknowledgementResponse;
    private Payload payload;
    private SubscribePayload subscribePayload;

    public ResponseWrapper(AcknowledgementResponse acknowledgementResponse) {
        this.acknowledgementResponse = acknowledgementResponse;
    }

    public ResponseWrapper(Payload payload) {
        this.payload = payload;
    }

    public ResponseWrapper(SubscribePayload subscribePayload) {
        this.subscribePayload = subscribePayload;
    }
}

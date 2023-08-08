package org.spdci.pojo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.spdci.common.Payload;
import org.spdci.response.AcknowledgementResponse;

@Getter
@NoArgsConstructor
public class ResponseWrapper {

    private AcknowledgementResponse acknowledgementResponse;
    private Payload payload;

    public ResponseWrapper(AcknowledgementResponse acknowledgementResponse) {
        this.acknowledgementResponse = acknowledgementResponse;
    }

    public ResponseWrapper(Payload payload) {
        this.payload = payload;
    }

}

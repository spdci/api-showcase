package org.spdci.pojo.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.spdci.pojo.common.Header;
import org.spdci.pojo.common.Message;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubscribePayload {
    private String signature;
    private Header headers;
    private Message message;
}

package org.spdci.pojo.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.spdci.pojo.common.Header;
import org.spdci.pojo.common.UnSubscribeMessage;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UnSubscribePayload {
    private String signature;
    private Header headers;
    private UnSubscribeMessage message;
}

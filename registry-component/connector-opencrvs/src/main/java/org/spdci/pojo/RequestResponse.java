package org.spdci.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestResponse {
    CrvsResponse birthData;
    CrvsResponse marriageData;
    CrvsResponse deathData;
}

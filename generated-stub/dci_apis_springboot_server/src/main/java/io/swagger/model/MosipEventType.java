package io.swagger.model;

import java.util.Objects;
import io.swagger.v3.oas.annotations.media.Schema;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Standardized codes/values represent key events to [integrate](https://docs.mosip.io/1.2.0/integrations/mosip-opencrvs-integration#scope) with civil registries. <br><br> **Sample flow to explain birth registration between MOSIP and CRVS systems:** 1. Step 1: MOSIP subscribes to BIRTH_REGISTERED event with CRVS for RegistrationRecord 2. Step 2: CRVS subscribes to BIRTH_REGISTERED event with MOSIP for MOSIPVerifiableCredential 3. Step 3: CRVS notifies RegistrationRecord data to MOSIP  4. Step 4: MOSIP notifies MOSIPVerifiableCredential data to CRVS <br>  **Sample flow to explain data modification (push) flow from MOSIP to CRVS systems:**   1. Step 1: CRVS subscribes to DATA_MODIFICATION event with MOSIP for MOSIPToken data   2. Step 2: MOSIP notifies MOSIPToken data to CRVS<br>  **Note:**  1. Data modifiation (pull) flow can be accomodated with sync/search or existing mosip's eKyc auth api. 2. Death, Death Reversal fllows same pattern as described in for birth registration. 
 */
public enum MosipEventType {
  BIRTH_REGISTERED("BIRTH_REGISTERED"),
    DEATH_REGISTERED("DEATH_REGISTERED"),
    DEATH_REVERSAL("DEATH_REVERSAL"),
    DATA_MODIFICATION("DATA_MODIFICATION");

  private String value;

  MosipEventType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static MosipEventType fromValue(String text) {
    for (MosipEventType b : MosipEventType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

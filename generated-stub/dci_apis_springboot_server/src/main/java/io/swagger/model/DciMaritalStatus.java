package io.swagger.model;

import java.util.Objects;
import io.swagger.v3.oas.annotations.media.Schema;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Marital status reference database: Standardized codes/values representing different marital status categories <br> Reference: [FHIR Marital Status](https://hl7.org/fhir/DSTU2/valueset-marital-status.html)<br>  Code : Values - Description <br> S : Never Married - No marriage contract has ever been entered <br> M : Married - A current marriage contract is active <br> W : Widow - The spouse has died <br> A : Annulled - Marriage contract has been declared null and to not have existed <br> D : Divorced - Marriage contract has been declared dissolved and inactive <br> L : Legally Separated - Legally Separated <br> U : Unmarried - The person is not presently married. The marital history is not known or stated. <br> 
 */
public enum DciMaritalStatus {
  S("S"),
    M("M"),
    W("W"),
    A("A"),
    D("D"),
    L("L"),
    U("U");

  private String value;

  DciMaritalStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static DciMaritalStatus fromValue(String text) {
    for (DciMaritalStatus b : DciMaritalStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

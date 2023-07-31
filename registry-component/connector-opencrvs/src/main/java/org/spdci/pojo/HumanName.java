package org.spdci.pojo;

import java.util.List;

import org.hl7.fhir.dstu3.model.StringType;
import org.hl7.fhir.dstu3.model.Type;
import org.hl7.fhir.instance.model.api.ICompositeType;

import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.DatatypeDef;
import ca.uhn.fhir.model.api.annotation.Description;
import lombok.Getter;
import lombok.Setter;

@DatatypeDef(name = "HumanName")
@Getter
@Setter
public class HumanName extends Type implements ICompositeType {
	
	private static final long serialVersionUID = -4383613019165633072L;

	/**
	 * The part of a name that links to the genealogy. In some cultures (e.g.
	 * Eritrea) the family name of a son is the first name of his father.
	 */
	@Child(name = "family", type = { StringType.class }, order = 2, min = 0, max = 1, modifier = false, summary = true)
	@Description(shortDefinition = "Family name (often called 'Surname')", formalDefinition = "The part of a name that links to the genealogy. In some cultures (e.g. Eritrea) the family name of a son is the first name of his father.")
	private StringType family;

	/**
	 * Given name.
	 */
	@Child(name = "given", type = {
			StringType.class }, order = 3, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = true)
	@Description(shortDefinition = "Given names (not always 'first'). Includes middle names", formalDefinition = "Given name.")
	private List<StringType> given;

	@Override
	protected Type typedCopy() {
		// TODO Auto-generated method stub
		return null;
	}
}

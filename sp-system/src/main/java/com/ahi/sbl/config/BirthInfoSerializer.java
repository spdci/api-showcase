package com.ahi.sbl.config;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.google.protobuf.Any;
import com.googlecode.protobuf.format.JsonFormat;
import com.hubspot.jackson.datatype.protobuf.ProtobufSerializer;

public class BirthInfoSerializer extends ProtobufSerializer<Any> {
	private static final long serialVersionUID = 1L;
 

	public BirthInfoSerializer() {
		super(Any.class);
	}

	@Override
	public void serialize(Any message, JsonGenerator gen, SerializerProvider serializers)
			throws IOException {
		gen.writeRawValue(new JsonFormat().printToString(message));
	}
}

package com.ahi.sbl.config;

import java.io.IOException;

import com.google.protobuf.AbstractMessage.Builder;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Struct;
import com.google.protobuf.util.JsonFormat;

public class ProtobuffUtil {

	public static String toJson(MessageOrBuilder messageOrBuilder) {
		try {
			return JsonFormat.printer().omittingInsignificantWhitespace().print(messageOrBuilder);
		} catch (Exception e) {
			return "";
		}

	}

	@SuppressWarnings("unchecked")
	public static <T extends Message> T fromJson(String json, Class<T> clazz) throws IOException {
		Builder<?> builder = null;
		try {
			builder = (Builder<?>) clazz.getMethod("newBuilder").invoke(null);

		} catch (Exception e) {
			return null;
		}
		JsonFormat.parser().ignoringUnknownFields().merge(json, builder);
		return (T) builder.build();
	}

	@SuppressWarnings("unchecked")
	public static Message fromJson(String json) throws IOException {
		Builder structBuilder = Struct.newBuilder();
		JsonFormat.parser().ignoringUnknownFields().merge(json, structBuilder);
		return structBuilder.build();
	} 

 
}

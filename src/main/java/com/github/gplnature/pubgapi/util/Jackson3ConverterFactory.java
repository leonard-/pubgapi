package com.github.gplnature.pubgapi.util;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;
import tools.jackson.databind.JavaType;
import tools.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

public final class Jackson3ConverterFactory extends Converter.Factory {

    private static final MediaType MEDIA_TYPE = MediaType.get("application/json; charset=UTF-8");

    private final ObjectMapper mapper;

    private Jackson3ConverterFactory(ObjectMapper mapper) {
        if (mapper == null) throw new NullPointerException("mapper == null");
        this.mapper = mapper;
    }

    public static Jackson3ConverterFactory create(ObjectMapper mapper) {
        return new Jackson3ConverterFactory(mapper);
    }

    @Override
    public Converter<ResponseBody, ?> responseBodyConverter(
            Type type,
            Annotation[] annotations,
            Retrofit retrofit) {

        JavaType javaType = mapper.constructType(type);

        return (Converter<ResponseBody, Object>) body -> {
            try (InputStream is = body.byteStream()) {
                return mapper.readValue(is, javaType);
            }
        };
    }

    @Override
    public Converter<?, RequestBody> requestBodyConverter(
            Type type,
            Annotation[] parameterAnnotations,
            Annotation[] methodAnnotations,
            Retrofit retrofit) {

        return (Converter<Object, RequestBody>) value -> {
            byte[] bytes = mapper.writeValueAsBytes(value);
            return RequestBody.create(bytes, MEDIA_TYPE);
        };
    }
}

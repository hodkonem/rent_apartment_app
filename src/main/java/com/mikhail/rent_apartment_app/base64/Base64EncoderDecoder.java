package com.mikhail.rent_apartment_app.base64;

import java.util.Base64;

public class Base64EncoderDecoder {

    public static String encodeBase64(String value) {
        Base64.Encoder encoder = Base64.getEncoder();
        return encoder.encodeToString(value.getBytes());
    }

    public static String decoderBase64(String value) {
        Base64.Decoder decoder = Base64.getDecoder();
        return new String(decoder.decode(value));
    }
}

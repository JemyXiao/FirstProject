package com.recruit.common.mail;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;

/**
 * @author jmx
 */
public class PassWordDecoder {

    public static String decode(String password) throws IOException {
        byte[] ret = (new BASE64Decoder()).decodeBuffer(password);
        return new String(ret);
    }
    public static String encode(String password) throws IOException {
        return (new BASE64Encoder()).encodeBuffer(password.getBytes());
    }
}
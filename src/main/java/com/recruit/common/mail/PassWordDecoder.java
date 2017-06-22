package com.recruit.common.mail;

import sun.misc.BASE64Decoder;

import java.io.IOException;

/**
 * @author jmx
 */
public class PassWordDecoder {
    public static String decode(String password) throws IOException {
        byte[] ret = (new BASE64Decoder()).decodeBuffer(password);
        return new String(ret);
    }
}
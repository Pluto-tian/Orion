package com.Pluto.E_Commerce_Platform.utils;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author Hoaer
 * @version 1.0
 */
public class MD5Utils {
    public static String md5(String password){
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5.update(password.getBytes());
            return new BigInteger(1,md5.digest()).toString(16);
        }catch (NoSuchAlgorithmException e){
            e.printStackTrace();
        }
        return null;
    }
}

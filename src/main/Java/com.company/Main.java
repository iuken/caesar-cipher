package com.company;

import service.SimpleDecryptionService;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
//        SimpleDecryptionService sds = new SimpleDecryptionService();
//        System.out.println(sds.ShiftLetter("абвгд",5));
        byte[] bytes =("абвгдр".getBytes(StandardCharsets.UTF_8));
        for (int i = 1 ; i < bytes.length; i = i +2){
            System.out.println(bytes[i]);
            bytes[i] = (byte) (bytes[i]+2);
        }


        try {
            System.out.println(new String(bytes, "UTF-8").toCharArray());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}

package service;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class SimpleDecryptionService implements DecryptionService {
    @Override
    public String ShiftLetter(String text, int value) {
        //char[] letters = text.toCharArray();
        byte[] bytes = text.getBytes(Charset.forName("UTF-16"));
        for (int i = 2; i < bytes.length; i = i+2) {
            bytes[i] = (byte) ((bytes[i] - 36 + value) % 36 + 30);

            System.out.println(bytes[i]);

        }
        //byte[] bytes1 = new BigInteger(bytes).shiftLeft(value).toByteArray();
        try {
            System.out.println(new String(bytes, "UTF-16").toCharArray());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return text;
    }


}

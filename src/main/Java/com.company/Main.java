package com.company;

import com.company.repository.SimpleFileRepository;
import com.company.service.SimpleDecryptionService;

public class Main {
    public static void main(String[] args) {
        SimpleFileRepository sfr = new SimpleFileRepository();
        SimpleDecryptionService sds = new SimpleDecryptionService();
        String text = sfr.readFileFromResources("cipher_text.txt");

        for (int i = 0; i < 33; i++) {
            System.out.println(sds.DecryptString(text, i));
            System.out.println();
        }
    }
}

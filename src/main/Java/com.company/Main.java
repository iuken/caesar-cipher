package com.company;

import com.company.repository.SimpleFileRepository;
import com.company.service.SimpleDecryptionService;

public class Main {
    public static void main(String[] args) {
        SimpleDecryptionService sds = new SimpleDecryptionService();
        SimpleFileRepository sfr = new SimpleFileRepository();
        String filePath = "cipher_text.txt";
        String text = sfr.readFileFromResources(filePath);
        for (int i = 0; i < 33; i++) {
            System.out.println(sds.DecryptString(text, i));
            System.out.println();
        }
    }
}

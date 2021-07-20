package com.company.service;

public class SimpleDecryptionService implements DecryptionService {

    private static String upperCaseAlphabet = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
    private static String lowerCaseAlphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";

    private char ShiftLetters(char letter, int key) {
        boolean isUpperCase = Character.isUpperCase(letter);
        int index = -1;
        if (!Character.isLetter(letter)) {
            return letter;
        }
        if (isUpperCase) {
            index = upperCaseAlphabet.indexOf(letter);
            letter = upperCaseAlphabet.charAt((index + key) % 33);
        } else {
            index = lowerCaseAlphabet.indexOf(letter);
            letter = lowerCaseAlphabet.charAt((index + key) % 33);
        }
        return letter;
    }

    public String DecryptString(String text, int key) {
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = this.ShiftLetters(chars[i], key);
        }
        return String.valueOf(chars);
    }
}


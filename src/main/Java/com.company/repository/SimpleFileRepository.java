package com.company.repository;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class SimpleFileRepository implements FileRepository {
    @Override
    public boolean createFile(String path, String name) {
//        File dir = new File(getClass().getResource("/").getPath() + path);
//        File file = new File(dir.getPath() + File.separator + name);
//        try {
//            return file.createNewFile();
//        } catch (IOException e) {
            return false;
//        }
    }

    @Override
    public String readFileFromResources(String fileName) {
        StringBuilder line = new StringBuilder();
//        int readBytes;
//        try (FileInputStream fileInputStream = new FileInputStream("src/main/resources/" + fileName)) {
//            while ((readBytes = fileInputStream.read()) != -1) {
//                line.append((char) readBytes);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        return String.valueOf(line);
    }
}

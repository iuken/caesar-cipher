package com.company.repository;

public interface FileRepository {

    boolean createFile(String path, String name);

    String readFileFromResources(String fileName);

}

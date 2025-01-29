package org._01_facade.ex02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class FileDeleter {
    public void deleteFile(String filePath)
            throws IOException {
        Files.delete(Paths.get(filePath));
    }
}
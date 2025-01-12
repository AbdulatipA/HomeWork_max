package org.example.searchFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        MyFileVisitor myFileVisitor = new MyFileVisitor();
        Path path = Paths.get("C:\\Users\\PC\\IdeaProjects\\HomeWork\\src\\main\\java\\org\\example\\searchFiles\\img");

        try {
            Files.walkFileTree(path, myFileVisitor);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}



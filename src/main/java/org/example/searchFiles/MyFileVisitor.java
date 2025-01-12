package org.example.searchFiles;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class MyFileVisitor implements FileVisitor<Path> {
    private final String fileName = "avatarID122";

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {

        if(file.getFileName().toString().startsWith(this.fileName) && ImageIO.read(file.toFile()) != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(
                    "Название: " + file.getFileName() + '\n' +
                    "Путь к изображению: " + file.toAbsolutePath() + '\n'
            );
            System.out.println(stringBuilder);
        }
        return FileVisitResult.CONTINUE;

    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        return FileVisitResult.TERMINATE;
    }
}



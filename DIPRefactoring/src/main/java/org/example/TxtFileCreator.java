package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TxtFileCreator implements FileCreator {

    @Override
    public void createFile(String content, String fileName) {
        try (
                BufferedWriter writer = new BufferedWriter
                        (new FileWriter(fileName + ".txt"))
        ) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

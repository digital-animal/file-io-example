package com.zahid.fileio;

import java.io.FileWriter;

public class FileWriterExample {
    public static void main(String[] args) {

        try (
            FileWriter fr = new FileWriter("src/main/resources/test.txt")
        ) {
            String text = "Learn Java Programming";
            fr.write(text);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

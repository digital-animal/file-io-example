package com.zahid.fileio;

import java.io.FileReader;

public class FileReaderExample {
    public static void main(String[] args) {

        try (
            FileReader fr = new FileReader("src/main/resources/test.txt")
        ) {
            int x;
            while((x = fr.read()) != -1 ) {
                System.out.print((char)x);
            }
            System.out.println();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

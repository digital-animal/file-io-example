package com.zahid.csv;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class CSVFileReader {
    public static void main(String[] args) {
        String srcFile = "src/main/resources/records.csv";
        String destFile = "src/main/resources/logbook.csv";

        try (
            FileReader fr = new FileReader(srcFile);
            BufferedReader br = new BufferedReader(fr);
    
            FileWriter fw = new FileWriter(destFile);
            BufferedWriter bw = new BufferedWriter(fw);
        ) {
            String line;
            String name;
            String dept;
            String email;
            String output;
            while((line = br.readLine()) != null) {
                String[] row = line.split(",");
                // System.out.println(row);
                System.out.println(Arrays.toString(row));
                name = row[1];
                dept = row[4];
                email = row[5];
                output = String.format("%s,%s,%s\n", name, dept, email);
                bw.write(output);
            }
            
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

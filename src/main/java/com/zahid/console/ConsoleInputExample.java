package com.zahid.console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleInputExample {
    public static void main(String[] args) {
        try (
            InputStreamReader input = new InputStreamReader(System.in); // converting System.in object to Reader object
            BufferedReader reader = new BufferedReader(input);
        ) {
            String text;
            do
            {
                text = reader.readLine();
                text = text.toUpperCase();
                System.out.println(text);
            } while (!text.equalsIgnoreCase("quit"));
            
        } catch (IOException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


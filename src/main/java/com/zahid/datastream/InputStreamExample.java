package com.zahid.datastream;

import java.io.*;

public class InputStreamExample {
    public static void main(String[] args) {
        String sourceFile = "src/main/resources/dout.txt";

        try {
            DataInputStream dis = new DataInputStream(new FileInputStream(sourceFile));
            int intValue = dis.readInt();
            double doubleValue = dis.readDouble();
            boolean booleanValue = dis.readBoolean();
            long longValue = dis.readLong();
            System.out.println(intValue);
            System.out.println(doubleValue);
            System.out.println(booleanValue);
            System.out.println(longValue);

            dis.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

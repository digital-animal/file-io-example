package com.zahid.datastream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamExample {
    public static void main(String[] args) {
        String destFile = "src/main/resources/dout.txt";
        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(destFile));
            dos.writeInt(152);
            dos.writeDouble(4.56);
            dos.writeBoolean(true);
            dos.writeLong(Long.MAX_VALUE);

            dos.flush();
            dos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

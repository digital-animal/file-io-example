package com.zahid.file;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class FileFilterExample {
    public static void main(String[] args) throws IOException {
        
        // File home = new File("C:\\Users\\zahid\\Desktop"); // windows
        File home = new File("/home/zahid/Desktop/"); // ubuntu
        // File home = new File("."); // ubuntu

        if(!home.exists()) {
            System.out.println("Directory does not exist");
            return;
        }
        if(!home.isDirectory()) {
            System.out.println("Provided value is not a directory");
            return;
        }

        FileFilter jpgFilter = new FileFilter() {
            @Override
            public boolean accept(File file) {
                if(file.getName().endsWith(".jpg"))
                {
                    return true;
                }
                return false;
            }
        };

        FileFilter txtFilter = new FileFilter() {
			@Override
			public boolean accept(File file) {
                if(file.getName().endsWith(".txt")) {
                    return true;
                }
				return false;
			}
        };

        FileFilter mdFilter = new FileFilter() {
			@Override
			public boolean accept(File file) {
                if(file.getName().endsWith(".md")) {
                    return true;
                }
				return false;
			}
        };

        // image filter
        System.out.println("# Pictures: ");
        File[] listPictures = home.listFiles(jpgFilter);
        for(File file:listPictures)
        {
        //    System.out.println(file.getPath());
            System.out.println(file.getName());
        }
        System.out.println();

        // text filter
        System.out.println("# Text Files: ");
        File[] listTextFiles = home.listFiles(txtFilter);

        for(File file:listTextFiles)
        {
        //    System.out.println(file.getPath());
            System.out.println(file.getName());
        }
        System.out.println();

        // md filter
        System.out.println("# Markdown Files: ");
        File[] mdList = home.listFiles(mdFilter);

        for(File file:mdList)
        {
        //    System.out.println(file.getPath());
            System.out.println(file.getName());
        }
        System.out.println();
    }
}

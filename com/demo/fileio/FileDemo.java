package com.demo.fileio;


import java.io.File;
import java.io.IOException;

// File represents a path not the contents
public class FileDemo {

    public static void main(String[] args) throws  IOException{
        printAllPaths();
    }

    public static void printAllPaths() throws IOException {
        File f = new File("com/demo/fileio/para.txt");
        System.out.println("path " + f.getPath());
        System.out.println("absolute path " + f.getAbsolutePath());
        System.out.println("canonical path " + f.getCanonicalPath());
        System.out.println("absolute_file " + f.getAbsoluteFile());
        System.out.println("absolute_file " +new File("testDir").mkdir());
    }
}

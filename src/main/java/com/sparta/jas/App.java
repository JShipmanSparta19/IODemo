package com.sparta.jas;

import java.io.*;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        try {
            File myFile = new File("C:\\Users\\TECH-W92\\Engineering19\\Week6\\Day4\\IODemo\\resources\\General_Kenobi");
            Writer outputStream = new FileWriter(myFile);
            char[] outputArray = new char[]{'H','e','l','l','o',' ','T','h','e','r','e'};
            System.out.println(outputArray);
            outputStream.write(outputArray);
            System.out.println(myFile.length());
            readFile(myFile);
            getFiles("C:\\Users\\TECH-W92\\Engineering19\\Week6\\Day4\\IODemo\\resources");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readFile(File myFile){
        try {
            Reader reader = new FileReader(myFile);
            char[] chars = new char[(int)myFile.length()];
            reader.read(chars);
            System.out.println(Arrays.toString(chars));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void getFiles(String PATH){
        File file = new File(PATH);
        String[] names = file.list();
        System.out.println(Arrays.toString(names));
    }
}

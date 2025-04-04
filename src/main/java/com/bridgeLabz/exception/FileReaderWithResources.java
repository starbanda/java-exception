package com.bridgeLabz.exception;

import java.io.*;

public class FileReaderWithResources {
    public static void main(String[] args) {
        String fileName = "D:\\bridgelabz-workspace\\java-exceptions\\java-exceptions\\src\\main\\java\\com\\bridgeLabz\\exceptions\\info.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            // Read and print the first line
            String firstLine = reader.readLine();
            if (firstLine != null) {
                System.out.println("First line: " + firstLine);
            } else {
                System.out.println("File is empty.");
            }
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}


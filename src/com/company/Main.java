package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        // Паттерн, что прячет весь код за "фасад"
        FileReadFacade fileReadFacade = new FileReadFacade();

        System.out.println(fileReadFacade.read("text.txt"));

    }
}

class FileReadFacade {
    String read(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        StringBuilder builder = new StringBuilder();
        int i = 0;
        while ( (i = reader.read()) != -1){
            builder.append((char) i);
        }
        return builder.toString();
    }
}

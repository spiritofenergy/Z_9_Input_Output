package org.example;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        char x = (char)System.in.read();
        char operator = (char)System.in.read();
        char y = (char)System.in.read();
        int xValue = x - 48;
        int yValue = x - 48;

        System.out.println("=");
        if (operator == '+'){
            System.out.println(xValue + yValue);
        }else  if(operator == '-'){
            System.out.println(xValue - yValue);
        }else
            System.out.println(xValue * yValue);
    }
}
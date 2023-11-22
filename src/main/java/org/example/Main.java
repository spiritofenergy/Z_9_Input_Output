package org.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //Запись в файл
        InputStream stream = new FileInputStream("addText.txt");
        Scanner scanner = new Scanner(stream);
        int x = scanner.nextInt();
        char op = scanner.next().charAt(0);
        int y = scanner.nextInt();
        PrintWriter writer = new PrintWriter("outText.txt");

        if(op == '*'){
            writer.println("Result");
            writer.println("is ...");
            writer.println(x * y);
            System.out.println(x * y);
        }
        writer.close();

    }
}

/*
*     //Запись в файл
        InputStream stream = new FileInputStream("addText.txt");
        Scanner scanner = new Scanner(stream);
        int x = scanner.nextInt();
        char op = scanner.next().charAt(0);
        int y = scanner.nextInt();
        PrintWriter writer = new PrintWriter("outText.txt");

        if(op == '*'){
            writer.println("Result");
            writer.println("is ...");
            writer.println(x * y);
            System.out.println(x * y);
        }
        writer.close();
* */

/*     // Калькулятор из файла
        InputStream stream = new FileInputStream("addText.txt");
        Scanner scanner = new Scanner(stream);
        int x = scanner.nextInt();
        char op = scanner.next().charAt(0);
        int y = scanner.nextInt();

        if(op == '*'){
            System.out.println(x * y);
        }*/

/*    PrintStream err = System.err;
    PrintStream out = System.out;

        out.println("Hello");
                out.println("World");
                err.println("Hanna");
                out.println("opus");
                err.println("Error");*/




/*
     char x = (char)System.in.read();
        char operator = (char)System.in.read();
        char y = (char)System.in.read();
        int xValue = x - 48;
        int yValue = x - 48;
// Try
        System.out.println("=");
        if (…


       /* char x = (char)System.in.read();
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
            System.out.println(xValue * yValue);*/

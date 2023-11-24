package org.example;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
    String page = downloadWebPage("https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY");
      //  System.out.println(page);
        int urlBegin = page.lastIndexOf("url");
        int urlEnd = page.lastIndexOf("}");
        String url = page.substring(urlBegin +6, urlEnd-1);
        try(InputStream in = new URL(url).openStream()){
            Files.copy(in, Paths.get("new_image.jpg"));
        }
        System.out.println("Picture saved");

        int explanationBegin = page.lastIndexOf("explanation");
        int explanationEnd = page.lastIndexOf("hdurl");
        String explanation = page.substring(explanationBegin +13, explanationEnd -2);
        System.out.println(explanation);
    }

    private static String downloadWebPage(String url) throws IOException {
        StringBuilder result = new StringBuilder();
        String line;
        URLConnection urlConnection = new URL(url).openConnection();
        try (
            InputStream is = urlConnection.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is))){
                while ((line = br.readLine()) != null){
                result.append(line);
                        }
        }
        return result.toString();
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

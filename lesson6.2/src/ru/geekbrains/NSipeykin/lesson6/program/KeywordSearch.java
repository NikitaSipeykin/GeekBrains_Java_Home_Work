package ru.geekbrains.NSipeykin.lesson6.program;

import java.io.*;
import java.util.Scanner;

public class KeywordSearch {

    public KeywordSearch() {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        try{
            FileInputStream fis = new FileInputStream("thirdText.txt");
            int b;
            int numberOfMatches = 0;
            String word2 = new String();
            while ((b = fis.read()) != -1) {
                if((char)b !=' '){
                    word2 = word2+(char)b;
                }else {
                    if(word2.equals(word)) {
                        numberOfMatches++;
                    }else word2 = new String();
                }
            }
            System.out.println(numberOfMatches);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
package ru.geekbrains.NSipeykin.lesson6.program;

import java.io.*;

public class Assembler {
    InputStream in;

    public Assembler() {
        try {
            FileInputStream fis1 = new FileInputStream("text\\firstText.txt");
            FileInputStream fis2 = new FileInputStream("text\\secondText.txt");
            FileOutputStream fos = new FileOutputStream("thirdText.txt", true);
            int b;
            while ((b = fis1.read()) != -1) {
                fos.write((char)b);
            }
            while ((b = fis2.read()) != -1) {
                fos.write((char)b);
            }

        } catch (IOException e){
            e.printStackTrace();
        }
    }

}

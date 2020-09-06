package ru.geekbrains.lesson3;

import java.util.Random;
import java.util.Scanner;

public class Main {
    /* 1. Написать программу, которая загадывает случайное число от 0 до 9,
        и пользователю дается 3 попытки угадать это число. При каждой попытке
        компьютер должен сообщить больше ли указанное пользователем число чем
        загаданное, или меньше. После победы или проигрыша выводится запрос
        – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).*/
    public static void main(String[] args) {
        System.out.println("Ваша задача угадать число!");
        gameTry(makeANumber(),range());
    }
    static void gameTry(int b,int c){
        int tryCount = 3; //колличество попыток
        while (true){
            System.out.println("Угадайте число от 0 до "+c);
            int a = playerNumber();
            if(a == b){
                System.out.println("Вы угадали!");
            }
            else if(a > b){
                tryCount -=1;
                System.out.println("Загаданное число меньше :(\nУ вас осталось "+tryCount+" попытки");

                if (tryCount == 0){
                    System.out.println("Вы проиграли!");
                }
                else{
                    System.out.println("Желаете продолжить?\n1 = да\n0 = нет");
                    if(playerNumber()==1){
                        System.out.println();
                    }else
                        System.out.println("игра окончена");
                       break;
                }
            }else {
                tryCount -=1;
                System.out.println("Загаданное число больше :(\nУ вас осталось "+tryCount+" попытки");
                if (tryCount == 0){
                    System.out.println("Вы проиграли!");
                }
                else{
                    System.out.println("Желаете продолжить?\n1 = да\n0 = нет");
                    if(playerNumber()==1){
                        System.out.println();
                    }else
                        System.out.println("игра окончена");
                        break;
                }
            }
        }
    }
    static int playerNumber(){
    int  a = scanner.nextInt();//пользователь вводит число
        return a;
    }
    static int makeANumber(){     //создает случайное число от 0 до 9
        Random random = new Random();
        int x = random.nextInt(range());
        return x;
    }
    static int range(){
        int range = 9; //колличество чисел в игре
        return range;
    }
    static Scanner scanner = new Scanner(System.in);
}

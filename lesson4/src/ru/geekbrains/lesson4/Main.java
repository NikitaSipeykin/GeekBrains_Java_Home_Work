package ru.geekbrains.lesson4;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static char[][] map;
    static final int SIZE = 3;

    static final char DOT_X = 'X';
    static final char DOT_O = 'O';
    static final char DOT_EMPTY = '.';

    static void initMap(){     //создает "чистое" игровое поле
        map = new char[SIZE][SIZE];
        for(int i = 0;i<map.length;i++){
            for (int j = 0; j < map[i].length;j++){
                map[i][j]= DOT_EMPTY;
            }
        }
    }
    static void printMap(){  //отображает в консоли массив в том состоянии в котором он находится в данный момент
        for(int i = 0;i<= SIZE;i++){   //сетка по горизонтали
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i = 0; i < SIZE;i++){  //проверяет нахождение в массиве и рисует строчки сетки
            System.out.print((i+1)+" ");
            for (int j = 0; j <SIZE; j++){
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void humanTurn(){   //ход человека
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        do{
            System.out.println("Введите координаты в формате X Y");
            x = scanner.nextInt()-1;
            y = scanner.nextInt()-1;
        }while(!isCellValid(x,y));
        map[y][x]= DOT_X;
    }
    static void aiTurn(){   //ход и.и.
        Random random = new Random();
        int x;
        int y;
        do{
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        }while(!isCellValid(x,y));
        x=x+1;  //костыли исправляющие вывод в консоль координат хода и.и.
        y=y+1;  //костыли
        System.out.println("Компьютер походил "+x+" и "+y);
        x=x-1;  //костыли
        y=y-1;  //костыли
        map[y][x]= DOT_O;
    }
    static boolean isWinner(char symb){ //проверка победы
        if (map[0][0] == symb && map[0][1] == symb && map[0][2] == symb||
                map[1][0] == symb && map[1][1] == symb && map[1][2] == symb||
                map[2][0] == symb && map[2][1] == symb && map[2][2] == symb||
                map[0][0] == symb && map[1][0] == symb && map[2][0] == symb||
                map[0][1] == symb && map[1][1] == symb && map[2][1] == symb||
                map[0][2] == symb && map[1][2] == symb && map[2][2] == symb||
                map[0][0] == symb && map[1][1] == symb && map[2][2] == symb||
                map[2][0] == symb && map[1][1] == symb && map[0][2] == symb){
            return true;
        }
        return false;
    }
    static boolean isMapFull(){   //проверка заполнености игрового поля
        for (int i = 0;i < map.length;i++){
            for(int j=0; j< map.length;j++){
                if( map[i][j]==DOT_EMPTY){  //если есть точки выводится false и игра продолжается
                    return false;
                }
            }
        }
        return true;    //в противном случае вывести true и игра окончена ничьей
    }
    static boolean isCellValid(int x,int y){  //проверка, что введен координат пустой ячейки игрового поля
        if (x < 0|| x >= SIZE||y < 0|| y >= SIZE){
            return false;
        }
        if (map[y][x]==DOT_EMPTY){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {    //игровой процесс
        initMap();
        printMap();

        while(true){
            humanTurn(); //ход человека
            printMap();
            if(isWinner(DOT_X)){
                System.out.println("Игра окончена!");
                System.out.println("Победил человек!");
                break;
            }
            if(isMapFull()){
                System.out.println("Игра окончена!");
                System.out.println("Ничья");
                break;
            }
            aiTurn();    //ход и.и.
            printMap();
            if(isWinner(DOT_O)){
                System.out.println("Игра окончена!");
                System.out.println("Победил T-1000!");
                break;
            }
            if(isMapFull()){
                System.out.println("Игра окончена!");
                System.out.println("Ничья");
                break;
            }
        }
    }
}

package ru.geekbrains.lesson2;

import java.util.Arrays;
import java.util.Random;

public class Main {


        /*1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
         С помощью цикла и условия заменить 0 на 1, 1 на 0;
        2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью
        цикла(-ов) заполнить его диагональные элементы единицами;
        5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
        6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
         если в массиве есть место, в котором сумма левой и правой части массива равны.
         Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница
          показана символами ||, эти символы в массив не входят.
        7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или
        отрицательным), при этом метод должен сместить все элементымассива на n позиций. Для усложнения задачи нельзя
        пользоваться вспомогательными массивами.*/


    //first task______________________________________________________
    /*1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
         С помощью цикла и условия заменить 0 на 1, 1 на 0;  */
    static void task1() {
        System.out.println("Задание 1");
        int[] task1 = {1, 0, 1, 0, 0, 1, 0};
        System.out.println(Arrays.toString(task1));
        rollOver(task1);
        System.out.println(Arrays.toString(task1));
    }

    static void rollOver(int a[]){
        for (int locationNumber1 = 0; locationNumber1 < a.length; locationNumber1++) {
            if (a[locationNumber1] == 1) {
                a[locationNumber1] = 0;
            } else {
                a[locationNumber1] = 1;
            }
        }
    }

    //second task_____________________________________________________
    //2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    static void task2(){
        System.out.println("Задание 2");
    int[] task2 = new int[8];
    int locationNumber2 = 0;
        multiplier(task2, locationNumber2);
        System.out.println(Arrays.toString(task2));
    }

    static void multiplier(int a[],int b){
        do {
            a [b] =b*3;
            b++;
        }while(b<a.length);
    }

    //third task______________________________________________________
    //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    static void task3(){
        System.out.println("Задание 3");
        int[] task3 ={1,5,3,2,11,4,5,2,4,8,9,1};
        int locationNumber3 = 0;
        smartMultiplier(task3,locationNumber3);
    }

    static void smartMultiplier(int a[],int b){

        while (b<=a.length) {
            if (a [b] <6){
                while(a [b] <6){
                    a[b] = a[b] * 2;
                }
                b++;
            }

            else if (b<a.length){
                b++;
            }

            if(b==a.length) {
                System.out.println(Arrays.toString(a));
                break;
            }
        }
    }

    //fourth task_____________________________________________________
    //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью
    //цикла(-ов) заполнить его диагональные элементы единицами;
    static void task4(){
        System.out.println("Задание 4");
        int[][]task4 = new int [6][6];
        diagonalWithOnes(task4);
        printSquare(task4);
    }

    static void printSquare(int [][]square){
        for (int i=0;i<square.length;i++){
            System.out.println(Arrays.toString(square[i]));
        }
    }

    static void diagonalWithOnes(int [][]square){
        for(int i=0;i<square.length;i++){
            square[i][i]=1;
            square[i][square[1].length - 1-i]=1;
        }
    }

    //fifth task______________________________________________________
    // 5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
    static void task5() {
        System.out.println("Задание 5");
        int[] task5 = new int[9];
        int locationNumber = 0;
        randomArray(task5,locationNumber);
        System.out.println("Первоначальные значения массива от 0 до 9");
        System.out.println(Arrays.toString(task5));//вывести первоначальные значения массива от 0 до 9
        minOrMax(task5);
    }

    static void minOrMax(int a[]){
        int max = 0;
        int min = 9;
        for(int x = 0;x<a.length;x++){
            if (a[x]<min){
                min=a[x];
            }
        }

        for(int x = 0;x<a.length;x++){
            if (a[x]>max){
                max=a[x];
            }
        }
        System.out.println("Минимальное значение = "+min+"\nМаксимальное значение = "+max);

    }

    static void randomArray(int arr[],int l){
        do {
            arr [l] =randomNumber();
            l++;
        }while(l<arr.length);
    }

    static int randomNumber(){
        Random random = new Random();
        int x = random.nextInt(9);
        return x;
    }
//6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
//если в массиве есть место, в котором сумма левой и правой части массива равны.
//Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница
//показана символами ||, эти символы в массив не входят.

//7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или
//отрицательным), при этом метод должен сместить все элементымассива на n позиций. Для усложнения задачи нельзя
//пользоваться вспомогательными массивами.

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

    }
}

package ru.geekbrains.lesson2;

import java.util.Arrays;

public class lesson2 {

    public static void main(String[] args) {

     //first task________________________________________________________
        System.out.println("Задание 1");

        int[] task1 ={1,0,1,0,0,1,0};

        System.out.println(Arrays.toString(task1));

        for(int locationNumber1 = 0; locationNumber1 < task1.length; locationNumber1++) {
            if(task1[locationNumber1]==1){
                task1[locationNumber1]=0;
            }
            else{
                task1[locationNumber1]=1;
            }
        }
        System.out.println(Arrays.toString(task1));

     //second task_____________________________________________________
        System.out.println("Задание 2");

        int[] task2 = new int[8];
        int locationNumber2 = 0;
        do {
            task2 [locationNumber2] =locationNumber2*3;
            locationNumber2++;
        }while(locationNumber2<task2.length);
        System.out.println(Arrays.toString(task2));

        //third task_____________________________________________________
       System.out.println("Задание 3");

        int[] task3 ={1,5,3,2,11,4,5,2,4,8,9,1};
        int locationNumber3 = 0;

        while (locationNumber3<=task3.length) {

            if (task3 [locationNumber3] <6){
                while(task3 [locationNumber3] <6){
                    task3[locationNumber3] = task3[locationNumber3] * 2;
                }
                locationNumber3++;
            }
            else if (locationNumber3<task3.length){
                locationNumber3++;
            }
            if(locationNumber3==task3.length) {
                System.out.println(Arrays.toString(task3));
                break;
            }
        }
        //fourth task________________________________________________________
        System.out.println("Задание 4");

        int[][]task4 = new int [6][6];
        //LocationNumber4

        int x = 0;

        for (int y = 0; y <task4.length; y++) {
           if(y<task4.length){
               while (x < task4.length) {
                   if (x == y) {
                       task4[x][y] = 1;
                       x++;
                   } else {
                       task4[x][y] = 0;
                       x++;
                   }
               }
            }
           else {
               y++;
           }

        }

    }
}

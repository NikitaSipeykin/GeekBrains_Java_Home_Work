package ru.geekbrains.lesson2;

import java.util.Arrays;
//1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью
//цикла и условия заменить 0 на 1, 1 на 0;
//2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
//3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
//4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью
// цикла(-ов) заполнить его диагональные элементы единицами;
//5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
//6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть
//true, если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры: checkBalance
//([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами
//||, эти символы в массив не входят.
//7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным,
//или отрицательным), при этом метод должен сместить все элементымассива на n позиций. Для усложнения задачи
//нельзя пользоваться вспомогательными массивами.

public class lesson2 {

    private static void swap(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0){
                arr[i] = 1;
            }else{
                arr[i]=0;
            }
        }
    }

    private static void fill(int[] arr){
        for(int i = 0; i < arr.length; i++){
            arr[i] = i * 3;
        }
    }

    private static void raise(int[] arr){
        for (int i = 0; i <arr.length; i++){
            if(arr[i] < 6){
                arr[i] *= 2;                                                                                            // важно: умножить равно, по другому никак!
            }
        }
    }

    private static int findMin(int[] arr){
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(min > arr[i])
                min = arr[i];
        }
        return min;
    }

    private static int findMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++){
            if(max < arr[i])
                max = arr[i];
        }
        return max;
    }

    private static void diag(int[][] arr){
        for (int i = 0; i < arr.length; i++){
            arr[i][i] = 1;
            arr[i][arr.length - 1 -i] = 1;
        }
    }

    private static boolean checkBalance(int[] arr){
        int left = 0;
        for (int i = 0; i < arr.length - 1; i++){
            left =+ arr[i];
            int right = 0;
            for (int j = i + 1; j < arr.length; j++){
                right =+ arr[j];
            }
            if (left == right)
                return true;
        }
        return false;
    }

    private static boolean checkBalance1(int[] arr){                                                                    //оптимизация метода checkBalance
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];                                                                                              //важно сначала + потом =
        }
        if(sum % 2 != 0) return false;
        int left = 0;
        for(int i = 0; i < arr.length; i++){
            left += arr[i];
            sum -= arr[i];
            if(sum == left)return true;
       }
        return false;
    }

    private static void shift(int[] arr, int n){                                                                        //*** костыльный вариант реализации 8 задания
        boolean dir;
        if(n < 0){                                                                                                      //*** определяем направление
            dir = true;
            n = -n;                                                                                                     //*** инвертируем значение направления. это нужно чтобы в цикле бежать
                                                                                                                        // в положительную сторону
        }
        else{
            dir = false;
        }
        n %= arr.length;                                                                                                //*** упращает сдвиги привышающие длинну массива, -> n=6 length=4 ==> n=2
        int last = arr.length - 1;                                                                                      //*** просто переменная с значением arr.length - 1
        for (int i = 0; i < n; i++) {                                                                                   //*** n теперь всегда положительная и создавать отдельный метод
                                                                                                                        // для расчета отрицательных - не нужно
            int temp = (dir) ? arr[0] : arr[last];                                                                      //*** вытаскивает в зависимости от dir первое или последнее значение
                                                                                                                        // из массива
            for (int j = 0; j < last; j++) {
                if(dir){
                    arr[j] = arr[j + 1];
                }
                else{
                    arr[last - j] = arr[last - j - 1];
                }
            }
           if (dir){
               arr[last] = temp;
           }
           else{
               arr[0] = temp;
           }
        }
    }

    private static void shift2(int[] arr, int n){                                                                       //выполняет в точности те же функции, в той же последовательности,
                                                                                                                        // что и метод shift, но записан более красиво и компактно
        boolean dir = n < 0;
        if (dir)
            n = - n;
        n %= arr.length;
        int last = arr.length - 1;
        for (int i = 0; i < n; i++) {
            int temp = (dir) ? arr[0] : arr[last];
            if (dir){
                System.arraycopy(arr, 1, arr, 0, last);
                arr[last] = temp;
            }
            else {
                System.arraycopy(arr, 0, arr, 1, last);
                arr[0] = temp;
            }
        }
    }

    private static void shift3(int[] arr, int n){
        boolean dir = n < 0;
        if (dir)
            n = - n;
        n %= arr.length;

        int shift = (dir) ? arr.length - n : n;
        for (int i = 0; i < shift; i++) {
            int temp = arr[arr.length - 1];
            System.arraycopy(arr, 0, arr, 1, arr.length - 1);
            arr[0] = temp;
        }
    }

    public static void main(String[] args) {

        //1. Задать целочисленный массив, состоящий из элементов 0 и 1.
        // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        // С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int[] arr0 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(arr0));
        swap(arr0);
        System.out.println(Arrays.toString(arr0));
        System.out.println("task_1_____________________________________________________");

        //2. Задать пустой целочисленный массив размером 8.
        // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21
        int[] arr1 = new int[8];
        fill(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println("task_2_____________________________________________________");

        //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
        // пройти по нему циклом, и числа меньшие 6 умножить на 2;
        int [] arr2 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println(Arrays.toString(arr2));
        raise(arr2);
        System.out.println(Arrays.toString(arr2));
        System.out.println("task_3_____________________________________________________");

        //4. Создать квадратный двумерный целочисленный массив
        // (количество строк и столбцов одинаковое), и с помощью
        //цикла(-ов) заполнить его диагональные элементы единицами;
        System.out.println(Arrays.toString(arr2));
        System.out.println("min = " + findMin(arr2));
        System.out.println("min = " + findMax(arr2));
        System.out.println("task_4_____________________________________________________");

        //5. ** Задать одномерный массив и найти в нем минимальный
        //и максимальный элементы (без помощи интернета);
        int SIZE = 10;
        int[][] arr3 = new int[SIZE][SIZE];
        diag(arr3);
        for(int i = 0; i <SIZE; i++) {                                                                                  //реализация вывода двумерного массива
            System.out.println(Arrays.toString(arr3[i]));
        }
        System.out.println("task_5_____________________________________________________");

        //6. ** Написать метод, в который передается не пустой одномерный
        // целочисленный массив, метод должен вернуть true, если в массиве
        // есть место, в котором сумма левой и правой части массива равны.
        // Примеры: checkBalance ([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
        // checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами
        //||, эти символы в массив не входят.
        int[] arr4 = {2, 2, 2, 1, 2, 2, 10, 1};
        int[] arr5 = {1, 1, 1, 2, 1};
        int[] arr6 = {1, 4, 3, 7, 8, 6, 1, 3, 5, 6, 1 ,6, 9, 2};

        System.out.print(Arrays.toString(arr4));
        System.out.println(" check balance is - " + checkBalance1(arr4));
        System.out.print(Arrays.toString(arr5));
        System.out.println(" check balance is - " + checkBalance1(arr5));
        System.out.print(Arrays.toString(arr6));
        System.out.println(" check balance is - " + checkBalance1(arr6));
        System.out.println("task_6_____________________________________________________");

        //7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным,
        //или отрицательным), при этом метод должен сместить все элементымассива на n позиций. Для усложнения задачи
        //нельзя пользоваться вспомогательными массивами.

        System.out.println("task_7_____________________________________________________");

    }
}

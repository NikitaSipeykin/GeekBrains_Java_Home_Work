package ru.geekbrains.lesson1;

public class Main {
        //1.Создать пустой проект в IntelliJ IDEA и прописать метод main();
        //2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
        //3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные
        // параметры этого метода;
        // 4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20
        //(включительно), если да – вернуть true, в противном случае – false;
        // 5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль
        // положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.
        // 6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число
        // отрицательное;
        // 7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в
        // консоль сообщение «Привет, указанное_имя!»;
        //8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль. Каждый 4-й
        // год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
// task 1_______________________________________________________________________________________________________________
    public static void main(String[]args)
    {
//task 2________________________________________________________________________________________________________________
        byte b = 127;
        short s = 32767;
        int i = 2147483647;
        long l = 22337205L;
        float f = 3.141592f;
        double d = 1.5;
        boolean bool =  true;
//task 3________________________________________________________________________________________________________________
        float fA =  5.6f;
        float fB =  4f;
        float fC = 6.92f;
        float fD =  2f;
        float task3Result = isCalculate(fA,fB,fC,fD);
        System.out.println("Задание №3");
        System.out.println("a = "+fA+"\nb = "+fB+"\nf = "+fC+"\nd = "+fD);
        System.out.println("task 3 result "+task3Result);

        System.out.println("Задание №4");
        System.out.println(task10and20(7,8));

        System.out.println("Задание №5");
        isPositiveOrNegative(-13);

        System.out.println("Задание №6");
        System.out.println(isNegative(25));

        System.out.println("Задание №7");
        greetings("Аркадий");

        System.out.println("Задание №8");
        System.out.println(ifYearIsLeapOrNot(1994));
    }
    public static float isCalculate (float a, float b, float f, float d)
    {
        //task 3
        return a * (b + (f / d));
    }
//task 4________________________________________________________________________________________________________________
    public static boolean task10and20(int x1, int x2)
    {
        if ((x1+x2)<=20 && (x1+x2)>=10)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
//task 5________________________________________________________________________________________________________________
    public static void isPositiveOrNegative(int x)
    {
        if(x>=0)
        {
            System.out.println("x - положительное число");
        }
        else
        {
            System.out.println("x - отрицательное число");
        }
    }
//task 6________________________________________________________________________________________________________________
    public static boolean isNegative(int z)
    {
        if(z<0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
//task 7________________________________________________________________________________________________________________
    public static void greetings(String name)
    {
        System.out.println("Привет, "+name+"!");
    }
//task 8*_______________________________________________________________________________________________________________
    public static boolean ifYearIsLeapOrNot(int a){
        if(a % 4 == 0 && a % 100 != 0 ||a % 400 == 0){
            return true;
        }
        else {
            return false;
        }
    }
}


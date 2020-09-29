package ru.geekbrains.lesson1;

public class Main {


    //1.Создать пустой проект в IntelliJ IDEA и прописать метод main();
    public static void main(String[]args)
    {
        //2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
        types((byte)127, (short)32767, (int)2147483647, (long)922337205L, (float)3.141592f, (double)1.5, (boolean) true);

        //3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;
        isCalculate(5.6f,4,6.92f,2);

        //4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
        task10and20(7,8);

        //5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.
        isPositiveOrNegativ(-13);

        //6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
        isNegative(25);

        // 7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
        greetings("Аркадий");

        //8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.



    }
    public static void types(byte b,short s,int i,long l,float f,double d,boolean bool)
    {
    }

    public static float isCalculate (float a, float b, float f, float d)
    {
        System.out.println("Задание №3");
        System.out.println("a = "+a+"\nb = "+b+"\nf = "+f+"\nd = "+d);
        return a * (b + (f / d));
    }

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
    public static void isPositiveOrNegativ(int x)
    {
        System.out.println("\nЗадание №5");
        if(x>=0)
        {
            System.out.println("x - положительное число");
        }
        else
        {
            System.out.println("x - отрицательное число");
        }
    }
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
    public static void greetings(String name)
    {
        System.out.println("\nЗадание №7");
        System.out.println("Привет, "+name+"!");
    }

}


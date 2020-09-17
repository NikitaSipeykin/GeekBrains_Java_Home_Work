package ru.geekbrains.lesson6;

public class Main {
          /*1. Создать классы Собака и Кот с наследованием от класса Животное.

            2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие. В качестве параметра каждому
             методу передается величина, означающая или длину препятствия (для бега и плавания), или высоту (для прыжков).

            3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; прыжок: кот 2 м.,
             собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м.).

            4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат в консоль.
            (Например, dog1.run(150); -> результат: run: true)

            5. * Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть 400 м.,
             у другой 600 м.*/

    public static void main(String[] args) {
        Cat cat1 = new Cat("Kuzya");
        Cat cat2 = new Cat("Vasyliy");
        Dog dog1 = new Dog("Sharik");
        Dog dog2 = new Dog("Janik");
        System.out.println("Task 6");

        cat1.run(200);                       //test
        cat1.swim(10);                       //test
        cat1.jumpOverAnObstacle(1f);  //test
        System.out.println();

        cat2.run(300);                       //test
        cat2.swim(10);                       //test
        cat2.jumpOverAnObstacle(1.8f);  //test
        System.out.println();

        dog1.run(450);                     //test
        dog1.swim(9);                     //test
        dog1.jumpOverAnObstacle(1.8f);  //test
        System.out.println();

        dog2.run(500);                     //test
        dog2.swim(12);                     //test
        dog2.jumpOverAnObstacle(0.5f);  //test

    }
}

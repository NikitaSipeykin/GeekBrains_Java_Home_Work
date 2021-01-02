package ru.geekbrains.NSipeykin.lesson5;

import ru.geekbrains.NSipeykin.lesson5.animals.Animals;
import ru.geekbrains.NSipeykin.lesson5.animals.Cat;
import ru.geekbrains.NSipeykin.lesson5.animals.Dog;
import ru.geekbrains.NSipeykin.lesson5.obstacle.Distance;
import ru.geekbrains.NSipeykin.lesson5.obstacle.Obstacle;
import ru.geekbrains.NSipeykin.lesson5.obstacle.Pool;
import ru.geekbrains.NSipeykin.lesson5.obstacle.Wall;

public class Main {

//TODO: 1
// Создать классы Собака и Кот с наследованием от класса Животное.
//TODO: 2
//    Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие. В качестве параметра каждому методу
//    передается величина, означающая или длину препятствия (для бега и плавания), или высоту (для прыжков).
//TODO: 3
//    У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; прыжок: кот 2 м., собака 0.5 м.;
//    плавание: кот не умеет плавать, собака 10 м.).
//TODO: 4
//    При попытке животного выполнить одно из этих действий, оно должно сообщить результат.
//    (Например, dog1.run(150); -> результат: 'Пёсик пробежал!')
//TODO: 5
//            * Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть
//            400 м., у другой 600 м.

    public static void main(String[] args) {

        Animals dog = new Dog("Sharik");
        Cat cat = new Cat("Barseek");

        Obstacle wall = new Wall();
        Obstacle track = new Distance();
        Obstacle pool = new Pool();

        cat.run(track);
        cat.jump(wall);
        cat.swim(pool);

        dog.run(track);
        dog.jump(wall);
        dog.swim(pool);
    }
}

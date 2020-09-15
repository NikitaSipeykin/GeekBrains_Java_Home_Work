package ru.geekbrains.lesson6;

import java.util.Random;

//1. Создать классы Собака и Кот с наследованием от класса Животное.
    //3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; прыжок: кот 2 м.,
    //             собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м.).
    //4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат в консоль.
    //            (Например, dog1.run(150); -> результат: run: true)
public class Cat extends Animal {
     Cat(String name){
         super(name);
    }
    private int distanceRunLimit(){
        Random random = new Random();
        return random.nextInt(300 - 100) + 100;
    }
    private float heightOfTheJumpLimit(){
        Random random = new Random();
        return random.nextFloat() + 0.4f;
    }
        @Override
        protected void run(int distance) {
            int i = distanceRunLimit();
            System.out.println(name+" running distance limit "+i);   // test
            if(distance <= i){
                super.run(distance);
            }
            else {
                System.out.println("Cat "+name+" can't run "+distance+" m ");
            }
            System.out.println();
        }

        @Override
        protected void swim(int distance) {
            System.out.println("Cat "+name+" can't swim");
            System.out.println();
        }

        @Override
        protected void jumpOverAnObstacle(float heightOfTheJump) {
            float i = heightOfTheJumpLimit();
            System.out.println(name+" jump limit "+i);   // test
            if(heightOfTheJump <= i){
                super.jumpOverAnObstacle(heightOfTheJump);
            }
            else {
                System.out.println("Cat "+name+" can't jump "+heightOfTheJump+" m ");
            }
            System.out.println();
        }
    }
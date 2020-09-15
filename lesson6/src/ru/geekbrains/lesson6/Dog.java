package ru.geekbrains.lesson6;
    //1. Создать классы Собака и Кот с наследованием от класса Животное.
    //3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; прыжок: кот 2 м.,
    //             собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м.).
    //4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат в консоль.
    //            (Например, dog1.run(150); -> результат: run: true)
public class Dog extends Animal {
        Dog(String name){
            super(name);
        }
        @Override
        protected void run(int distance) {
            if(distance <= 500){
                super.run(distance);
                System.out.println(name+" run through "+distance+" m ");
            }
            else {
                System.out.println("Dog "+name+" can't run "+distance+" m ");
            }
        }
        @Override
        protected void swim(int distance) {
            if(distance <= 10){
                super.swim(distance);
                System.out.println(name+" swim through "+distance+" m ");
            }
            else {
                System.out.println("Dog "+name+" can't swim "+distance+" m ");
            }
        }
        @Override
        protected void jumpOverAnObstacle(int heightOfTheJump) {
            if(heightOfTheJump <= 0.5){
                super.jumpOverAnObstacle(heightOfTheJump);
                System.out.println(name+" jump over "+heightOfTheJump+" m ");
            }
            else {
                System.out.println("Dog "+name+" can't jump "+heightOfTheJump+" m ");
            }
        }
    }
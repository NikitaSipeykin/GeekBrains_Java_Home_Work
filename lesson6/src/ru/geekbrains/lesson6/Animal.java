package ru.geekbrains.lesson6;

    //2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие. В качестве параметра каждому
    //        методу передается величина, означающая или длину препятствия (для бега и плавания), или высоту (для прыжков).

public class Animal {
    protected String name;

    Animal(String name){
        this.name = name;
    }
    protected void run(int distance){
        System.out.println(name+" run through "+distance);
    }
    protected void swim(int distance){
        System.out.println(name+" swim through "+distance);
    }
    protected void jumpOverAnObstacle(int heightOfTheJump){
        System.out.println(name+" jump over "+heightOfTheJump);
    }
}
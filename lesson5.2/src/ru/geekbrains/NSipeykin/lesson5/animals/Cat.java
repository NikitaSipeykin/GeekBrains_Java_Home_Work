package ru.geekbrains.NSipeykin.lesson5.animals;

import ru.geekbrains.NSipeykin.lesson5.obstacle.Distance;
import ru.geekbrains.NSipeykin.lesson5.obstacle.Obstacle;
import ru.geekbrains.NSipeykin.lesson5.obstacle.Pool;
import ru.geekbrains.NSipeykin.lesson5.obstacle.Wall;

import java.util.Random;

public class Cat extends Animals{

    @Override
    public void jump(Obstacle w) {
        super.jump(w);
    }

    @Override
    public void swim(Obstacle p) {
        System.out.println(name + " can't swim.");
    }

    @Override
    public void run(Obstacle d) {
        super.run(d);
    }

    public Cat(String name) {
        super(name, 2f,200,0);
    }

    private int maxRunDistance(){
        int minRunDistance = 100;
        Random random = new Random(200);
        return minRunDistance + random.nextInt();
    }
}

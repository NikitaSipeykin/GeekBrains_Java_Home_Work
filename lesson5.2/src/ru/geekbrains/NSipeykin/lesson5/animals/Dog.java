package ru.geekbrains.NSipeykin.lesson5.animals;

import ru.geekbrains.NSipeykin.lesson5.obstacle.Distance;
import ru.geekbrains.NSipeykin.lesson5.obstacle.Obstacle;
import ru.geekbrains.NSipeykin.lesson5.obstacle.Pool;
import ru.geekbrains.NSipeykin.lesson5.obstacle.Wall;

public class Dog extends Animals{



    public Dog(String name) {
        super(name,0.5f,500,10);
    }

    @Override
    public void jump(Obstacle w) {
        super.jump(w);
    }

    @Override
    public void swim(Obstacle p) {
        super.swim(p);
    }

    @Override
    public void run(Obstacle d) {
        super.run(d);
    }
}

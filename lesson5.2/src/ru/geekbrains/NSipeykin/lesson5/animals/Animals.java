package ru.geekbrains.NSipeykin.lesson5.animals;

import ru.geekbrains.NSipeykin.lesson5.obstacle.Distance;
import ru.geekbrains.NSipeykin.lesson5.obstacle.Obstacle;
import ru.geekbrains.NSipeykin.lesson5.obstacle.Pool;
import ru.geekbrains.NSipeykin.lesson5.obstacle.Wall;

public abstract class Animals {

    protected final float maxJumpHeight;
    protected final int maxRunDistance;
    protected final int maxSwimDistance;
    protected final String name;

    protected Animals(String name, float maxJumpHeight, int maxRunDistance, int maxSwimDistance) {
        this.name = name;
        this.maxJumpHeight = maxJumpHeight;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;

    }

    public void jump(Obstacle w){
        if(maxJumpHeight >= ((Wall) w).wallHeight) {
            System.out.println(name + " jump over " + ((Wall) w).wallHeight);
        }
        else System.out.println(name + " can't jump over this wall.");
    }

    public void swim(Obstacle p){
        if (maxSwimDistance >= ((Pool) p).swimDistance) {
            System.out.println(name + " swim over " + ((Pool) p).swimDistance);
        }
        else System.out.println(name + " can't swim this distance.");
    }

    public void run(Obstacle d){
        if (maxRunDistance >= ((Distance)d).runDistance) {
            System.out.println(name + " run over " + ((Distance)d).runDistance);
        }
        else System.out.println(name + " can't run this distance.");
    }
}

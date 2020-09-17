package ru.geekbrains.lesson7;

//2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20)

import java.util.Scanner;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public boolean decreaseFood(int n) {
        feedingTime();
        if(food>n){
            food -= n;
            return true;
        }
        else {
            return false;
        }
    }
    public void info() {
        System.out.println("plate: " + food);
    }
    private void feedingTime(){
        if(food<10){
            info();
            Scanner scanner = new Scanner(System.in);
            System.out.println("The plate were almost empty!\nHow much to put in a plate of food?");
            food += scanner.nextInt();
        }
    }
}

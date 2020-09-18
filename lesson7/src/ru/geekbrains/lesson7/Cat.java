package ru.geekbrains.lesson7;

//    3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true
//    4. Считаем, что если коту мало еды в тарелке, то он ее просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы)

public class Cat {
    private String name;
    private int appetite;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public void eat(Plate p) {
        System.out.println(name+" want to eat!");
        if(p.food<appetite){
            System.out.println(name+" meow");
            p.info();
            p.feedingTime();
            boolean satiety = p.decreaseFood(appetite);
            satiety(satiety);
        }
        else {
            boolean satiety = p.decreaseFood(appetite);
            satiety(satiety);
        }
    }
    private boolean satiety(boolean satiety){
        if(satiety == true){
            System.out.println(name+" is full");
            return true;
        }
        else {
            System.out.println(name+" is hungry");
            return false;
        }
    }
}

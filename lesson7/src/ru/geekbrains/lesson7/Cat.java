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
        boolean satiety = p.decreaseFood(appetite);
        if(satiety == true){
            System.out.println(name+" is full");
        }
        else {
            System.out.println(name+" is hungry");
        }
    }
}

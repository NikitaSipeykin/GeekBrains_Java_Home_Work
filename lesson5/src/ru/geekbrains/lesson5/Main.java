package ru.geekbrains.lesson5;

public class Main {
/* * Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
* Конструктор класса должен заполнять эти поля при создании объекта;
* Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
* Создать массив из 5 сотрудников
    Пример:
    Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
    persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
    persArray[1] = new Person(...);
...
    persArray[4] = new Person(...);

* С помощью цикла вывести информацию только о сотрудниках старше 40 лет;*/

    public static void main(String[] args) {
        StaffMember member1 = new StaffMember("Pupkin","Vasya","Petrovich","Director",
                "Vasya.p@mail.ru","8(999)240-61-99",300000,35);
        System.out.println();

        StaffMember member2 = new StaffMember("Hrenova","Gadya","Petrovich","Lost",
                "Gadya@mail.ru","8(800)555-35-35",0,15);
        System.out.println();

        StaffMember member3 = new StaffMember("Bogdaeva","Svetlana","Aleksandrovna","Manager",
                "Bogdarva@mail.ru","8(903)610-35-48",40000,40);
        System.out.println();

        StaffMember member4 = new StaffMember("Sypeykin","Nikita","Vitalevich","Java-Developer",
                "NikSipeykin@mail.ru","8(917)501-08-58",80000,26);
        System.out.println();

        StaffMember member5 = new StaffMember("Maslova","Anna","Aleksandrovna","Top-Manager",
                "Maslova@mail.ru","8(903)610-66-66",60000,48);


    }
}

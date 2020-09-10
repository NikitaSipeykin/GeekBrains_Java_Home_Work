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
        StaffMember member1 = new StaffMember("Vasya","Pupkin","Petrovich","Director",
                "Vasya.p@mail.ru","8(800)555-35-35",300000,35);

    }
}

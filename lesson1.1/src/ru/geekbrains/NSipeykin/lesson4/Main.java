package ru.geekbrains.NSipeykin.lesson4;

public class Main {
//TODO:
// 1. Создать класс "Сотрудник" с полями: ФИО, зарплата, возраст;
//TODO:
// 2. Конструктор класса должен заполнять эти поля при создании объекта;
//TODO:
// 3. Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;
//TODO:
// 4. Вывести при помощи методов из пункта 3 ФИО и возраст.
//TODO:
// 5. Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
//TODO:
// 6. * Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000.
//TODO:
// 7. * Подсчитать средние арифметические зарплаты и возраста
//TODO:
// 8. *** Продумать конструктор таким образом, чтобы при создании каждому сотруднику присваивался личный уникальный
// идентификационный порядковый номер

    static void prize(StaffMember[] x){
        for (int i = 0; i < x.length; i++) {
            if(x[i].getAge()>45){
                x[i].payRise(5000);
            }
        }
    }

    static int averageSalary(StaffMember[] x){
        int sum = 0;

        for (int i = 0; i < x.length; i++) {
            sum = sum + x[i].getSalary();
        }
        return  sum / x.length;
    }

    static int averageAge(StaffMember[] x){
        int sum = 0;

        for (int i = 0; i < x.length; i++) {
            sum = sum + x[i].getAge();
        }
        return  sum / x.length;
    }


    public static void main(String[] args) {

        StaffMember[] office = new StaffMember[5];
        office[0] = new StaffMember("Jack",30000,25);
        office[1] = new StaffMember("William", 40000, 45);
        office[2] = new StaffMember("Angela",80000,50);
        office[3] = new StaffMember("Staysy",70000,46);
        office[4] = new StaffMember("Nikita",60000, 40);

        System.out.println(office[0].getNameAndAge());
        System.out.println();

        prize(office);


        for (int i = 0; i < office.length; i++) {
            if(office[i].getAge()>40){
                System.out.println(office[i].getInfo());
            }
        }
        System.out.println();

        System.out.println("Average salary in office: " +averageSalary(office));
        System.out.println("Average age in office: " +averageAge(office));

        for (int i = 0; i < office.length; i++) {
            System.out.println(office[i].getId());
        }
    }
}

package ru.geekbrains.NSipeykin.lesson4;

public class StaffMember {
    private String name;
    private int salary;
    private int age;

    public StaffMember(String name, int salary, int age){
        int id;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    String getName(){
        return name;
    }

    int getSalary(){
        return salary;
    }

    int getAge(){
        return age;
    }

    String getNameAndAge(){
        return String.format("name: "+getName()+"; age: "+getAge()+";");
    }

    String getInfo(){
        return String.format("name: "+getName()+"; Salary: "+getSalary()+ "; age: "+getAge()+";");
    }

    void payRise(int value){
        salary = salary+value;
    }
}

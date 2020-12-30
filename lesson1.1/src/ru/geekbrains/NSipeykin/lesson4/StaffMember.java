package ru.geekbrains.NSipeykin.lesson4;

public class StaffMember {
    private String name;
    private int salary;
    private int age;
    private static int id = 0;
    public int uid;

    public StaffMember(String name, int salary, int age){

        this.name = name;
        this.salary = salary;
        this.age = age;
        this.uid = id++;
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

    int getId(){
        return uid;
    }

    String getNameAndAge(){
        return String.format("name: "+getName()+"; age: "+getAge()+";");
    }

    String getInfo(){
        return String.format("id: "+getId()+"; name: "+getName()+"; Salary: "+getSalary()+ "; age: "+getAge()+";");
    }

    void payRise(int value){
        salary = salary+value;
    }
}

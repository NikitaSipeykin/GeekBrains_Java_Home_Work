package ru.geekbrains.lesson5;

public class StaffMember {
    private String firstName;
    private String lastName;
    private String patronymic;
    private String position;
    private String eMail;
    private String phoneNumber;
    private int salary;
    private int age;

    public StaffMember(String lastName, String firstName, String patronymic, String position, String eMail,
                       String phoneNumber, int salary, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.position = position;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;

        if(age>40){
            printStaffMember();
        }

    }
     void printStaffMember(){
        System.out.println("Имя "+lastName+"\nФамилия "+firstName+"\nОтчество "+patronymic+"\nДолжность "+position+
            "\neMail "+eMail+"\nТелефон "+phoneNumber+"\nЗарплата "+salary+"\nВозраст "+age);
    }
}

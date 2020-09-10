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

    public StaffMember(String firstName, String lastName, String patronymic, String position, String eMail,
                       String phoneNumber, int salary, int age){


    }
    static void printStaffMember(){
        System.out.println("Имя "+firstName+"\nФамилия "+lastName+"\nОтчество "+patronymic+"\nДолжность "+position+
            "\neMail "+eMail+"\nТелефон "+phoneNumber+"\nЗарплата "+salary+"\nВозраст "+age);

    }
}

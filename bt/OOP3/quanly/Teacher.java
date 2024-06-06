package OOP3.quanly;

import java.util.Scanner;

public class Teacher extends Person {
    private int teachingHours;
     private double allowance;
     private double salary;

    public Teacher(String fullName, int birthYear, String homeTown, int teachingHours) {
        super(fullName, birthYear, homeTown);
        this.teachingHours = teachingHours;
    }


    public void setTeachingHours(int teachingHours) {
        this.teachingHours = teachingHours;
    }

    public int getTeachingHours() {
        return this.teachingHours;
    }


    public void inputInfo() {
        super.inputInfo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so gio day: ");
        this.teachingHours = Integer.parseInt(sc.nextLine());
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("So gio day: " + this.teachingHours);
    }

     public double calculateIncome() {
         return salary + allowance;
     }
}
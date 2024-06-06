package OOP3.quanly;

import java.util.Scanner;

public class Person {
    private String fullName;
    private int birthYear;
    private String homeTown;

    public Person(String fullName, int birthYear, String homeTown) {
        this.fullName = fullName;
        this.birthYear = birthYear;
        this.homeTown = homeTown;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getBirthYear() {
        return this.birthYear;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public String getHomeTown() {
        return this.homeTown;
    }

    public void inputInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        this.fullName = sc.nextLine();
        System.out.println("Nhap nam sinh: ");
        this.birthYear = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap que quan: ");
        this.homeTown = sc.nextLine();
    }

    public void displayInfo() {
        System.out.println("Ho ten: " + this.fullName);
        System.out.println("Nam sinh: " + this.birthYear);
        System.out.println("Que quan: " + this.homeTown);
    }
}
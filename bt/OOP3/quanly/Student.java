package OOP3.quanly;

import java.util.Scanner;

public class Student extends Person {
    private float gpa;

    public Student(String fullName, int birthYear, String homeTown, float gpa) {
        super(fullName, birthYear, homeTown);
        this.gpa = gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public float getGpa() {
        return this.gpa;
    }

    public void inputInfo() {
        Scanner sc = new Scanner(System.in);
        super.inputInfo();
        System.out.println("Nhap diem trung binh: ");
        this.gpa = Float.parseFloat(sc.nextLine());
        while (this.gpa < 0 || this.gpa > 10) {
            System.out.println("Diem trung binh phai nam trong khoang tu 0 den 10. Nhap lai: ");
            this.gpa = Float.parseFloat(sc.nextLine());
        }
    }

    public void displayInfo() {
        super.displayInfo();    
        System.out.println("Diem trung binh: " + this.gpa);
        System.out.println("Xep loai: " + this.calculateClassification());
    }

    public String calculateClassification() {
        String res = "";
        if (this.gpa < 5) {
            res = "Yeu";
        } else if (this.gpa < 6.5) {
            res = "Trung binh";
        } else if (this.gpa < 7.5) {
            res = "Kha";
        } else if (this.gpa < 9) {
            res = "Gioi";
        } else {
            res = "Xuat sac";
        }
        return res;
    }
}

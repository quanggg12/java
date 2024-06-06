package OOP3.quanly;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap so sinh vien va giang vien: ");
        n = sc.nextInt();

        Student[] students = new Student[n];
        Teacher[] teachers = new Teacher[n];
       
        for (int i = 0; i < n; i++) {
            students[i] = new Student("quang", 2000, "HN", 8);
            students[i].inputInfo();
            students[i].displayInfo();
        }

       
        for (int i = 0; i < n; i++) {
            teachers[i] = new Teacher("quang", 2000, "HN", 2);
            teachers[i].inputInfo();
            teachers[i].displayInfo();
             double income = teachers[i].calculateIncome();
             System.out.println("Income: " + income);
        }
    }
}
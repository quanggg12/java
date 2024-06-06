package OOP2.quanly;

import java.util.Scanner;

public class Person {
    private String hoTen, que;
    private int nam;

    public Person(String hoTen, int nam, String que) {
        this.hoTen = hoTen;
        this.nam = nam;
        this.que = que;
    }

    public String getHoTen() {
        return this.hoTen;
    }

    public String getQue() {
        return this.que;
    }

    public int getNam() {
        return this.nam;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setQue(String que) {
        this.que = que;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        this.hoTen = sc.nextLine();
        System.out.println("Nhap nam sinh: ");
        this.nam = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap que quan: ");
        this.que = sc.nextLine();
    }

    public void xuat() {
        System.out.println("Ho ten: " + this.hoTen);
        System.out.println("Nam sinh: " + this.nam);
        System.out.println("Que quan: " + this.que);
    }

};

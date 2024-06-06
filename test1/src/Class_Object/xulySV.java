//package Class_Object;

import java.util.Arrays;
import java.util.Scanner;
//import Class_Object.SinhVien.*;
public class xulySV {
    public static void nhapSinhVien(SinhVien []x) {
        for (int i = 0; i < x.length; i++) {
            System.out.println("----Nhap sinh vien thu " + (i + 1) + "----");
            x[i] = new SinhVien();
            x[i].nhap();
        }
    }

    public static void inSinhVien(SinhVien []x) {
        System.out.println("-----In thong tin sinh vien-----");
        System.out.printf("%-20s %-12s %-12s %-15s\n", "Ho ten", "Dia chi", "Gioi tinh", "Diem");
        for (SinhVien a : x) {
            a.xuat();
        }
    }


    public static void sapxep(SinhVien []x) {
        Arrays.sort (x, (SinhVien u, SinhVien v)->{
            if (u.getDiem() < v.getDiem()) {
                return -1; 
            }
            else return 1;
        });
    }
    
    public static void dsHN(SinhVien []x) {
        String dia_chi = "Ha Noi";
        for (int i = 0; i < x.length; i++) {
            if (x[i].getDiaChi() == dia_chi) {
                x[i].xuat();
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so sinh vien: ");
        int n = input.nextInt();
        SinhVien []x = new SinhVien[n];
        nhapSinhVien(x);
        //inSinhVien(x);
        sapxep(x);
        inSinhVien(x);
    }
}

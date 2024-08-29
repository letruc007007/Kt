/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De1;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        QLCauThu qlCauThu = new QLCauThu();
        qlCauThu.khoiTao();

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Them moi cau thu");
            System.out.println("2. xuat danh sach cau thu");
            System.out.println("3.tim cau thu co luong cao nhat");
            System.out.println("4. ");
            System.out.println("5. tinh luong trung binh");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhap so ao: ");
                    int soao = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nhap ho ten: ");
                    String hoten = scanner.nextLine();
                    System.out.print("Nhap nam sinh: ");
                    int namsinh = scanner.nextInt();
                    System.out.print("Nhap luong cung: ");
                    double luongcung = scanner.nextDouble();
                    System.out.print("Nhap tien thuong: ");
                    double tienthuong = scanner.nextDouble();
                    System.out.print("Nhap tien phat: ");
                    double tienphat = scanner.nextDouble();

                    CauThu cauThu = new CauThu(soao, hoten, namsinh, luongcung, tienthuong, tienphat);
                    qlCauThu.themCauThu(cauThu);
                    break;
                case 2:
                    qlCauThu.xuatDanhSachCauThu();
                    break;
                case 3:
                    qlCauThu.timCauThuLuongCaoNhat();
                    break;
                case 4:
                    qlCauThu.sapXepCauThuTheoLuong();
                    break;
                case 5:
                    qlCauThu.tinhLuongCungTrungBinh();
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (choice != 0);

        scanner.close();
    }
}
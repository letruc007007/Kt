/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author ADMIN
 */
public class QLCauThu {
    private final ArrayList<CauThu> danhSachCauThu;

    public QLCauThu() {
        this.danhSachCauThu = new ArrayList<>();
    }
    public void khoiTao() {
       danhSachCauThu.add(new CauThu(1, "Pham Van Nguyen",  1995, 10000, 2000, 500));
       danhSachCauThu.add(new CauThu(2, "Dinh Thanh Nha", 1999, 14500,1300,450)); 
       danhSachCauThu.add(new CauThu(3, "Pham Tan Thang",  1995, 10200, 2100, 500));
       danhSachCauThu.add(new CauThu(4, "Le Hoang Dang Duy", 1997, 9800, 2100, 400)); 
       danhSachCauThu.add(new CauThu(5, "Hoang Van Lam",  1995, 10200, 2000, 500)); 
       danhSachCauThu.add(new CauThu(6, "Nguyen Hoa Lang", 1996, 14500, 1900, 500));
       danhSachCauThu.add(new CauThu(7, "Trinh Duy Hoang", 1995, 9800, 2400, 500)); 
       danhSachCauThu.add(new CauThu(8, "Nguyen Van Long", 1989, 10200, 2100, 500)); 
       danhSachCauThu.add(new CauThu(9, "Tan Hoa Lam", 1994, 14500, 2100, 500)); 
       danhSachCauThu.add(new CauThu(10, "Lam Hoai Duc", 1993, 10200, 2900, 500)); 
       danhSachCauThu.add(new CauThu(11, "Pham Ngu Linh", 2000, 9800, 2700, 500));
    }
    public void themCauThu(CauThu cauThu) {
        boolean tonTai = false;
        for (CauThu ct : danhSachCauThu) {
            if (ct.getSoao() == cauThu.getSoao()) {
                tonTai = true;
                break;
            }
        }
        if (!tonTai) {
            danhSachCauThu.add(cauThu);
        } else {
            System.out.println("SO AO DA TON TAI!");
        }
    }
    public void xuatDanhSachCauThu() {
        double tongLuong = 0;
        for (CauThu ct : danhSachCauThu) {
            System.out.println("SO AO: " + ct.getSoao() + ", HO TEN: " + ct.getHoten() +
                               ", TUOI: " + (2024 - ct.getNamsinh()) + ", LUONG THUC LANH: " + ct.settinhluongthuclanh());
            tongLuong += ct.settinhluongthuclanh();
        }
        System.out.println("TONG TIEN LUONG CLB: " + tongLuong);
    }
    public void timCauThuLuongCaoNhat() {
        double maxLuong = 0;
        for (CauThu ct : danhSachCauThu) {
            if (ct.settinhluongthuclanh() > maxLuong) {
                maxLuong = ct.settinhluongthuclanh();
            }
        }
        System.out.println("CAC CAU THU CO LUONG CAO NHAT:");
        for (CauThu ct : danhSachCauThu) {
            if (ct.settinhluongthuclanh() == maxLuong) {
                System.out.println("SO AO: " + ct.getSoao() + ", HO TEN: " + ct.getHoten());
            }
        }
    }
    public void sapXepCauThuTheoLuong() {
        Collections.sort(danhSachCauThu, Comparator.comparingDouble(CauThu::settinhluongthuclanh));
        System.out.println("DANGH SACH SAP XEP CAU THU TANG DAN:");
        xuatDanhSachCauThu();
    }
    public void tinhLuongCungTrungBinh() {
        double tongLuongCung = 0;
        for (CauThu ct : danhSachCauThu) {
            tongLuongCung += ct.getLuongcung();
        }
        double luongCungTB = tongLuongCung / danhSachCauThu.size();
        System.out.println("LUONG CUNG CO BAN CUA CAU THU: " + luongCungTB);
    }
}
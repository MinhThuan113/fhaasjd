package Buoi2;

import java.util.Scanner;

public class Date {
    private int ngay;
    private int thang;
    private int nam;

    
    public Date() {
        this.ngay = 1;
        this.thang = 1;
        this.nam = 2025;
    }

   
    public Date(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }
    public Date(Date d) {
        ngay = d.ngay;
        thang = d.thang;
        nam = d.nam;
    }

    
    public void hienThi() {
        System.out.printf("%02d/%02d/%d\n", ngay, thang, nam);
    }
    @Override
    public String toString() {
        return String.format("%02d/%02d/%d", ngay, thang, nam);
    }

    
    public void nhapDate() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("\nNhap ngay: ");
            ngay = scanner.nextInt();
            System.out.print("Nhap thang: ");
            thang = scanner.nextInt();
            System.out.print("Nhap nam: ");
            nam = scanner.nextInt();
        } while (!hopLe());  
    }

    
    public boolean hopLe() {
        if (thang < 1 || thang > 12 || nam < 1) {
            return false;
        }
        int[] soNgayThang = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
       
        if (nam % 400 == 0 || (nam % 4 == 0 && nam % 100 != 0)) {
            soNgayThang[1] = 29; 
        }
        return ngay >= 1 && ngay <= soNgayThang[thang - 1];
    }

    
    public Date ngayHomSau() {
        Date ngaySau = new Date(ngay, thang, nam);
        ngaySau.ngay++; 
        if (!ngaySau.hopLe()) {
            ngaySau.ngay = 1;
            ngaySau.thang++;
            if (ngaySau.thang > 12) {
                ngaySau.thang = 1;
                ngaySau.nam++;
            }
        }
        return ngaySau;
    }

    
    public Date congNgay(int n) {
        Date ngayMoi = new Date(ngay, thang, nam);
        for (int i = 0; i < n; i++) {
            ngayMoi = ngayMoi.ngayHomSau();  
        }
        return ngayMoi;
    }
}

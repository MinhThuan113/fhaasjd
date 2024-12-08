package Buoi2;

import java.util.Scanner;

public class SDDiem {
    public static void main(String[] args) {
       
        Diem A = new Diem(3, 4);
        System.out.println("Toa do diem A:");
        A.hienThi();
        System.out.println();

        
        System.out.println("Nhap toa do diem B:");
        Diem B = new Diem();
        B.nhapDiem();
        System.out.print("Toa do diem B: ");
        B.hienThi();
        System.out.println();

        
        Diem C = new Diem(-B.giaTriX(), -B.giaiTriY());
        System.out.print("Toa do diem C (doi xung voi B qua goc toa do): ");
        C.hienThi();
        System.out.println();

        
        System.out.printf("Khoang cach tu diem B den tam O: %.2f\n", B.khoangCach());

        
        System.out.printf("Khoang cach tu diem A den diem B: %.2f\n", A.khoangCach(B));
        
        
        
        Diem F= new Diem(C);
        System.out.println("Diem F: "); F.hienThi();
        F.hienThi("Diem F: ");
        System.out.println("Diem F: "+ F);
    }
}

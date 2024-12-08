package Buoi2;
import java.util.Scanner;
public class SDDate {
    public static void main(String[] args) {
        
        Date date1 = new Date();
        System.out.println("Ngay mac dinh: ");
        date1.hienThi();

        Date date2 = new Date();
        System.out.println("Nhap mot ngay:");
        date2.nhapDate();
        System.out.print("Ngay ban vua nhap: ");
        date2.hienThi();

        
        Date ngayHomSau = date2.ngayHomSau();
        System.out.print("Ngay hom sau la: ");
        ngayHomSau.hienThi();

       
        System.out.print("Nhap so ngay de cong: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Date ngayMoi = date2.congNgay(n);
        System.out.print("Ngay sau khi cong " + n + " ngay: ");
        ngayMoi.hienThi();
    }
}

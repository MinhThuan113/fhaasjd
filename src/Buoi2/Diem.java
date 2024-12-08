package Buoi2;

import java.util.Scanner;

public class Diem {
    
    private int x, y;

   
    public Diem() {
        x = 0;
        y = 0;
    }

    
    public Diem(Diem d) {
        x = d.x;
        y = d.y;
    }

    public Diem(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void nhapDiem() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap  x: ");
        x = scanner.nextInt();
        System.out.print("Nhap y: ");
        y = scanner.nextInt();
    }

    
    public void hienThi() {
        System.out.printf("("+x+","+y+")");
    }
    public String toString() {
        return ("("+x+","+y+")");
    }

    public void hienThi(String s) {
        System.out.printf(s); hienThi();
    }
    public void doiDiem(int dx, int dy) {
        x += dx;
        y += dy;
    }

    
    public int giaTriX() {
        return x;
    }

    
    public int giaiTriY() {
        return y;
    }

   
    public float khoangCach() {
        return (float) Math.sqrt(x * x + y * y);
    }

    
    public float khoangCach(Diem d) {
        int dx = x - d.x;
        int dy = y - d.y;
        return (float) Math.sqrt(dx * dx + dy * dy);
    }
}
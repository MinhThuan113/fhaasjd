package Buoi3;

import Buoi2.Diem;

public class SDDoanThang {

	public static void main(String[] args) {
		Diem A = new Diem(2,5);
		Diem B = new Diem(20,35);
		
		DoanThang AB = new DoanThang(A,B);
		System.out.println("\n Doan Thang AB: "+ AB);
		
		AB.ttien(3, 5);
		System.out.println("\n Doan  thang AB sau ttien(3,5): "+AB);
		
		DoanThang CD= new DoanThang();
		System.out.println("\n Nhap Doan Thang CD: ");
		CD.nhap();
		System.out.println("\n Doan Thang CD: "+ CD);
		
		DoanThang EF = new DoanThang(CD);
		System.out.println("\n Doan Thang EF: "+ EF);

	}

}

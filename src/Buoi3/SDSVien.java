package Buoi3;

public class SDSVien {

	public static void main(String[] args) {
		SinhVien s= new SinhVien();
		s.nhap();
		System.out.println("Sinh vien s vua nhap: "+s);
		
		SinhVien s1 = new SinhVien(s);
		System.out.println("Sinh vien s1 vua sao chep: " +s);

	}

}

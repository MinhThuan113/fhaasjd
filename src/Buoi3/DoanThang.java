package Buoi3;

import Buoi2.Diem;

public class DoanThang {
	private Diem d1,d2;
	
	public DoanThang() {
		d1=new Diem();
		d2= new Diem();
	}
	public DoanThang(Diem d11, Diem d22) {
		d1 = new Diem(d11);
		d2 = new Diem(d22);
	}
	public DoanThang(DoanThang dt) {
		d1 = new Diem(dt.d1);
		d2 = new Diem(dt.d2);
	}
	public void nhap() {
		System.out.println("\n Nhap toa do diem d1: ");
		d1.nhapDiem();
		System.out.println("\n Nhap toa do diem d2: ");
		d2.nhapDiem();
	}
	public void hienThi() {
		System.out.println("["+d1+";"+d2+"]");
	}
	public String toString() {
		return ("["+d1+";"+d2+"]");
	}
	public void ttien(int dx, int dy) {
		d1.doiDiem(dx, dy);
		d2.doiDiem(dx, dy);
	}
	public float dai() {
		return d1.khoangCach(d2);
	}
}

package Buoi3;

import java.util.Scanner;

import Buoi2.Date;

public class SinhVien {
	private String msv, hten;
	private Date nsinh;
	private int n, max;
	private String mon[], diem[];
	public SinhVien() {
		msv = new String();
		hten = new String();
		nsinh = new Date();
		n=0;
		max=70;
		mon = new String[max];
		diem = new String[max];
	}
	
	public SinhVien(SinhVien s) {
		msv = new String();
		hten = new String();
		nsinh = new Date();
		n=0;
		max=70;
		mon = new String[max];
		diem = new String[max];
		for(int i=0; i<n;i++) {
			mon[i]= new String(s.mon[i]);
			diem[i]= new String(s.diem[i]);
		}
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Nhap ma so sv: ");
		msv=sc.nextLine();
		System.out.print("\n Nhap ho ten sv: ");
		hten=sc.nextLine();
		System.out.print("\n Nhap ngay sinh sv: ");
		nsinh.nhapDate();
		System.out.print("\n Nhap so mon hoc: ");
		n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++) {
			System.out.println("\n Nhap mon hoc thu "+(i+1)+": ");
			mon[i]=sc.nextLine();
			System.out.println("\n Nhap diem mon hoc "+mon[i]+":");
			diem[i]=sc.nextLine();
			
		}
			
	}
	public void in() {
		System.out.print("\n["+msv+", "+hten+", "+ nsinh+", danh sach mon hoc: ");
		for(int i=0; i<n;i++) {
			System.out.print(mon[i]+":"+ diem[i]);
		}
		System.out.println("]");
	}
	public String toString() {
		String s=("\n["+msv+", "+hten+", "+ nsinh+", danh sach mon hoc: ");
		for(int i=0; i<n;i++) {
			s+=(mon[i]+":"+ diem[i]+",");
		}
		s+=("]");
		return s;
	}
	public float dtb() {
		float d=0;
		for(int i=0; i<n;i++) {
			if(diem[i].equals("A") ) d+=4;
			else if(diem[i].equals("B+") ) d+=3.5;
			else if(diem[i].equals("B") ) d+=3;
			else if(diem[i].equals("C+") ) d+=2.5;
			else if(diem[i].equals("C") ) d+=2;
			else if(diem[i].equals("D+") ) d+=1.5;
			else if(diem[i].equals("D") ) d+=1;
		}
		return d/n;
	}
	public void dky(String m ,String d) {
		if(n<max) {
			mon[n]= new String(m);
			diem[n]= new String(d);
			n++;
		}
	}

	public void xoa(String m) {
		int i=0;
		for(i=0;i<n;i++){
			if(mon[i].equals(m)) break;
		}
		if(i<n) {
			for(int j=i;j<n-1;j++) {
				mon[j]=mon[j+1];
				diem[j]=diem[j+1];
			}
			n--;
		}
	}
	public String layTen() {
		hten=hten.trim();
		return hten.substring(hten.lastIndexOf(" ")+1);
	}
}

package Buoi1;

import java.util.Scanner;

public class Bai8 {
	int ds[];
	int n;
	public void nhap() {
		Scanner sc= new Scanner(System.in);
		System.out.println("\n Nhap so phan tu:");
		n=sc.nextInt();
		ds= new int[n];
		for(int i=0; i<n;i++) {
			System.out.print("\n Nhap phan tu "+(i+1)+":");
			ds[i]= sc.nextInt();
		}
	}
	
	public void in() {
		for(int e: ds) {	
			System.out.println(e+" , ");
		}
	}
	public void sapXep() {
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(ds[i]>ds[j]) {
					int t= ds[i];
					ds[i]=ds[j];
					ds[j]=t;
				}
			}
		}
	}
	public int dem(int x) {
		int c=0;
		for(int e:ds) {
			if(e==x) {
				c++;
			}
		}return c;
		
	}
	
	public  static void main(String[] args) {
		Bai8 d = new Bai8();
		d.nhap();
		System.out.println("\n Day so vua nhap: ");
		d.in();
		
		System.out.println("\n Sap xep day so: ");
		d.sapXep();
		d.in();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Nhap phan tu x can tim:");
		int x=sc.nextInt();
		System.out.println("\n So phan tu tim thay"+ x +":"+d.dem(x));
	}
}

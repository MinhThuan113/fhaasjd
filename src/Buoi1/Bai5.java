package Buoi1;

import java.util.Scanner;

public class Bai5 {
	
	
	public static void gptb1(double a, double b) {
		if(a==0) {
			if(b==0) {
				System.out.println("Phuong trinh vo so nghiem");
			}else {
				System.out.println("PT vo nghiem");
			}
		}else {
			System.out.println("Pt co nghiem x= "+(-b/a));
		}
	}
	public static void gptb2(double a, double b, double c) {
		if(a==0) {
			gptb1(b, c);
		}else {
			double d=b*b-4*a*c;
			if(d<0) {
				System.out.println("Phuong trinh co nghiem kep "+(-b/2*a));
			}else {
				d=Math.sqrt(d);
				double x1=(-b+d)/(2*a);
				double x2=(-b-d)/(2*a);
				System.out.println("Pt co nghiem x1= "+ x1+",x2= "+ x2);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap a=");
		double a=sc.nextDouble();
		
		System.out.println("Nhap b=");
		double b=sc.nextDouble();
		
		System.out.println("Nhap c=");
		double c=sc.nextDouble();
		Bai5 p= new Bai5();
		p.gptb2(a, b, c);
	

	}

}

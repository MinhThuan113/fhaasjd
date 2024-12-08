package Buoi1;

import java.util.Scanner;

public class Tong2So {

	
	public int nhap() {
		Scanner sc= new Scanner(System.in);
		int n=0;
		String s;
		do {
			System.out.println("\n Nhap vao mot so nguyen");
			s=sc.nextLine();
			try 
			{
				n=Integer.parseInt(s);
				}
			catch(Exception e)
			{
				n=Integer.MAX_VALUE;
				System.out.println("\n Ban da nhap sai vui long nhap lai");
			}
		}while(n==Integer.MAX_VALUE);
		return n;
	}
	
	
	public static void main(String[] args) {
		int a,b;
		Scanner sc= new Scanner(System.in);
		
		Tong2So t=new Tong2So();
		System.out.println("Nhap vao a");
		a=t.nhap();
		
		System.out.println("Nhap vao b");
		b=t.nhap();
		System.out.println("Tong "+(a+b));
	}

}

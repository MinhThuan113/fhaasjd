package Buoi1;

import java.util.Scanner;

public class Bai7 {
	String hten="";
	public void gan(String ht) {
		hten =new String(ht);
	}
	public String layTen() {
		hten=hten.trim();
		int p= hten.lastIndexOf(" ");
		return hten.substring(p+1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Nhap ho ten: ");
		String hten= sc.nextLine();
		
		Bai7 h= new Bai7();
		h.gan(hten);
		String ten =h.layTen();
		System.out.println("\n Ten: "+ ten);

	}

}

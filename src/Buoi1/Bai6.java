package Buoi1;

import java.util.Scanner;

public class Bai6 {
	
	public static boolean isPrime(int number) {
		if(number <=1) {
			return false;
		}
		for(int i=2;i<=Math.sqrt(number);i++) {
			if(number%i==0){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Nhap mot so nguyen: ");
		int number =sc.nextInt();
		
		if(isPrime(number)) {
			System.out.println(number+" la so nguyen to");
		}else {
			System.out.println(number+" Khong phai la so nguyen to");
		}
		
		
		String soNhiPhan= Integer.toBinaryString(number);
		System.out.println("Danh thap phan cua "+ number+" la: "+soNhiPhan);

	}

}

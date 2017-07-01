package com.doantheanh.caudieukien;

import java.util.Scanner;

public class CauDieuKienIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("vui long nhap gtri x");
		int x = scan.nextInt();
		
		if (x > 5) {
			System.out.println("gia tri cua x > 5");
		}else {
			if(x == 5) {
				System.out.println("gia tri cua x = 5");
			}else {
				System.out.println("gia tri cua x < 5");
			}
		}
		
		if (x > 5) {
			System.out.println("gia tri cua x > 5");
		}else if(x == 5) {
			System.out.println("gia tri cua x = 5");
		}else {
			System.out.println("gia tri cua x < 5");
		}
	}

}

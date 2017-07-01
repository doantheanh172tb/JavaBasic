package com.doantheanh.caudieukien;

import java.util.Scanner;

public class CauDieuKienIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("vui long nhap gtri x");
		int x = scan.nextInt();
		
		//cau dieu kien if
		if (x > 5) {
			System.out.println("x > 5");
		}
		if (x == 5) {
			System.out.println("gia tri cua x = 5");
		}
		
		if (x != 5) {
			System.out.println("gia tri cua x != 5");
		}
		
		if (x < 5) {
			System.out.println("gia tri cua x < 5");
		}
		
		if (x <= 5) {
			System.out.println("gia tri cua x <= 5");
		}
		
		if (x >= 5) {
			System.out.println("gia tri cua x >= 5");
		}
		System.out.println("ket thuc");
		
		
	}

}

package com.doantheanh.caudieukien;

import java.util.Scanner;

public class CauDieuKienSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("CauDieuKienSwitch:vui long nhap gtri x");
		int x = scan.nextInt();
		
		switch (x) {
		case 1:
			System.out.println("x = 1");
			break;
		case 2:
			System.out.println("x = 2");
			break;
		case 3:
			System.out.println("x = 3");
			break;
		default:
			System.out.println("x != 3, x != 2, x != 1");
			break;
		}
	}

}

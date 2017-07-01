package com.doantheanh.main;

import java.util.Scanner;

import com.doantheanh.hinhhoc.HinhTron;
import com.doantheanh.hinhhoc.HinhVuong;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("vui long lua chon");
		System.out.println("1 -- Tinh chu vi va dien tich hinh vuong");
		System.out.println("1 -- Tinh chu vi va dien tich hinh tron");

		int x = scan.nextInt();

		switch (x) {
		case 1:
			System.out.println("Ban da lua chon 1, vui long nhap chieu dai");
			float chieuDaiHV = scan.nextFloat();
			System.out.println("Chu vi hinh vuong: " + HinhVuong.chuVi(chieuDaiHV));
			System.out.println("Dien tich hinh vuong: " + HinhVuong.dienTich(chieuDaiHV));
			break;
		case 2:
			System.out.println("Ban da lua chon 2, vui long nhap ban kinh");
			float banKinhHT = scan.nextFloat();
			System.out.println("Chu vi hinh tron: " + HinhTron.chuVi(banKinhHT));
			System.out.println("Dien tich hinh tron: " + HinhTron.dienTich(banKinhHT));
			break;
		default:
			System.out.println("ban phai lua chon 1 hoac 2, vui long thu lai");
			break;
		}
	}
}

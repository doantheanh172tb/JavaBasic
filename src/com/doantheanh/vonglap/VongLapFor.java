package com.doantheanh.vonglap;

public class VongLapFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		System.out.println("------------------");

		int x = 0;
		for (; x < 5;) {
			System.out.println(x);
			x++;
		}

		System.out.println("------------------");

		int[] mang = { 1, 2, 3, 4, 5, 6 };
		for (int j = 0; j < mang.length; j++) {
			System.out.println(j);
		}
	}

}

package com.doantheanh.vonglap;

public class VongLapWhile {
	public static void main(String[] args) {
		int i = 0;

		while (i < 5) {
			System.out.println(i);

			i = i + 1;
		}
		
		System.out.println("----------");

		int[] x = { 1, 2, 3, 4, 5 };
		int index = 0;
		while (index < x.length) {
			System.out.println(x[index]);
			index++;
		}
	}
}

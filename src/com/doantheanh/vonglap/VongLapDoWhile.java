package com.doantheanh.vonglap;

public class VongLapDoWhile {
	public static void main(String[] args) {
		int i = 0;

		do {
			System.out.println(i);
			i++;
		} while (i < 5);
		
		System.out.println("-----------");
		
		int[] j = {1,2,3,4,5};
		int index = 0;
		do {
			System.out.println(j[index]);
			index++;
		}while(index < j.length);
	}
}

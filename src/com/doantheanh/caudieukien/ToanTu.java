package com.doantheanh.caudieukien;

public class ToanTu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tong1 = 0;
		int tong2 = 0;
		int x = 5;
		
		if(x > 5) {
			tong1 = tong1 + 1;
		}else {
			tong1 = tong1 -1;
		}
		System.out.println("CauDieuKienSwitch:Tong1: " + tong1);
		
		tong2 = (x > 5) ? (tong2 + 1) : (tong2 - 1);
		System.out.println("CauDieuKienSwitch:Tong2: " + tong2);
	}

}

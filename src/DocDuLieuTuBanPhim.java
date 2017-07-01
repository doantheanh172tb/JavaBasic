import java.util.Scanner;

public class DocDuLieuTuBanPhim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Xin vui long nhap gia tri : ");
		int x = scan.nextInt();
		System.out.println(x);
		
		System.out.println("Nhap gia tri cua y va z");
		long y = scan.nextLong();
		double z = scan.nextDouble();
		
		double tong = y + z;
		System.out.println("tong 2 so la: " + tong);
		
		boolean b = scan.nextBoolean();
		short s = scan.nextShort();
		String ss = scan.nextLine();
	}

}

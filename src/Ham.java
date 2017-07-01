import jdk.internal.dynalink.beans.StaticClass;

public class Ham {
	public static void main(String[] args) {
		int x = 10;
		int y = 15;
		
		int hieu = hieuHaiSo(x, y);
		System.out.println(hieu);
		
		int tong = tongHaiSo();
		System.out.println(tong);
		
		xinChao();
		
		float chuViHinhTron = soPi() * 2;
		System.out.println(chuViHinhTron);
	}
	
	public static int tongHaiSo() {
		int x = 10;
		int y = 15;
		int tong = x + y;
		return tong;
	}
	
	public static int hieuHaiSo(int x, int y) {
		int hieu = x - y;
		return hieu;
	}
	
	public static void xinChao() {
		System.out.println("Xin Chao ABC!");
	}
	
	public static float soPi() {
		return 3.14f;
	}
	
}

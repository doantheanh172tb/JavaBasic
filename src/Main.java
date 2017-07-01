
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//tinh chu vi dien tich hinh chu nhat
		float chieuDai = 4.5f;
		float chieuRong = 3.4f;
		
		float chuViHCN = HinhChuNhat.chuVi(chieuDai, chieuRong);
		float dienTichHCN = HinhChuNhat.dienTich(chieuDai, chieuRong);
		
		System.out.println("Chu vi HCN: " + chuViHCN);
		System.out.println("dien tich HCN: " + dienTichHCN);
		
		
		//hinh tron
		float banKinh = 2f;
		System.out.println("Chu vi hinh tron: " + HinhTron.chuVi(banKinh));
		System.out.println("Dien Tich hinh trong: " + HinhTron.dienTich(banKinh));
		
		
		float chieuDaiHinhVuong = 4.5f;
		System.out.println("Chu Vi Hinh Vuong: " + HinhVuong.chuVi(chieuDaiHinhVuong));
		System.out.println("Dien Tich hinh Vuong: " + HinhVuong.dienTich(chieuDaiHinhVuong));
	}

}

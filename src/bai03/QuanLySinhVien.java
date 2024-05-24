package bai03;

public class QuanLySinhVien {

	public static void main(String[] args) {
		//Khai bao doii tuong sv kieu SinhVien
		SinhVien sv;
		//Khoi tao doi tuong sv
		sv = new SinhVien();
		//Gan gia tri cho cac thuoc tinh cua doi tuong sv
		sv.hoten = "Ngoc Truong";
		sv.namsinh = 2005;
		sv.sdt = "090908081234";
		//Xuat gia tri cua doi tuong sv ra man hinh
		System.out.println("Ho ten: " + sv.hoten + "; nam sinh: " + 
							sv.namsinh + "; sdt: " + sv.sdt);
					
	}

}

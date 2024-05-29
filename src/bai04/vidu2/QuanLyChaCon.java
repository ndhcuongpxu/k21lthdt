package bai04.vidu2;

public class QuanLyChaCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LopCha obj1 = new LopCha("Lop Cha", 15, 3.1417);
		obj1.thuoctinh2 = 16;
		obj1.thuoctinh3 = 7.5;
		System.out.println(obj1);
		obj1.phuongthuc2();
		obj1.phuongthuc3();
		obj1.vidugoiprivate();
		System.out.println(obj1);
		
		LopCon obj2 = new LopCon("Phong", 100, 9.9, "K21 CNTT");
		obj2.phuongthuc2();
	}

}

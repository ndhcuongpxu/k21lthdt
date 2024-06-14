package bai09;

import bai09.vidu4.BanhXe;
import bai09.vidu4.DongCo;
import bai09.vidu4.XeHoi;

public class QuanHeCompositionVer2 {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		DongCo  dc = new DongCo("Dong co xang");
		BanhXe bx = new BanhXe(1.5);
		XeHoi car = new XeHoi(dc);
		for(int i = 0; i < 4; i++) {
			car.addBanhXe(bx);
		}
		System.out.println("CAU HINH XE BAN DAU");
		System.out.println(car);
		System.out.println("Thay doi cac linh kien");
		dc.setLoaiDongCo("Dong co dien");
		System.out.println("Thay doi dong co: " + dc);
		bx.setBankinh(2.1);
		System.out.println("Thay doi ban kinh banh xe: " + bx);
		System.out.println(car);
	}

}

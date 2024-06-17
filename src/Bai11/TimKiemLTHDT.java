package Bai11;

import java.util.ArrayList;
import java.util.List;

import Bai11.model.SinhVien;

public class TimKiemLTHDT {

	public static void main(String[] args) {
		// Buoc 1: Tao du lieu
		List<SinhVien> dssv = new ArrayList<SinhVien>();
		dssv.add(new SinhVien("Thong", 10, 17));
		dssv.add(new SinhVien("Quy", 9, 19));
		dssv.add(new SinhVien("Nhi", 9, 20));
		dssv.add(new SinhVien("Quang", 7, 18));
		System.out.println("Danh sach sinh vien ban dau");
		for(SinhVien item: dssv) {
			System.out.println(item);
		}
		System.out.println("--------------------------------");
	}

}

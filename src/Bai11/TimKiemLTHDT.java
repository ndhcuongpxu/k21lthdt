package Bai11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
		//Buoc 2: Tim kiem sinh vien co dtb thap nhat
		SinhVien sv_min = Collections.min(dssv, new Comparator<SinhVien>() {

			@Override
			public int compare(SinhVien o1, SinhVien o2) {
				// TODO Auto-generated method stub
				return Double.compare(o1.getDtb(), o2.getDtb());
			}
		});
		System.out.println("Sinh vien co dtb thap nhat la");
		System.out.println(sv_min);
		System.out.println("--------------------------------");
		//Buoc 3: Tim sinh vien co tuoi lon nhat
		SinhVien sv_max = Collections.max(dssv, new Comparator<SinhVien>() {

			@Override
			public int compare(SinhVien o1, SinhVien o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o1.getTuoi(), o2.getTuoi());
			}
		});
		System.out.println("Sinh vien co tuoi cao nhat la");
		System.out.println(sv_max);
		System.out.println("--------------------------------");
	}

}

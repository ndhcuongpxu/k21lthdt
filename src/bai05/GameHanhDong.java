package bai05;

import bai05.baitap.KyBinh;

public class GameHanhDong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KyBinh kb = new KyBinh("Phuoc", "IT2005", 1, 10, true, false, false, false);
		System.out.println(kb);
		kb.hanhdong();
		kb.sucmanh();
	}

}

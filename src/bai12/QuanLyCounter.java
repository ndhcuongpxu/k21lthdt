package bai12;

import bai12.model.Counter;

public class QuanLyCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter c1= new Counter();
		System.out.println("Hien tai lop Counter co " + Counter.getCount() + " doi tuong trong bo nho");
		Counter c2 = new Counter();
		Counter c3 = new Counter();
		System.out.println("Hien tai lop Counter co " + Counter.getCount() + " doi tuong trong bo nho");
	}

}

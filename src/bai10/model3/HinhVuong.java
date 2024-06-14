package bai10.model3;

public class HinhVuong extends HinhHoc {
	private double canh;

	/**
	 * @param canh
	 */
	public HinhVuong(double canh) {
		super();
		this.canh = canh;
	}

	/**
	 * @return the canh
	 */
	public double getCanh() {
		return canh;
	}

	/**
	 * @param canh the canh to set
	 */
	public void setCanh(double canh) {
		this.canh = canh;
	}

	
	@Override
	public String toString() {
		return "HinhVuong [canh=" + canh + ", tinhDienTich()=" + tinhDienTich() + "]";
	}

	@Override
	public double tinhDienTich() {
		// TODO Auto-generated method stub
		return this.canh*this.canh;
	}

}

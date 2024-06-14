package bai10.model3;

public class HinhTron extends HinhHoc {
	private double bankinh;

	/**
	 * @param bankinh
	 */
	public HinhTron(double bankinh) {
		super();
		this.bankinh = bankinh;
	}

	/**
	 * @return the bankinh
	 */
	public double getBankinh() {
		return bankinh;
	}

	/**
	 * @param bankinh the bankinh to set
	 */
	public void setBankinh(double bankinh) {
		this.bankinh = bankinh;
	}

	@Override
	public String toString() {
		return "HinhTron [bankinh=" + bankinh + ", tinhDienTich()=" + tinhDienTich() + "]";
	}

	@Override
	public double tinhDienTich() {
		// TODO Auto-generated method stub
		return Math.PI*bankinh*bankinh;
	}

}

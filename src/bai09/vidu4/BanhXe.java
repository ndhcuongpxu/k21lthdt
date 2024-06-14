package bai09.vidu4;

public class BanhXe implements Cloneable {
	private double bankinh;

	/**
	 * @param bankinh
	 */
	public BanhXe(double bankinh) {
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
		return "BanhXe [bankinh=" + bankinh + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}

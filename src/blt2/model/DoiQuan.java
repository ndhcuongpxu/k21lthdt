package blt2.model;

import java.util.List;

public class DoiQuan {
	private List<BinhDoan> dsbd;

	/**
	 * @param dsbd
	 */
	public DoiQuan(List<BinhDoan> dsbd) {
		super();
		this.dsbd = dsbd;
	}

	/**
	 * @return the dsbd
	 */
	public List<BinhDoan> getDsbd() {
		return dsbd;
	}

	/**
	 * @param dsbd the dsbd to set
	 */
	public void setDsbd(List<BinhDoan> dsbd) {
		this.dsbd = dsbd;
	}

	@Override
	public String toString() {
		return "DoiQuan [dsbd=" + dsbd + "]";
	}
	
}

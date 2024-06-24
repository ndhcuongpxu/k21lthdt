package blt2.model;

import java.util.List;

public class BinhDoan {
	private DoiQuan doiquan;
	private List<KyBinh> dskb;
	/**
	 * @param doiquan
	 * @param dskb
	 */
	public BinhDoan(DoiQuan doiquan, List<KyBinh> dskb) {
		super();
		this.doiquan = doiquan;
		this.dskb = dskb;
	}
	/**
	 * @return the doiquan
	 */
	public DoiQuan getDoiquan() {
		return doiquan;
	}
	/**
	 * @param doiquan the doiquan to set
	 */
	public void setDoiquan(DoiQuan doiquan) {
		this.doiquan = doiquan;
	}
	/**
	 * @return the dskb
	 */
	public List<KyBinh> getDskb() {
		return dskb;
	}
	/**
	 * @param dskb the dskb to set
	 */
	public void setDskb(List<KyBinh> dskb) {
		this.dskb = dskb;
	}
	@Override
	public String toString() {
		return "BinhDoan [doiquan=" + doiquan + ", dskb=" + dskb + "]";
	}
	
	
}

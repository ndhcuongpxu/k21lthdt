package blt2.model;

public abstract class VuKhi implements Cloneable {
	public String tenvk;
	public int soluong;
	
	
	/**
	 * @return the tenvk
	 */
	public String getTenvk() {
		return tenvk;
	}
	/**
	 * @param tenvk the tenvk to set
	 */
	public void setTenvk(String tenvk) {
		this.tenvk = tenvk;
	}
	/**
	 * @return the soluong
	 */
	public int getSoluong() {
		return soluong;
	}
	/**
	 * @param soluong the soluong to set
	 */
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	public abstract void tanCong();
	public abstract void phongThu();
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public String toString() {
		return "VuKhi [tenvk=" + tenvk + ", soluong=" + soluong + "]";
	}
	
}

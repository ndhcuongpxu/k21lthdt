package blt2.model;

public class CungTen extends VuKhi {
	private double tamban;
	
	
	/**
	 * @param tamban
	 */
	public CungTen(double tamban, String tenvk, int soluong) {
		super();
		this.tamban = tamban;
		this.soluong = soluong;
		this.tenvk = tenvk;
	}

	@Override
	public void tanCong() {
		// TODO Auto-generated method stub
		System.out.println("Ban 1 mui ten ve phia truoc 100m");
	}

	@Override
	public void phongThu() {
		// TODO Auto-generated method stub
		System.out.println("Ban 1 mui ten ve phia truoc 50m");
	}

	/**
	 * @return the tamban
	 */
	public double getTamban() {
		return tamban;
	}

	/**
	 * @param tamban the tamban to set
	 */
	public void setTamban(double tamban) {
		this.tamban = tamban;
	}

	@Override
	public String toString() {
		return "CungTen [tamban=" + tamban + ", getTenvk()=" + getTenvk() + ", getSoluong()=" + getSoluong() + "]";
	}

	
}

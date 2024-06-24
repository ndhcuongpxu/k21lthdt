package blt2.model;

public class KyBinh extends NhanVat implements Cloneable {
	private int kinhnghiem;

	/**
	 * @param nangluong
	 * @param ten
	 * @param kinhnghiem
	 */
	public KyBinh(double nangluong, String ten, int kinhnghiem) {
		super(nangluong, ten);
		this.kinhnghiem = kinhnghiem;
	}

	/**
	 * @return the kinhnghiem
	 */
	public int getKinhnghiem() {
		return kinhnghiem;
	}

	/**
	 * @param kinhnghiem the kinhnghiem to set
	 */
	public void setKinhnghiem(int kinhnghiem) {
		this.kinhnghiem = kinhnghiem;
	}

	@Override
	public void sangTrai() {
		// TODO Auto-generated method stub
		System.out.println("Phi ngua sang trai 15 buoc");
	}

	@Override
	public void sangPhai() {
		// TODO Auto-generated method stub
		System.out.println("Phi ngua sang phai 15 buoc");
	}

	@Override
	public String toString() {
		return "KyBinh [kinhnghiem=" + kinhnghiem + ", getNangluong()=" + getNangluong() + ", getTen()=" + getTen()
				+ ", getDsvk()=" + getDsvk() + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}

package blt2.model;

public class Choi extends VuKhi {
	private double tamdanh;
	public Choi(double tamdanh, String tenvk, int soluong) {
		// TODO Auto-generated constructor stub
		this.soluong = soluong;
		this.tenvk = tenvk;
		this.tamdanh = tamdanh;
	}
	
	

	/**
	 * @return the tamdanh
	 */
	public double getTamdanh() {
		return tamdanh;
	}



	@Override
	public String toString() {
		return "Choi [tamdanh=" + tamdanh + ", getTenvk()=" + getTenvk() + ", getSoluong()=" + getSoluong() + "]";
	}



	/**
	 * @param tamdanh the tamdanh to set
	 */
	public void setTamdanh(double tamdanh) {
		this.tamdanh = tamdanh;
	}



	@Override
	public void tanCong() {
		// TODO Auto-generated method stub
		System.out.println("Vac choi dap");
	}

	@Override
	public void phongThu() {
		// TODO Auto-generated method stub
		System.out.println("Mua choi");
	}

}

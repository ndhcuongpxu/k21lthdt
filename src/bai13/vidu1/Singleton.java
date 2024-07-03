package bai13.vidu1;

public class Singleton {
	private static Singleton instance;
	
	private Singleton() {
		//Khoi tao ket noi den CSDL MySQL
	}
	
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}

public class Lingkaran{

	final double phi = 3.14;
	double jari;

	static void tambah(double a, double b){
		System.out.println(a+b);
	}
	static void tambah(float a, float b){
		System.out.println(" = "+a+b+(a+b));
	}

	public static void main(String[] args){
		tambah(5.5, 5.5);
		tambah(10.5,5.5);
	}
}
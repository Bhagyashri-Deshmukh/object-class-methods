package object;

public class Equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex c1 = new Complex(10, 15);
		Complex c2 = new Complex(10, 15);
		
		if (c1 == c2) {
			System.out.println("Equal ");
		} else {
			System.out.println("Not Equal ");
		}
	}

}

class Complex {
	private double re, im; 
	
	public Complex(double re, double im) {
		this.re = re;
		this.im = im;
	}
}
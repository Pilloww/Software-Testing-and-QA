package q1;

public class Triangle {
	public int side1, side2, side3;
	public Triangle(int side1, int side2, int side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	public double calculateArea() {
		//Heron's Formula
		//fixed the formula where it was originally side-s, instead of s-side
		double s = (side1 + side2 + side3)*0.5;
		System.out.println("\ts"+s);
		double result = Math.sqrt(s * (s-side1) * (s-side2) * (s-side3));
		System.out.println("\tresult"+result);
		return result;
	}
}

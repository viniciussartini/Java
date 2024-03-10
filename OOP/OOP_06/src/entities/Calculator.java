package entities;

public class Calculator {
	public static final double PI = 3.1415;
	
	public static double circumference(double radius) {
		return 2*PI*radius;
	}
	
	public static double volume(double radius) {
		return (4.0/3.0)*PI*Math.pow(radius,3);
	}

}

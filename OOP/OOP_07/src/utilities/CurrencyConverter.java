package utilities;

public class CurrencyConverter {

	public static final double IOF = 0.06;
	
	public static double converter(double dolar, double quantity) {
		return (dolar*quantity) + (dolar*quantity*IOF);
	}
}

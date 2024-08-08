package entities;

public class CurrencyConverter {

	public static final double TAX_IOF = 0.06;
	//A palavra "final" significa que não é uma variável, e sim uma constante.
	
	public static double totalAPagar(double dollarValue, double dollarQuantity) {
		/*A palavra "static" quer dizer que o cálculo pode ser feito independente do objeto,
		fazemos o uso dos módulos sem a necessidade de atribuí-los a cada objeto*/
		return (dollarValue * dollarQuantity) + (dollarValue * dollarQuantity * TAX_IOF); 
	}
}


package curso_programacao;
import java.util.Locale;
import java.util.Scanner; 
import entities.Triangulo;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
	
		Triangulo x, y;
	
		x = new Triangulo();
		y = new Triangulo();
	
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Valores de X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();	
	
		System.out.println("Valores de Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();	
	
		double areaX = x.area();
		double areaY = y.area();
	
		System.out.println("X = " + areaX + ", e Y = " + areaY);
	
		if (areaX > areaY) {
			System.out.println("X é o maior.");
		}
		else {
			System.out.println("Y é o maior.");
		}
		sc.close();
	}

}

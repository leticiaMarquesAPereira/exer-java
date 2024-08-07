package entities;

public class Student {
	
	public double nota1;
	public double nota2;
	public double nota3;
	
	public String resultadoFinal() {
		
		if (nota1 + nota2 + nota3 >= 60) {
			
			return "Passou!";
		}
		else {
			
			return "Reprovou :(";
		}
	}
}


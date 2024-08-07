package application;
import java.util.Scanner;
import java.util.Locale;
import entities.Student;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		System.out.print("Nota 1: ");
		student.nota1 = sc.nextDouble();
		System.out.print("Nota 2: ");
		student.nota2 = sc.nextDouble();
		System.out.print("Nota 3: ");
		student.nota3 = sc.nextDouble();
		
		System.out.println(student.resultadoFinal());
		sc.close();
	}
}
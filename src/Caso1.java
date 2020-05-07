import java.util.Scanner;

public class Caso1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese su edad: ");
		int edad = sc.nextInt();
		if (edad>=18) 
			System.out.println("Es mayor de edad.");
		else
			System.out.println("Es menor de edad.");
	

	}

}

import java.util.Scanner;

public class caso4 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese su primer n�mero: ");
		int n1 = sc.nextInt();
		
		System.out.println("Ingrese su segundo n�mero: ");
		int n2 = sc.nextInt();
		
		if(n1==n2) {
			System.out.println("Los n�meros son iguales.");
		}
		else {
			if(n1>n2) {
				System.out.println("El segundo n�mero es menor.");
			}
			else {
				System.out.println("El primer n�mero es menor.");
			}
		}

	}

}


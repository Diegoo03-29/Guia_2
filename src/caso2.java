import java.util.Scanner;

public class caso2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese su n�mero: ");
		int n = sc.nextInt();
		
		String rpta ="Su n�mero es impar";
		
		if(n % 2 == 0)
			rpta = "Su n�mero es par";
		
		System.out.println("Respuesta: "+ rpta);
		
		
		

	}

}

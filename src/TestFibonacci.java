import java.util.Scanner;

public class TestFibonacci {

	public static void main(String[] args) {
		// permet de d'indiquer le nombre de rang N de la suite de Fibonacci

		System.out.println("Entrer le rang N de la suite de Fibonacci");
		Scanner questionUser = new Scanner(System.in);

		int rang = questionUser.nextInt();
		int[] fibonacci = new int[rang];

		fibonacci[0] = 0;
		fibonacci[1] = 1;

		for (int i = 0; i < fibonacci.length - 3; i++) {

			fibonacci[i + 2] = fibonacci[i] + fibonacci[i+1];

			
			
		}
		System.out.println("La nombre de rang N de la suite de Fibonacci est " + fibonacci[rang -1] );
	}

}

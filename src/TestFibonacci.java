import java.util.Scanner;

public class TestFibonacci {

	public static void main(String[] args) {
		// permet de d'indiquer le nombre de rang N de la suite de Fibonacci

		System.out.println("Entrer le rang N de la suite de Fibonacci");
		Scanner questionUser = new Scanner(System.in);

		int rang = questionUser.nextInt();
		
		int nombre1 = 0;
		int nombre2 = 1;
		
		if (rang == 1) {
			System.out.println("0");
		}
		
		else if (rang == 2) {
				System.out.println("1");
		}
		
		else {
			for (int i = 3; i<= rang; i++) {
				
				int temporaire = 0;
				
				temporaire = nombre1;
				nombre1 = nombre2;
				nombre2 = nombre2 + temporaire;
			}
		}
			
		System.out.println("La nombre de rang N de la suite de Fibonacci est " + nombre2 );
		questionUser.close();
	}
		
	

}

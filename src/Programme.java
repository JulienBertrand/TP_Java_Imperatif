import java.util.Scanner;

public class Programme {

	public static void main(String[] args) {
		// Faire un programme avec le menu suivant
		
		int [] array= {10}; //créer un nouveau tableau
		
		System.out.println("Veuillez choisir une option parmis les deux choix suivants:");
		System.out.println("1.Ajouter un nombre");
		System.out.println("2.Afficher les nombres existants");
		
	    int choix = 0; 
		Scanner  choixNumero1 = new Scanner(System.in) ;
		int a = choixNumero1.nextInt() ;
		
		Scanner  choixNumero2 = new Scanner(System.in) ;
		int b = choixNumero2.nextInt() ;
		
		
		
			
		choixNumero1.close();
		choixNumero2.close();
	}
		
		
}

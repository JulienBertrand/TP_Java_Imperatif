import java.util.Scanner;

public class Programme {

	public static void main(String[] args) {
		// Faire un programme avec le menu suivant
		
		System.out.println("Veuillez choisir une option parmis les deux choix suivants:");
		
		Scanner  choixNumero1 = new Scanner(System.in) ;
		int a = choixNumero1.nextInt() ;
		
		System.out.println("1.Ajouter un nombre");
		
		System.out.println("2.Afficher les nombres existants");
	}

}

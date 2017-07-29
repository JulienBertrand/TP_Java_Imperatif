import java.util.Scanner;

public class Programme {

	public static void main(String[] args) {
		/*
		 * Faire un programme avec le menu suivant : 
		 * 1.Ajouter un nombre 
		 * Lorqu'un nombre est ajouté, l'ajoute au tableau
		 * 2.Afficher les nombres existants
		 */
		Scanner questionUser = new Scanner(System.in); // initialise la classe scanner
		int choix;
		int valeur = 0; 

		int[] array = new int[1]; // création un nouveau tableau contenant une case 

		do { // do_while permettant de faire une boucle et de réafficher le menu de choix
			
			//Affichage du menu
			System.out.println("///////////////////////////////////////////////");
			System.out.println("Veuillez choisir une option parmi les choix suivants:");
			System.out.println("1.Ajouter un nombre");
			System.out.println("2.Afficher les nombres existants");
			System.out.println();

			choix = questionUser.nextInt(); //permet de récupérer le choix de l'utilisateur (1 ou 2)

			if (choix == 1) { //choix numero 1, indiquer un nombre qui sera ensuite ajouté au tableau
				int nombreEntre; // définit la variable nombreEntre correspondant au nombre entré par l'utilisateur
				System.out.println("Veuillez saisir un nombre");
				
				nombreEntre = questionUser.nextInt(); // Prends en compte la valeur saisie par l'utilisiteur
				
				/* Ajout d'une nouvelle case au tableau en créant un tableau temporaire
				 * et en collant les valeurs du tableau existant dans le nouveau  
				 */
				if (valeur > array.length - 1) { 
					int[] tableauTemp = new int[array.length + 1]; // définit un tableau plus grand d'unr case si plus de place
					for (int i = 0; i <array.length; i++) { // condition for pour parcourir le tableau initial
						tableauTemp[i] = array[i];  // colle les valeurs de array dans tableauTemp
					}
					array = tableauTemp; // retransfere le tableau temp augmenté dans le tableau array initial

				}
				// Ajout de la nouvelle valeur dans le tableau
				array[valeur] = nombreEntre; // insère la valeur saisie dans le tableau
				valeur++; // ici vaeleur correspond au num de la case et nombrendté a la valeur que contiendra cette case
			}

			else if (choix == 2) { // Choix numero 2, le tableau s'affiche
				for (int i = 0; i < array.length; i++) {
					System.out.print(array[i] + ", "); // Affichage du tableau avec les valeurs saisies
										
				}
				System.out.println();
			}
		} while (choix == 1 || choix == 2); // condition à remplir pour que boucle s'exécute
		
		questionUser.close();

	}

}

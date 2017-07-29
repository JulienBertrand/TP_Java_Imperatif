
public class TestArray2 {

	public static void main(String[] args) {

		// Soit le tableau suivant
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

		// Quelle est la moyenne des éléments du tableau ?
		System.out.println("Quelle est la moyenne des �l�ments du tableau ?");
		double somme = 0;
		for (int i = 0; i < array.length; i++) {
			somme = somme + array[i];

		}
		double moyenne = somme / array.length;
		System.out.print("la moyenne des �l�ments du tableau est " + moyenne);
		System.out.println();

		///////////////////////////////////////////////////////////////////////

		// Quel est l'index dans le tableau de l'entier 15 ?
		System.out.println("Quel est l�index dans le tableau de l�entier 15 ?");

		int index;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 15) {
				index = i;
				System.out.print("l�index dans le tableau de l�entier 15 est :" + index);
				System.out.println();
				System.out.println("/////////////////////////////////////////////");

			}
		}
		///////////////////////////////////////////////////////////////////////

		// Ecrire un algorithme pour trouver le nombre d'entiers en doublon dans le
		// tableau
		System.out.println("Ecrire un algorithme pour trouver le nombre d�entiers en doublon dans le tableau");
		System.out.println();
		int doublon = 0;
		System.out.println("les chiffres en doublons sont :");

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					doublon++;
					System.out.println(array[i]);
				}
			}
		}

		System.out.print("Le nombre d'entiers en doublons dans le tableau est donc de " + doublon);

	}

}

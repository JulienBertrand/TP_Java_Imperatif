import java.util.Arrays;

public class TestArrayTri {

	public static void main(String[] args) {

		// Soit le tableau suivant
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

		// Faire un algorithme qui trie le tableau dans l'ordre ascendant
		System.out.println("La lise triee par ordre croissant est donc");
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				if (array[j] < array[i]) {
					int temporaire = 0;
					temporaire = array[j];
					array[j] = array[i];
					array[i] = temporaire;
				}
			}

			System.out.print(array[i] + ", ");

		}
		System.out.println();

		// Soit le tableau suivant
		array = new int[] { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

		// Utiliser la classe Arrays pour trier le tableau
		Arrays.sort(array);
		System.out.println("La lise triee par ordre croissant est donc");
		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i] + ", ");
		}
	}

}

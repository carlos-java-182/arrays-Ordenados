package arrays;

import java.util.Scanner;

public class Ordenar3 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int serie1[] = new int[10], serie2[] = new int[10], serie3[] = new int[20];
		boolean creciente = true;

		do {

			for (int i = 0; i < 10; i++) {
				System.out.print(i + " Digita una serie de números creciente: ");
				serie1[i] = entrada.nextInt();

			}

			for (int i = 0; i < 9; i++) {

				if (serie1[i] < serie1[(i + 1)]) {
					creciente = true;

				}

				if (serie1[i] > serie1[(i + 1)]) {
					creciente = false;

					System.out.println("La serie de números que digitaste no es creciente, digitala otra vez");
					break;
				}

			}

		} while (creciente == false);

		do {

			for (int i = 0; i < 10; i++) {
				System.out.print(i + " Digita otra serie de números creciente: ");
				serie2[i] = entrada.nextInt();

			}

			for (int i = 0; i < 9; i++) {

				if (serie2[i] < serie2[(i + 1)]) {
					creciente = true;

				}

				if (serie2[i] > serie2[(i + 1)]) {
					creciente = false;

					System.out.println("La serie de números que digitaste no es creciente, digitala otra vez");
					break;
				}

			}

		} while (creciente == false);

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < 10 && j < 10) {

			if (serie1[i] < serie2[j]) {
				serie3[k] = serie1[i];
				i++;
				k++;
			} else {
				serie3[k] = serie2[j];
				j++;
				k++;
			}

		}

		if (i == 10) {
			while (j < 10) {
				serie3[k] = serie2[j];
				j++;
				k++;
			}
		} else {
			while (i < 10) {
				serie3[k] = serie1[j];
				j++;
				k++;
			}
		}

		for (i = 0; i < 20; i++) {
			System.out.println(i + ".- La serie resultante es: " + serie3[i]);
		}

	}

}

package Task2_13;

import java.util.Scanner;

/*ѕо аналогии создать двумерный массив, заполнить его случайными числами или вручную. дл€ этого массива:
вывести все элементы в пр€мом и обратном пор€дке
найти минимальный и максимальный элементы*/

public class MatrixNM {

	public static void main(String[] args) {
		System.out.print("Enter amount of strings in the array: ");
		int m = keyboardInputInt();
		System.out.print("Enter amount of columns in the array: ");
		int n = keyboardInputInt();
		int[][] mas = new int[m][n];
		mas = fillingInArray(mas);
		System.out.println("Array in ASC order: ");
		printArrayASC(mas);
		System.out.println("Array in DESC order: ");
		printArrayDESC(mas);
		System.out.println("\n");
		int max = FindMaxElement(mas);
		System.out.println("\n" + "Max element is " + max);
		int min = FindMinElement(mas);
		System.out.println("\n" + "Max element is " + min);
		/*
		 * System.out.println("\n\n" + "Resulting array: "); printArray(mas);
		 */
	}

	// ¬вод Int с клавиатуры
	public static int keyboardInputInt() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		return number;
	}

	// «аполнение массива случайными числами
	public static int[][] fillingInArray(int[][] array) {
		int[][] result = new int[array.length][array[0].length];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				result[i][j] = keyboardInputInt();
			}
			// System.out.print(result[i] + " ");
		}
		return result;
	}

	// ¬ывод двумерного массива в пр€мом пор€дке
	public static void printArrayASC(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println();
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
		}
		System.out.println();
	}

	// ¬ывод двумерного массива в обратном пор€дке
	public static void printArrayDESC(int[][] array) {
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println();
			for (int j = array[0].length - 1; j >= 0; j--) {
				System.out.print(array[i][j] + " ");
			}
		}
	}

	// ѕоиск максимального элемента
	public static int FindMaxElement(int[][] array) {
		int max = array[0][0];
		for (int i = 1; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (max < array[i][j]) {
					max = array[i][j];
				}
			}
		}
		return max;
	}

	// ѕоиск минимального элемента
	public static int FindMinElement(int[][] array) {
		int min = array[0][0];
		for (int i = 1; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (min > array[i][j]) {
					min = array[i][j];
				}
			}
		}
		return min;
	}
}
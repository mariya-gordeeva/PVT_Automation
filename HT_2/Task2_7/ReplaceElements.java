package task2_7;

import java.util.Scanner;

// Пройти по массиву и поменять местами первый и последний, второй и предпоследний и т.д.

public class ReplaceElements {

	public static void main(String[] args) {
		System.out.print("Enter a size of the array: ");
		int size = keyboardInputInt();
		int[] mas = new int[size];
		mas = fillingInArray(mas);
		System.out.print("\n\n" + "New array:" + "\n");
		mas = replaceElements(mas);
		printArray(mas);
	}

	// Ввод Int с клавиатуры
	public static int keyboardInputInt() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		return number;
	}

	// Заполнение массива случайными числами
	public static int[] fillingInArray(int[] array) {
		int[] result = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			result[i] = (int) (Math.random() * 10);
			System.out.print(result[i] + " ");
		}
		return result;
	}

	// Вывод массива в прямом порядке
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	// Поменять местами первый и последний, второй и предпоследний и т.д.
	public static int[] replaceElements(int[] array) {
		int[] result = new int[array.length];
		int k = 1;
		if (array.length % 2 == 0) {
			for (int i = 0; i < array.length / 2; i++) {
				result[i] = array[array.length - k];
				result[array.length - k] = array[i];
				k++;
			}
		} else {
			for (int i = 0; i < array.length / 2 + 1; i++) {
				result[i] = array[array.length - k];
				result[array.length - k] = array[i];
				k++;
			}
		}
		return result;
	}
}

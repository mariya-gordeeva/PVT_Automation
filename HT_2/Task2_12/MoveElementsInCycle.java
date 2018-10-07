package Task2_12;

import java.util.Scanner;

// Циклически сдвинуть все элементы вправо на 2 позиции (1-й элемент станет 3-м, 2-й стент 4-м и т.д.) c использованием while

public class MoveElementsInCycle {

	public static void main(String[] args) {
		System.out.print("Enter a size of the array: ");
		int size = keyboardInputInt();
		int[] mas = new int[size];
		mas = fillingInArray(mas);
		mas = movingElementsInCycle(mas);
		System.out.println("\n\n" + "Resulting array: ");
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

	// Циклическое смещение элементов вправо на 2 позиции
	public static int[] movingElementsInCycle(int[] array) {
		int result[] = new int[array.length];
		int i = 0;
		result[0] = array[array.length - 2];
		result[1] = array[array.length - 1];
		while (i < array.length - 2) {
			result[i + 2] = array[i];
			i++;
		}
		return result;
	}
}
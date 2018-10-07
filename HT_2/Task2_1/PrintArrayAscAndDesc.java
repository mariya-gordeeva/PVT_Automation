package task2_1;

import java.util.Scanner;

// Пройти по массиву, вывести все элементы в прямом и в обратном порядке

public class PrintArrayAscAndDesc {

	public static void main(String[] args) {
		System.out.print("Enter a size of the array: ");
		int size = keyboardInputInt();
		int[] mas = new int[size];
		mas = fillingInArray(mas);
		printASC(mas);
		System.out.println("");
		printDESC(mas);
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
		}
		return result;
	}
	// Вывод массива в прямом порядке
	public static void printASC(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	// Вывод массива в обратном порядке
	public static void printDESC(int[] array) {
		int i = array.length - 1;
		while (i >= 0) {
			System.out.print(array[i] + " ");
			i--;
		}
	}

}

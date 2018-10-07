package task2_2;

import java.util.Scanner;

//Найти произведения всех элементов массива, вывести

public class MultiplyArray {

	public static void main(String[] args) {
		System.out.print("Enter a size of the array: ");
		int size = keyboardInputInt();
		int[] mas = new int[size];
		mas = fillingInArray(mas);
		System.out.println("");
		int result = multiplication(mas);
		System.out.print("The result of array emelents is " + result + ".");
	}

	// Ввод Int с клавиатуры
	public static int keyboardInputInt() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		return number;
	}

	// Заполнение массива с клавиатуры
	public static int[] fillingInArray(int[] array) {
		int[] result = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter the " + String.valueOf(i + 1) + " array element: ");
			result[i] = keyboardInputInt();
		}
		return result;
	}

	// Перемножение
	public static int multiplication(int[] array) {
		int result = 1;
		for (int i = 0; i < array.length; i++) {
			result *= array[i];
		}
		return result;
	}
}

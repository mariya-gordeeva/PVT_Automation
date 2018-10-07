package task2_8;

import java.util.Scanner;

// Найти минимальный-максимальный элементы и вывести

public class MinMaxElements {

	public static void main(String[] args) {
		System.out.print("Enter a size of the array: ");
		int size = keyboardInputInt();
		int[] mas = new int[size];
		mas = fillingInArray(mas);
		System.out.println();
		int minValue = FindMinElement(mas);
		int maxValue = FindMaxElement(mas);
		System.out.print("\n" + "The minimum value is: " + minValue + ".\n" + "The maximum value is: " + maxValue + "." );
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
	
	// Поиск минимального элемента
	public static int FindMinElement(int[] array) {
		int min = array[0];
		for (int i = 1; i < array.length; i++) {
			if(min > array[i]) {
				min = array[i];
			}
		}
		return min;
	}
	// Поиск максимального элемента
	public static int FindMaxElement(int[] array) {
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if(max  < array[i]) {
				max = array[i];
			}
		}
		return max;
	}
}

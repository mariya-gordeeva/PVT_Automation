package task_2;

import java.util.Scanner;

// Найти номер минимального-максимального элементов и вывести

public class MaxAndMinElementsIndexes {

	public static void main(String[] args) {
		System.out.print("Enter a size of the array: ");
		int size = keyboardInputInt();
		int[] mas = new int[size];
		mas = fillingInArray(mas);
		System.out.println();
		int indexOfMin= FindMinElementIndex(mas);
		int indexOfMax = FindMaxElementIndex(mas);
		System.out.print("\n" + "The index of minimun value is: " + indexOfMin + ".\n" + "The index of maximum value is: " + indexOfMax + "." );
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
	public static int FindMinElementIndex(int[] array) {
		int min = array[0];
		int index = 0;
		for (int i = 1; i < array.length; i++) {
			if(min > array[i]) {
				min = array[i];
				index = i;
			}
		}
		return index;
	}
	// Поиск максимального элемента
	public static int FindMaxElementIndex(int[] array) {
		int index = 0;
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if(max  < array[i]) {
				max = array[i];
				index = i;
			}
		}
		return index;
	}
}

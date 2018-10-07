package task2_6;

import java.util.Scanner;

//Пройти по массиву и поменять местами каждые 2 соседних элемента

public class Replace2AdjacentElements {

	public static void main(String[] args) {
		System.out.print("Enter a size of the array: ");
		int size = keyboardInputInt();
		int[] mas = new int[size];
		mas = fillingInArray(mas);
		System.out.print("\n\n" + "New array:" + "\n");
		mas = replaceAdjacentElements(mas);
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
	
	// Замена мест каждых 2 соседних элемента
	public static int[] replaceAdjacentElements(int[] array) {
		int[] result = new int[array.length];
		for (int i = 0; i < array.length; i += 2) {
			if (i != array.length - 1) {
				result[i] = array[i+1];
				result[i+1] = array[i];
			}else {
				result[i] = array[i];
			}
		}
		return result;
	}

}

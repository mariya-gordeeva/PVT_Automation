package task2_10;

import java.util.Scanner;

// Проверить, является ли массив возрастающей последовательностью (каждое следующее число больше предыдущего)

public class WheterIncreasingSequenceArray {

	public static void main(String[] args) {
		System.out.print("Enter a size of the array: ");
		int size = keyboardInputInt();
		int[] mas = new int[size];
		mas = fillingInArray(mas);
		if (isIncreasingSequenceArray(mas) == true) {
			System.out.print("Specified array is increasing sequence array.");
		} else {
			System.out.print("Specified array is not increasing sequence array.");
		}
	}

	// ¬вод Int с клавиатуры
	public static int keyboardInputInt() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		return number;
	}

	// «аполнение массива с клавиатуры
	public static int[] fillingInArray(int[] array) {
		int[] result = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter the " + String.valueOf(i + 1) + " array element: ");
			result[i] = keyboardInputInt();
		}
		return result;
	}

	//  ѕроверка, €вл€етс€ ли массив возрастающей последовательностью
	public static boolean isIncreasingSequenceArray(int[] array) {
		int previousElement = array[0];
		boolean isNextElementGreater = false;
		for (int i = 1; i < array.length; i++) {
			if (previousElement < array[i]) {
				previousElement = array[i];
				isNextElementGreater = true;
			}else {
				isNextElementGreater = false;
			}
		}
		return isNextElementGreater;
	}
}
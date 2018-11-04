package task1;

import java.util.Scanner;


public class Massive {

	public int keyboardInputInt() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		return number;
	}

	public int[] fillingInArrayRandomly(int[] array) {
		int[] result = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			result[i] = (int) (Math.random() * 10);
		}
		return result;
	}

	public int[] fillingInArrayByKeybord(int[] array) {
		int[] result = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter the " + String.valueOf(i + 1) + " array element: ");
			result[i] = keyboardInputInt();
		}
		return result;
	}

	public int arrayMultiplication(int[] array) {
		int result = 1;
		for (int i = 0; i < array.length; i++) {
			result *= array[i];
		}
		return result;
	}

	public int[] replaceAdjacentElements(int[] array) {
		int[] result = new int[array.length];
		for (int i = 0; i < array.length; i += 2) {
			if (i != array.length - 1) {
				result[i] = array[i + 1];
				result[i + 1] = array[i];
			} else {
				result[i] = array[i];
			}
		}
		return result;
	}

}

package task2_7;

import java.util.Scanner;

// ������ �� ������� � �������� ������� ������ � ���������, ������ � ������������� � �.�.

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

	// ���� Int � ����������
	public static int keyboardInputInt() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		return number;
	}

	// ���������� ������� ���������� �������
	public static int[] fillingInArray(int[] array) {
		int[] result = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			result[i] = (int) (Math.random() * 10);
			System.out.print(result[i] + " ");
		}
		return result;
	}

	// ����� ������� � ������ �������
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	// �������� ������� ������ � ���������, ������ � ������������� � �.�.
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

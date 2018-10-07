package task2_3;

import java.util.Scanner;

// ������ 3-� ������� �������� �� 2 (2-�� ���������)

public class MultiplyOnTwo {

	public static void main(String[] args) {
		System.out.print("Enter a size of the array: ");
		int size = keyboardInputInt();
		int[] mas = new int[size];
		mas = fillingInArray(mas);
		System.out.println("\n \n" + "Result of the Method 1:");
		multiplicationIndexes(mas);
		System.out.println("\n \n"  + "Result of the Method 2:");
		multiplicationMOD(mas);
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

	// ��������� ������� 3-�� �������� �� 2, ������ 1
	public static int[] multiplicationIndexes(int[] array) {
		int[] result = new int[array.length];
		for (int i = 2; i < array.length; i += 3) {
			result[i] = array[i] * 2;
			System.out.print(result[i] + " ");
		}
		return result;
	}

	// ��������� ������� 3-�� �������� �� 2, ������ 2
	public static int[] multiplicationMOD(int[] array) {
		int[] result = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			if (i % 3 == 2) {
				result[i] = array[i] * 2;
				System.out.print(result[i] + " ");
			}
		}
		return result;
	}
}

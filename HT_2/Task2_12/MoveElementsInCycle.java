package Task2_12;

import java.util.Scanner;

// ���������� �������� ��� �������� ������ �� 2 ������� (1-� ������� ������ 3-�, 2-� ����� 4-� � �.�.) c �������������� while

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

	// ����������� �������� ��������� ������ �� 2 �������
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
package task2_1;

import java.util.Scanner;

// ������ �� �������, ������� ��� �������� � ������ � � �������� �������

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
		}
		return result;
	}
	// ����� ������� � ������ �������
	public static void printASC(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	// ����� ������� � �������� �������
	public static void printDESC(int[] array) {
		int i = array.length - 1;
		while (i >= 0) {
			System.out.print(array[i] + " ");
			i--;
		}
	}

}

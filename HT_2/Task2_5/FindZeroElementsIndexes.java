package task2_5;

import java.util.Scanner;

// ����� � ������� ����� ������� ���������
// ���� ������� ��������� ��� - ������� ���������, ��� �� ���

public class FindZeroElementsIndexes {

	public static void main(String[] args) {
		System.out.print("Enter a size of the array: ");
		int size = keyboardInputInt();
		int[] mas = new int[size];
		mas = fillingInArray(mas);
		System.out.print("\n\n" + "Indexes: ");
		PrintIndexes(mas);
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
	// ����� � ����� ���������� ��������� = 0
	public static void PrintIndexes(int[] array) {
		boolean flag = false;
		for (int i = 0; i < array.length; i++) {
			if(array[i] == 0) {
				System.out.print( i + " ");
				flag = true;
			}
		}
		if (flag == false) {
			System.out.print("There are no elements with zero values.");
		}
	}
}

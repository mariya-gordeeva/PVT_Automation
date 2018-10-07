package task2_6;

import java.util.Scanner;

//������ �� ������� � �������� ������� ������ 2 �������� ��������

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
	
	// ������ ���� ������ 2 �������� ��������
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

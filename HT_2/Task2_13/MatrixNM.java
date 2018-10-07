package Task2_13;

import java.util.Scanner;

/*�� �������� ������� ��������� ������, ��������� ��� ���������� ������� ��� �������. ��� ����� �������:
������� ��� �������� � ������ � �������� �������
����� ����������� � ������������ ��������*/

public class MatrixNM {

	public static void main(String[] args) {
		System.out.print("Enter amount of strings in the array: ");
		int m = keyboardInputInt();
		System.out.print("Enter amount of columns in the array: ");
		int n = keyboardInputInt();
		int[][] mas = new int[m][n];
		mas = fillingInArray(mas);
		System.out.println("Array in ASC order: ");
		printArrayASC(mas);
		System.out.println("Array in DESC order: ");
		printArrayDESC(mas);
		System.out.println("\n");
		int max = FindMaxElement(mas);
		System.out.println("\n" + "Max element is " + max);
		int min = FindMinElement(mas);
		System.out.println("\n" + "Max element is " + min);
		/*
		 * System.out.println("\n\n" + "Resulting array: "); printArray(mas);
		 */
	}

	// ���� Int � ����������
	public static int keyboardInputInt() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		return number;
	}

	// ���������� ������� ���������� �������
	public static int[][] fillingInArray(int[][] array) {
		int[][] result = new int[array.length][array[0].length];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				result[i][j] = keyboardInputInt();
			}
			// System.out.print(result[i] + " ");
		}
		return result;
	}

	// ����� ���������� ������� � ������ �������
	public static void printArrayASC(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println();
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
		}
		System.out.println();
	}

	// ����� ���������� ������� � �������� �������
	public static void printArrayDESC(int[][] array) {
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println();
			for (int j = array[0].length - 1; j >= 0; j--) {
				System.out.print(array[i][j] + " ");
			}
		}
	}

	// ����� ������������� ��������
	public static int FindMaxElement(int[][] array) {
		int max = array[0][0];
		for (int i = 1; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (max < array[i][j]) {
					max = array[i][j];
				}
			}
		}
		return max;
	}

	// ����� ������������ ��������
	public static int FindMinElement(int[][] array) {
		int min = array[0][0];
		for (int i = 1; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (min > array[i][j]) {
					min = array[i][j];
				}
			}
		}
		return min;
	}
}
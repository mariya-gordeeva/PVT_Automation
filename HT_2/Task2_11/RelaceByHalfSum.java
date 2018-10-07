package Task2_11;

import java.util.Scanner;

//Заменить все элементы массива на полусумму соседних элементов

public class RelaceByHalfSum {

	public static void main(String[] args) {
		System.out.print("Enter a size of the array: ");
		int size = keyboardInputInt();
		int[] mas = new int[size];
		mas = fillingInArray(mas);
		mas = relacingByHalfSum(mas);
		printArray(mas);
	}

	// Ввод Int с клавиатуры
	public static int keyboardInputInt() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		return number;
	}

	// Заполнение массива с клавиатуры
	public static int[] fillingInArray(int[] array) {
		int[] result = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter the " + String.valueOf(i + 1) + " array element: ");
			result[i] = keyboardInputInt();
		}
		return result;
	}
	
	// Вывод массива в прямом порядке
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	// Замена элементов полусуммами соседних элементов
	public static int[] relacingByHalfSum(int[] array) {
		int result[] = new int[array.length];
		for (int i = 1; i < array.length-1; i++) {
			
				result[i] = (array[i-1] + array[i+1])/2;			
			}
		result[0] = array[0];
		result[array.length-1] = array[array.length-1];
		return result;
	}
}
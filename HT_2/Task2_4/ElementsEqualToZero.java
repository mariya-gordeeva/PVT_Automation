package task2_4;

import java.util.Scanner;

// Найти количество нулевых элементов, вывести количество
// Если нулевых элементов нет - вывести сообщение, что их нет

public class ElementsEqualToZero {

	public static void main(String[] args) {
		System.out.print("Enter a size of the array: ");
		int size = keyboardInputInt();
		int[] mas = new int[size];
		mas = fillingInArray(mas);
		System.out.println();
		int counter = HowManyZeros(mas);
		if (counter == 0) {
			System.out.print("\n" + "There are no elements with value that equals 0. ");
		}else {
			System.out.print("\n" + "There are " + counter + " elements value that equals 0.");
		}

	}

	// Ввод Int с клавиатуры
	public static int keyboardInputInt() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		return number;
	}

	// Заполнение массива случайными числами
	public static int[] fillingInArray(int[] array) {
		int[] result = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			result[i] = (int) (Math.random() * 10);
			System.out.print(result[i] + " ");
		}
		return result;
	}
	// Поиск количества элементов = 0
	public static int HowManyZeros(int[] array) {
		int counter = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i] == 0) {
				counter++;
			}
		}
		return counter;
	}
}

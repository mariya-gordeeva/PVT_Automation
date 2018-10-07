package Task3_3;

import java.util.Scanner;

//Возвести число в квадрат, вернуть результат возведения

public class PowerOf2AndPrint {

	public static void main(String[] args) {
		System.out.println("Enter a number to square: ");
		int number = intKeyboardInput();
		System.out.print("\n" + "The result is " + power2(number) + ".");

	}
	// Ввод числа с клавиатуры
	public static int intKeyboardInput() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}
	
	//Возведение числа в  квадрат
	public static int power2(int number) {
		return number*number;
	}
}

package Task3_4;

import java.util.Scanner;

//�������� ����� � �������, ������� ��������� ����������

public class PowerOf3AndPrint {

	public static void main(String[] args) {
		System.out.println("Enter a number to square: ");
		int number = intKeyboardInput();
		System.out.print("\n" + "The result is " + power3(number) + ".");

	}
	// ���� ����� � ����������
	public static int intKeyboardInput() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}
	
	//���������� ����� �  �������
	public static int power3(int number) {
		return number*number*number;
	}
}

package Task3_2;

import java.util.Scanner;

//��������� ������ ����� ��� ��������, ������� boolean ���������

public class IsNumberEven {

	public static void main(String[] args) {
		System.out.println("Enter a number to check even if it or uneven: ");
		int number = intKeyboardInput();
		boolean result = isEven(number);
		if(result == true) {
			System.out.println("\n" + "Number " + number + " is even.");
		}else {
			System.out.println("\n" + "Number " + number + " is not even.");
		}
	}

	// ���� ����� � ����������
	public static int intKeyboardInput() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}

	// �������� �������� �����
	public static boolean isEven(int number) {
		if(number%2 == 0) {
			return true;
		}else {
			return false;
		}
	}
}

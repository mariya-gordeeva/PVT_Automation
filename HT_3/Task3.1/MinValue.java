package Task3_1;

import java.util.Scanner;

//����� ����������� ����� �� 2 �����, ������� �����������

public class MinValue {
	public static void main(String[] args) {
		System.out.println("Enter the first number: ");
		int firstNumber = intKeyboardInput();
		System.out.println("\n" + "Enter the second number: ");
		int secondNumber = intKeyboardInput();
		System.out.println("\n" + "Min values is: " + findMin(firstNumber, secondNumber));
		
	}
	// ���� ����� � ����������
	public static int intKeyboardInput(){
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}
	
	// ����� ������������ �����
	public static int findMin(int x, int y) {
		if(x < y) {
			return x;
		}else return y;
	}
}

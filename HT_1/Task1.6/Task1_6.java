package task1_6;

public class Task1_6 {
	public static void main(String[] args) {
		//А
		int i = 149;
		short s = 5;
		long l = 1234567890;
		double d = 12.2309d;
		float f = 0.145f;
		char c = 'c';
		boolean b = true;
		
		//B
		int result1 = i + s;
		double result2 = l + d;
		double result3 = d*f;
		boolean result4 = l > d;
		boolean result5 = f < i;
		boolean result6 = s == d;
		boolean result7 = i != f;
		
		//C
		System.out.println(i + " " + s + " " + l + " " + d + " " + f + " " + c + " " + b);
		System.out.print(result1 + " " + result2 + " " + result3 + " " + result4 + " " + result5 + " " + result6 + " " + result7);
	}
}
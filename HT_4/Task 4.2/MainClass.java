package Task5_1;

public class MainClass {

	public static void main(String[] args) {
		StaticExample staticexample = new StaticExample();
//		System.out.println(staticexample.getPi());
		
		System.out.println(staticexample.PI);
		StaticExample staticexample1 = new StaticExample();
		staticexample1.PI = 2.0;
		
		System.out.println(staticexample1.PI);
		//System.out.println(StaticExample.getPi());
		//System.out.println(StaticExample.PI);
	}

}

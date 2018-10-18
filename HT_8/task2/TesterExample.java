package task_2;

import java.lang.reflect.InvocationTargetException;

public class TesterExample {

	public static void main(String[] args) {
		Tester tester = null;
		try {
			Class<?> clazz = Class.forName(Tester1.class.getName());
			Class<?>[] params = { int.class, String.class };
			tester = (Tester) clazz.getConstructor(params).newInstance(1, "Serger Ivanov");
		} catch (ClassNotFoundException | IllegalArgumentException | InvocationTargetException | InstantiationException
				| NoSuchMethodException | IllegalAccessException | SecurityException e) {
			e.printStackTrace();
		}
		tester.printData();
	}
}
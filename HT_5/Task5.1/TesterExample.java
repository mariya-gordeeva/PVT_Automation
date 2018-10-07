package Task5_1;

public class TesterExample {

	public static void main(String[] args) {
		String name = "Dmitry";
		String surname = "Fedorov";
		int expirienceInYears = 20;
		String englishLevel = "B2";
		int salary = 500;

		Tester tester1 = new Tester(name, surname);
		Tester tester2 = new Tester(name, surname, expirienceInYears);
		Tester tester3 = new Tester(name, surname, expirienceInYears, englishLevel, salary);
		
		tester1.PrintTesterInfo(name, surname);
		tester2.PrintTesterInfo(name, surname, expirienceInYears);
		tester3.PrintTesterInfo(name, surname, expirienceInYears, englishLevel, salary);
	}

}

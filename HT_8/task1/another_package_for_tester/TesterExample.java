package another_package_for_tester;

import task_1.Tester;

public class TesterExample {

	public static void main(String[] args) {
		String name = "Mary";
		String surname = "Gordeeva";
		int expirienceInYears = 4;
		String englishLevel = "B1";
		int salary = 100500;
		
		Tester tester = new Tester(name, surname, expirienceInYears);
		tester.setEnglishLevel(englishLevel);
		tester.setSalary(salary);
		//tester.newSalary(salary); //Impossible to use due to the "Private" modifier 
		System.out.println(tester.expirienceInMonths(expirienceInYears));
		tester.printTesterName(name, surname);
		tester.printTesterInfo(name, surname, expirienceInYears, englishLevel, salary);
	}

}

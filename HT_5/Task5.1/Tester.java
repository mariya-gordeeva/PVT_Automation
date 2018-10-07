package Task5_1;

public class Tester {
	String name;
	String surname;
	int expirienceInYears;
	String englishLevel;
	int salary;

	String messageName = "Name: ";
	String messageSpace = " ";
	String messageExpirienceInYears = "Expirience: ";
	String messageNewline = "\n";
	String messageEnglishLevel = "English Level: ";
	String messageSalary = "Salary: ";

	// Перегрузить в этом классе 3 конструктора, каждый из которых будет
	// последовательно вызывать другой используя this(...);
	public Tester(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public Tester(String name, String surname, int expirienceInYears) {
		this(name, surname);
		this.expirienceInYears = expirienceInYears;
	};

	public Tester(String name, String surname, int expirienceInYears, String englishLevel, int salary) {
		this(name, surname, expirienceInYears);
		this.englishLevel = englishLevel;
		this.salary = salary;
	};

	// Написать 3 любых перегруженных метода в этом классе

	public void PrintTesterInfo(String name, String surname) {
		System.out.println(messageName + this.name + messageSpace + this.surname + messageNewline
				+ messageExpirienceInYears + this.expirienceInYears + messageNewline + messageEnglishLevel
				+ this.englishLevel + messageNewline + messageSalary + this.salary + messageNewline);
	}

	public void PrintTesterInfo(String name, String surname, int expirienceInYears) {
		System.out.println(messageName + this.name + messageSpace + this.surname + messageNewline
				+ messageExpirienceInYears + this.expirienceInYears + messageNewline + messageEnglishLevel
				+ this.englishLevel + messageNewline + messageSalary + this.salary + messageNewline);
	}

	public void PrintTesterInfo(String name, String surname, int expirienceInYears, String englishLevel, int salary) {
		System.out.println(messageName + this.name + messageSpace + this.surname + messageNewline
				+ messageExpirienceInYears + this.expirienceInYears + messageNewline + messageEnglishLevel
				+ this.englishLevel + messageNewline + messageSalary + this.salary + messageNewline);
	}

}

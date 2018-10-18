package task_1;

public class Tester {
	public String name;
	public String surname;
	int expirienceInYears;
	protected String englishLevel;
	private int salary;

	private String messageName = "Name: ";
	private String messageSpace = " ";
	private String messageExpirienceInYears = "Expirience: ";
	private String messageNewline = "\n";
	private String messageEnglishLevel = "English Level: ";
	private String messageSalary = "Salary: ";

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

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getSurname() {
		return surname;
	}

	void setSurname(String surname) {
		this.surname = surname;
	}

	int getExpirienceInYears() {
		return expirienceInYears;
	}

	void setExpirienceInYears(int expirienceInYears) {
		this.expirienceInYears = expirienceInYears;
	}

	String getEnglishLevel() {
		return englishLevel;
	}

	void setEnglishLevel(String englishLevel) {
		this.englishLevel = englishLevel;
	}

	int getSalary() {
		return salary;
	}

	void setSalary(int salary) {
		this.salary = salary;
	}

	private int newSalary(int salary) {
		return salary * 2;
	}

	int expirienceInMonths(int expirienceInYears) {
		return this.expirienceInYears * 12;
	}

	protected void printTesterName(String name, String surname) {
		System.out.println(messageName + this.name + messageSpace + this.surname + messageNewline);
	}
	
	public void printTesterInfo(String name, String surname, int expirienceInYears, String englishLevel, int salary) {
		System.out.println(messageName + this.name + messageSpace + this.surname + messageNewline
				+ messageExpirienceInYears + this.expirienceInYears + messageNewline + messageEnglishLevel
				+ this.englishLevel + messageNewline + messageSalary + this.salary + messageNewline);
	}
}

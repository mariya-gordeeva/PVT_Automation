package Task4_1;

public class Person {
	public String name;
	public String surname;
	public int age;
	public String phone;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	//Выводит на экран всю информацию о пользователе (name + surname + age +  phone) в одну строку
	public void printAllInformation() {
		System.out.println(this.name + " " + this.surname + " " + this.age + " " + this.phone);
	}

	//Выводит только имя и фамилию (name + surname) пользователя
	public void printName() {
		System.out.println(this.name + " " + this.surname);
	}
	
	//Возвращает значения true/false в зависимости от age объекта (> 18)
	public boolean isAdult() {
		return this.age > 18 ? true : false;
	}
}

package Task4_1;

public class PersonExample {

	public static void main(String[] args) {
		String name = "Mary";
		String surname = "Gordeeva";
		int age = 26;
		String phone = "+375-29-000-00-00";
		String messageAdult = "The User is adult ";
		String messageNotAdult = "The User is not adult";

		Person person = new Person();

		person.setName(name);
		person.setSurname(surname);
		person.setAge(age);
		person.setPhone(phone);

		System.out.println("Only name: " + person.getName());
		System.out.println("Name and last name: " + person.getSurname());
		System.out.println("Age: " + person.getAge());
		System.out.println("Phone: " + person.getPhone() + "\n");

		person.printAllInformation();
		person.printName();
		System.out.println(person.isAdult() == true ? messageAdult : messageNotAdult);
	}

}

package task_1;

public class Planet extends TheStarSystem {
	protected String type;
	protected String name;

	public Planet(String type) {
		this.type = type;
	};

	public Planet(String type, String name) {
		this(type);
		this.name = name;
	}

	public Planet(String type, String name, String mass) {
		this(type, name);
		this.mass = mass;
	}

	@Override
	public void printTheStarSystemName() {
		System.out.print(super.theStarSystemName + super.messageSpace);

	}

	@Override
	public void printTheMass() {
		System.out.print(mass + super.messageSpace);
	}

	public void printType() {
		System.out.println(type);
	}

	public void printAllPlanetInformation() {
		System.out.println(super.theStarSystemName + messageSpace + type + messageSpace + name + messageSpace + mass);
	}

}

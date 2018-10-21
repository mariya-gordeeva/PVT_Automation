package task_1;

public class Earth extends Planet {
	private int diameter;
	private double orbitalPeriodInDays;

	public Earth(String type, String name, String mass) {
		super(type, name, mass);
	}

	public Earth(String type, String name, String mass, double orbitalPeriodInDays, int diameter) {
		super(type, name, mass);
		this.orbitalPeriodInDays = orbitalPeriodInDays;
		this.diameter = diameter;
	}

	public void printEarthInformation() {
		super.printAllPlanetInformation();
		System.out.println(diameter + super.messageSpace + orbitalPeriodInDays);
	}

	public void draw() {
		System.out.println("I have no creativity, so I just draw the Earth" + super.messageNewLine);
	}

}

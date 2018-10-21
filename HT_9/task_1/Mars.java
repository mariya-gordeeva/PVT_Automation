package task_1;

public class Mars extends Planet {
	private int diameter;
	private double orbitalPeriodInDays;

	public Mars(String type, String name, String mass, double orbitalPeriodInDays, int diameter) {
		super(type, name, mass);
		this.orbitalPeriodInDays = orbitalPeriodInDays;
		this.diameter = diameter;
	}

	public void printMarsInformation() {
		super.printAllPlanetInformation();
		System.out.println(diameter + super.messageSpace + orbitalPeriodInDays);
	}

	public void draw() {
		System.out.println("I have no creativity, so I just draw the Mars" + super.messageNewLine);
	}

}

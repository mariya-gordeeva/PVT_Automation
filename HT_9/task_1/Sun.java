package task_1;

public class Sun extends Star {

	private String solarRadius;
	private String temprature;

	public Sun(String solarRadius, String temprature) {
		this.solarRadius = solarRadius;
		this.temprature = temprature;

	}

	public void PrintSunInformation() {
		super.printTheStarSystemName();
		super.printTheMass();
		System.out.println(super.getStellarClassification() + super.messageSpace + super.getLuminosity() + solarRadius
				+ super.messageSpace + temprature);
	}

	public void draw() {
		System.out.println("I have no creativity, so I just draw the Sun" + super.messageNewLine);

	}
}

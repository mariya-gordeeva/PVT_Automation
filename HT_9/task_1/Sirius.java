package task_1;

public class Sirius extends Star {
	
	private String solarRadius;
	private String temprature;

	public Sirius(String solarRadius, String temprature) {
		this.solarRadius = solarRadius;
		this.temprature = temprature;

	}

	public void PrintSiriusInformation() {
		super.printTheStarSystemName();
		super.printTheMass();
		System.out.println(super.getStellarClassification() + super.messageSpace + super.getLuminosity() + solarRadius
				+ super.messageSpace + temprature);
	}

	public void draw() {
		System.out.println("I have no creativity, so I just draw the Sirius" + super.messageNewLine);

	}

}

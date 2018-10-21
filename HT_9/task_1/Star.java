package task_1;

public class Star extends TheStarSystem {
	private String stellarClassification;
	private String luminosity;

	@Override
	public void printTheStarSystemName() {
		System.out.print(super.theStarSystemName + super.messageSpace);

	}

	@Override
	public void printTheMass() {
		System.out.print(mass + super.messageSpace);
	}

	public String getStellarClassification() {
		return stellarClassification;
	}

	public void setStellarClassification(String stellarClassification) {
		this.stellarClassification = stellarClassification;
	}

	public String getLuminosity() {
		return luminosity;
	}

	public void setLuminosity(String luminosity) {
		this.luminosity = luminosity;
	}

	public String getMass() {
		return mass;
	}

	public void setMass(String mass) {
		this.mass = mass;
	}

}

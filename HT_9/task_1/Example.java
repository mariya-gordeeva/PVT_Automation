package task_1;

public class Example {

	public static void main(String[] args) {
		Mars mars = new Mars("Terrestrial ", "Mars", "0.107 Earths", 686.98, 6779);
		Earth earth = new Earth("Terrestrial ", "Earth", "5,9726x10^24 kg", 365.256363004, 12742);
		Sun sun = new Sun("1R", "5780K");
		Sirius sirius = new Sirius("1,7R", "9940K");
		
		mars.printAllPlanetInformation();
		mars.printMarsInformation();
		mars.printTheMass();
		mars.printTheStarSystemName();
		mars.printType();
		mars.draw();

		earth.printAllPlanetInformation();
		earth.printEarthInformation();
		earth.printTheMass();
		earth.printTheStarSystemName();
		earth.printType();
		earth.draw();
		
		sun.setLuminosity("1L");
		sun.setMass("1M");
		sun.setStellarClassification("G2V");
		sun.PrintSunInformation();
		sun.printTheMass();
		sun.printTheStarSystemName();
		sun.draw();
		
		sirius.setLuminosity("1,7R");
		sirius.setMass("~2M");
		sirius.setStellarClassification("A1V");
		sirius.PrintSiriusInformation();
		sirius.printTheMass();
		sirius.printTheStarSystemName();
		sirius.draw();
	
	}

}

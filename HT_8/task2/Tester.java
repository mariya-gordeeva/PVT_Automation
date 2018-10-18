package task_2;

public class Tester {
	   private int expirienceInYears;
	   private String name = "Mary Gordeeva";
	   private String expirienceMessage = " and expirience is ";
	   private String nameMessage = "Name is "; 
	   private String yearsMessage = " years.";
	    public Tester(int expirienceInYears, String name) {
	        this.expirienceInYears = expirienceInYears;
	        this.name = name;
	    }
	   public int getExpirienceInYears() {
	       return expirienceInYears;
	   }
	   public void setExpirienceInYears(int expirienceInYears) {
	       this.expirienceInYears = expirienceInYears;
	   }
	   public void setName(String name) {
	       this.name = name;
	   }
	   public void printData(){
	       System.out.println(nameMessage + this.name + expirienceMessage + this.expirienceInYears + this.yearsMessage);
	   }
	}
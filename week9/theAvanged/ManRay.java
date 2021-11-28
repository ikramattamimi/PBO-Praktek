package theAvanged;

public class ManRay extends SuperHero {
	public ManRay(String name, int powerLevel, Power power1, Power power2){
		super(name, powerLevel, power1, power2);
	}
	
	@Override
	void identity() {
		System.out.println("It's " + this.getName() 
		+ " the ManRay! It has the power "
		+ "level of " + this.getPowerLevel());
	}

}

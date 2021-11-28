package theAvanged;

public class FlyingDutchMan extends SuperHero{
	
	public FlyingDutchMan(String name, int powerLevel, Power power1, Power power2){
		super(name, powerLevel, power1, power2);
	}
	
	@Override
	void identity() {
		System.out.println("It's " + this.getName() 
		+ " the FlyingDutchMan! It has the power "
		+ "level of " + this.getPowerLevel());
	}

}

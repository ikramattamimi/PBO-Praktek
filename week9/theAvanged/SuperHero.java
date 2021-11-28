package theAvanged;

import java.util.*;
abstract class SuperHero implements Comparable<SuperHero>{
	private int powerLevel;
	String name;
	List<Power> powerList = new ArrayList<Power>();
	
	public SuperHero(String name, int powerLevel, Power power1, Power power2){
		this.name = name;
		this.powerLevel = powerLevel;
		this.powerList.add(power1);
		this.powerList.add(power2);
	}
	
	
	int getPowerLevel() {
		return this.powerLevel;
	}
	
	String getName() {
		return this.name;
	}
	
	void addPower(Power power) {
		this.powerList.add(power);
	}
	
	abstract void identity();
	
	void showPowers() {
		System.out.println(".....HEED ME....."
				+ "\nFOR MY NAAAAAAAME IS " + this.getName().toUpperCase() 
				+ "\nTIME TO SHOW YOU MY POWERS");
		for (Power p : this.powerList) {
			p.doPower();
		}
	}
	
	public int compareTo(SuperHero s) {
		if (this.powerLevel == s.powerLevel)
			return 0;
		else if(this.powerLevel > s.powerLevel)
			return 1;
		else
			return -1;
	}
	
}

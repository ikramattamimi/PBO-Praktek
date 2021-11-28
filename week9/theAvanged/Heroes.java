package theAvanged;

import java.util.*;

public class Heroes {
	public static void main (String[] args) {

		Power strength = new Strength();
		Power laserEye = new LaserEye();
		Power flying = new Flying();
		
		List<SuperHero> hero = new ArrayList<SuperHero>();
		hero.add(new ManRay("Gennichiro", 0, laserEye, strength));
		hero.add(new FlyingDutchMan("Shirai", 255, flying, laserEye));
		hero.add(new FlyingDutchMan("Tatenari", 36556, flying, laserEye));
		hero.add(new ManRay("Gyoubu Masataka Oniwa", 553, laserEye, strength));
		hero.add(new DirtyBubble("Arnastria", 666, strength, flying));
		
		
		Collections.sort(hero);
		for (SuperHero s : hero) {
			System.out.println("\n============================================");
			s.identity();
			s.showPowers();
			System.out.println("============================================");
			
		}
	}
}

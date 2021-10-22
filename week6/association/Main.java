/**
 * Program dengan Relationship Association
 * @author Ikram M B A
 * Referensi: https://www.geeksforgeeks.org/association-composition-aggregation-java/
 * */

package association;

class Meja {
	private String merek;
	
	Meja(String merek) {
		this.merek = merek;
	}
	
	public String getMeja(){
		return this.merek;
	}
}

class Laptop{
	private String merek;
	
	Laptop (String merek){
		this.merek = merek;
	}
	
	public String getLaptop() {
		return this.merek;
	}
	
}

//Association between both the
//classes in main method
class Main
{
	public static void main (String[] args)
	{
		Meja meja1 = new Meja("Olympic");
		Laptop laptop1 = new Laptop("Asus");
		Laptop laptop2 = new Laptop("HP");
		
		System.out.println("Laptop bermerek " + laptop1.getLaptop() +
				" dan laptop bermerek " + laptop2.getLaptop() +
				" ada di atas meja bermerek " + meja1.getMeja());
	}
}


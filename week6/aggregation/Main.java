/**
 * Program dengan Relationship Aggregation
 * @author Ikram M B A
 * Referensi: https://www.geeksforgeeks.org/association-composition-aggregation-java/
 * */

package aggregation;

class AndroidOS{
	private String name;
	private float version;
	
	AndroidOS(String name, float version){
		this.name = name;
		this.version = version;
	}
	
	public void getAndroidOS() {
		System.out.println("\n#OS Information");
		System.out.println("Name: " + name);
		System.out.println("Version: " + version);
	}
	
	public void turnOn() {
		System.out.println("\n#Turning On the Phone");
		System.out.println("Checking Battery");
		System.out.println("Displaying Android Phone Brand's Name and OS Version");
		System.out.println("Get into Homescreen");
		System.out.println("Phone Turned On");
	}
	
	public void turnOff() {
		System.out.println("\n#Turning Off the Phone");
		System.out.println("Stop All App Processes");
		System.out.println("Displaying Android Phone Brand's Name");
		System.out.println("Phone Turned Off");
	}
	
	
}

class AndroidPhone{
	private String brand;
	private String model;
	private AndroidOS os;
	
	AndroidPhone(String brand, String model){
		this.brand = brand;
		this.model = model;
	}
	
	public void getAndroidPhone() {
		System.out.println("\n====================================================");
		System.out.println("#Phone Information");
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
		this.os.getAndroidOS();
	}
	
	public void setOS(AndroidOS os) {
		this.os = os;
	}
	
	public void start() {
		this.os.turnOn();
	}
	
	public void stop() {
		this.os.turnOff();
	}
	
	public void runApp() {
		System.out.println("\n#Opening App");
		System.out.println("App is Running");
	}
	
	public void closeApp() {
		System.out.println("\n#Stop the App");
		System.out.println("Closing App");
		System.out.println("App Closed");
	}
}



public class Main {

	public static void main(String[] args) {

		AndroidOS os1 = new AndroidOS ("Quince Tart", (float)10.0);
		AndroidPhone phone1 = new AndroidPhone("Samsung", "Galaxy A02") ;

		phone1.setOS(os1);
		phone1.getAndroidPhone();
		phone1.start();
		phone1.runApp();
		phone1.closeApp();
		phone1.stop();
		
		AndroidOS os2 = new AndroidOS ("Red Velvet Cake", (float)11.0);
		AndroidPhone phone2 = new AndroidPhone("Samsung", "Galaxy M62") ;

		phone2.setOS(os2);
		phone2.getAndroidPhone();
		phone2.start();
		phone2.runApp();
		phone2.closeApp();
		phone2.stop();

	}

}

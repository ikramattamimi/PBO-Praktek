/**
 * Program dengan Relationship Dependency
 * @author Ikram M B A
 * Referensi: https://repository.unikom.ac.id/51149/1/5.%20Relasi%20antar%20Kelas.pdf
 * */

package dependency;


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
	
	AndroidPhone(String brand, String model){
		this.brand = brand;
		this.model = model;
	}
	
	public void getAndroidPhone(AndroidOS os) {
		System.out.println("\n====================================================");
		System.out.println("#Phone Information");
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
		os.getAndroidOS();
	}
	
	public void start(AndroidOS os) {
		os.turnOn();
	}
	
	public void stop(AndroidOS os) {
		os.turnOff();
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
		
		phone1.getAndroidPhone(os1);
		phone1.start(os1);
		phone1.runApp();
		phone1.stop(os1);
		
		AndroidOS os2 = new AndroidOS ("Red Velvet Cake", (float)11.0);
		AndroidPhone phone2 = new AndroidPhone("Samsung", "Galaxy M62") ;
		
		phone2.getAndroidPhone(os2);
		phone2.start(os2);
		phone2.runApp();
		phone2.stop(os2);

	}

}

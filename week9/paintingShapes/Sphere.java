package paintingShapes;

public class Sphere extends Shape {
	private double radius;
	
	Sphere(double radius){
		super("Sphere");
		this.radius = radius;
	}
	
	@Override
	double area() {
		return 4 * Math.PI * radius*radius; 
	}
	
	@Override
	public String toString() {
		return super.toString() + "of radius " + radius;
	}
}

package circleCylinder;

/**
* The Circle class models a circle with a radius and color.
*/
public class Circle { // Save as "Circle.java"
	
	// private instance variable, not accessible from outside this class
	private double radius;
	private String color;

	// Constructors (overloaded)
	/** Constructs a Circle instance with default value for radius and color */
	public Circle() { // 1st (default) constructor
		radius = 1.0;
		color = "red";
	}
	
	/** Constructs a Circle instance with the given radius and default color */
	public Circle(double r) { // 2nd constructor
		radius = r;
		color = "red";
	}
	
	/** 1.1 */
	/** Constructs a Circle instance with the given radius and given color */
	public Circle(double r, String c) { // 2nd constructor
		radius = r;
		color = c;
	}
	
	/** Returns the radius */
	public double getRadius() {
		return radius;
	}
	
	/** 1.1 */
	/** Returns the color */
	public String getColor() {
		return color;
	}
	
	/** 1.1 */
	/** Set the color */
	public void setColor(String c) {
		color = c;
	}
	
	/** Returns the area of this Circle instance */
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	/** Return a self-descriptive string of this instance in the form of
	Circle[radius=?,color=?] */
		public String toString() {
		return "Circle[radius=" + radius + " color=" + color + "]";
	}
		
//	public static void main (String []args) {
//		Circle c1 = new Circle(1, "blue");
//		c1.setColor("purple");
//		System.out.println(c1.toString());
//	}

}


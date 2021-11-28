package paintingShapes;

public class Rectangle extends Shape{
	private double length, width;
	
	Rectangle(double length, double width){
		super("Rectangle");
		this.length = length;
		this.width = width;
	}
	
	@Override
	double area() {
		return length * width;
	}
	
	@Override
	public String toString() {
		return super.toString() + "of length " + length + 
				" and width " + width;
	}
}

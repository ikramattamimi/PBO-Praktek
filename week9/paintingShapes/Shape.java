package paintingShapes;

abstract class Shape {
	String shapeName;
	abstract double area();
	
	Shape(String shapeName){
		this.shapeName = shapeName;
	}
	
	public String toString() {
		return this.shapeName;
	}
}

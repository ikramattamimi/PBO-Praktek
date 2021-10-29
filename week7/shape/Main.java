package shape;

public class Main {
	public static void main (String [] args) {
		// check Class Shape
//		Shape shape1 = new Shape();
//		System.out.println(shape1.toString());
//		System.out.println(shape1.getColor());
//		System.out.println(shape1.isFilled());
//		
//		shape1.setColor("purple");
//		shape1.setFilled(false);
//		System.out.println(shape1.toString());
//		
//		Shape shape2 = new Shape("yellow", true);
//		System.out.println(shape2.toString());
		
		// check Class Circle
//		Circle circle1 = new Circle();
//		System.out.println(circle1.getRadius());
//		System.out.println(circle1.getArea());
//		System.out.println(circle1.getPerimeter());
//		circle1.setRadius(12);
//		System.out.println(circle1.toString());
//		
//		Circle circle2 = new Circle(3);
//		System.out.println(circle2.toString());
//		
//		Circle circle3 = new Circle(5, "blue", false);
//		System.out.println(circle3.toString());
		
		// check Class Rectangle
//		Rectangle r1 = new Rectangle();
//		System.out.println(r1.getWidth());
//		System.out.println(r1.getLength());
//		System.out.println(r1.getArea());
//		System.out.println(r1.getPerimeter());
//		r1.setWidth(4);
//		r1.setLength(5);
//		System.out.println(r1.getArea());
//		System.out.println(r1.getPerimeter());
//		System.out.println(r1.toString());
//		
//		Rectangle r2 = new Rectangle(3, 4);
//		System.out.println(r2.toString());
//		
//		Rectangle r3 = new Rectangle(4, 2, "black", false);
//		System.out.println(r3.toString());
		
		// Check Class Square
		Square s1 = new Square();
		System.out.println(s1.getWidth());
		System.out.println(s1.getLength());
		System.out.println(s1.getArea());
		System.out.println(s1.getPerimeter());
		s1.setSide(3);
		s1.setWidth(4);
		s1.setLength(5);
		System.out.println(s1.getArea());
		System.out.println(s1.getPerimeter());
		System.out.println(s1.toString());
		
		Square s2 = new Square(3);
		System.out.println(s2.toString());
		
		Square s3 = new Square(4, "black", false);
		System.out.println(s3.toString());
	}
}

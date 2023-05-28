package khalil_assignment;

public class Circle extends GeometricObject {

	int radius;

	public Circle(boolean fill, String color, double thickness, int rad) {

		this.color = color;
		this.thickness = thickness;
		this.isFilled = fill;
		this.radius = rad;
	}

	public double calculateArea() {
		double area = radius * radius * (3.141);
		return area;
	}
}

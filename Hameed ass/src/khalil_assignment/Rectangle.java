package khalil_assignment;

public class Rectangle extends GeometricObject {

	int length;
	int width;

	public Rectangle(boolean fill, String color, double thickness, int length, int width) {

		this.color = color;
		this.thickness = thickness;
		this.isFilled = fill;
		this.length = length;
		this.width = width;

	}

	public double calculateArea() {
		double area = length * width;
		return area;
	}

}

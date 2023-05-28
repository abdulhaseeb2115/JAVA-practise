package Question_01;

public class Triangle implements Shape {
	double height;
	double width;

	public Triangle(double height, double width) {
		this.height = height;
		this.width = width;
	}

	public double area() {
		double area = (this.height * this.width) / 2;
		return area;
	}
}

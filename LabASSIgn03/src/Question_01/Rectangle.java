package Question_01;

public class Rectangle implements Shape {
	double height;
	double width;

	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}

	public double area() {
		double area = this.height * this.width;
		return area;
	}


}

package Question_01;

class Circle implements Shape {
	double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double area() {
		double area = Math.PI * radius * radius;
		return area;
	}

}

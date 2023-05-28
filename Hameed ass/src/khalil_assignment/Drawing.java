package khalil_assignment;

public class Drawing {

	GeometricObject[] obj;
	int c = 0;

	public Drawing(int figures) {
		obj = new GeometricObject[figures];
	}

	boolean add(Circle c1) {
		if (c < obj.length) {
			obj[c] = c1;
			c++;
			return true;
		} else {
			return false;
		}
	}

	boolean add(Rectangle r1) {
		if (c < obj.length) {
			obj[c] = r1;
			c++;
			return true;
		} else {
			return false;
		}
	}

	double calculateArea() {
		double area = 0;
		for (int i = 0; i < obj.length; i++) {
			area = area + obj[i].calculateArea();
		}
		return area;
	}

	public int countFilled() {
		int count = 0;
		for (int i = 0; i < obj.length; i++) {
			if (obj[i].isFilled) {
				count++;
			}
		}
		return count;
	}

	int countCircles() {
		int circles = 0;
		for (int i = 0; i < obj.length; i++) {
			if (obj[i] instanceof Circle) {
				circles++;
			}
		}
		return circles;
	}

	int countRectangles() {
		int rectangles = 0;
		for (int i = 0; i < obj.length; i++) {
			if (obj[i] instanceof Rectangle) {
				rectangles++;
			}
		}
		return rectangles;
	}

	@Override
	public String toString() {
		return "drawing has  " + countCircles() + "  circles and  " + countRectangles() + "  Rectangles .";

	}

}

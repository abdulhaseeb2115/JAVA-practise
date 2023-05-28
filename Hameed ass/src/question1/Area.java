package question1;

public class Area {

	static int length;
	static int breadth;

	public void setDim(int len, int brd) {
		length = len;
		breadth = brd;
	}

	public int getArea() {
		int area = length * breadth;
		return area;
	}

}

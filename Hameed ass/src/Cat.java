
public class Cat {

	int weight;

	Cat(int weight) {
		this.weight = weight;
	}

	public Cat compareCat(Cat a, Cat b, Cat c) {
		if (a.weight >= b.weight && a.weight >= c.weight) {
			return a;
		} else if (b.weight >= a.weight && b.weight >= c.weight) {
			return b;
		} else if (c.weight >= b.weight && c.weight >= a.weight) {
			return c;
		} else {
			return a;
		}
	}

	public static void main(String [] args) {

		Cat a = new Cat(40);
		Cat b = new Cat(4);
		Cat c = new Cat(40);

		System.out.println(a.compareCat(a, b, c).weight);
	}
}

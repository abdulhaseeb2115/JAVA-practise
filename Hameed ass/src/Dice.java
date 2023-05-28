public class Dice {

	int number;

	Dice() {
		number = 0;
	}

	Dice(Dice x) {
		x.number = number;
	}

	public static void randGen(Dice d) {
		double num;
		num = Math.random()*6+1;
		d.number =(int) num;
	}

	public static void main(String[] args) {

		Dice d1 = new Dice();
		Dice d2 = new Dice(d1);
		randGen(d2);
		System.out.println(d2.number);
	}

}

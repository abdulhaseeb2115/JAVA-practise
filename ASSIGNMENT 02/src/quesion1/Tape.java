package quesion1;

public class Tape extends Publications {
	int minutes;

	public Tape() {
		super();
	}

	public void set(int price, String title, int minutes) {
		super.set(price, title);
		this.minutes = minutes;
	}

	public int getMinutes() {
		return minutes;
	}

	public void display() {
		System.out.println("--TITLE->" + title + "\n--PRICE->" + price + "\n--MINUTES->" + minutes);
		System.out.println("-------------------------");
	}
}

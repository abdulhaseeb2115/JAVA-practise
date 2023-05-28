package quesion1;

public class Publications {
	int price;
	String title;

	public void set(int price, String title) {
		this.price = price;
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public String getTitle() {
		return title;
	}

	public void display() {
		System.out.println("-------------------------");
		System.out.println("--TITLE->" + title + "\n--PRICE->" + price);
		System.out.println("-------------------------");
	}
}

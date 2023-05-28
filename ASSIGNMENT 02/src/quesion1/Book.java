package quesion1;

public class Book extends Publications {
	int pagecount;

	public Book() {
		super();
	}

	public void set(int price, String title, int pagecount) {
		super.set(price, title);
		this.pagecount = pagecount;
	}

	public int getPageCount() {
		return pagecount;
	}

	public void display() {
		System.out.println("--TITLE->" + title + "\n--PRICE->" + price + "\n--PAGES->" + pagecount);
		System.out.println("-------------------------");
	}
}

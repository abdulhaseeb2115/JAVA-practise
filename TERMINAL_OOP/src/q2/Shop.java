package q2;

public class Shop {

	Product[] p_array = new Product[100];
	String location;

	public Shop(String location) {
		this.location = location;
	}

	public void addAProduct(Product p) {
		for (int i = 0; i < 100; i++) {
			if (p_array[i] == null) {
				p_array[i] = p;
				break;
			}
		}

	}

	public int countExpiredProducts() {
		int expired = 0;
		Date date = new Date(12, 1, 2021);
		
		for (int i = 0; i < p_array.length; i++) {

			if (date.getYear() > p_array[i].getDateOfExpiry().getYear()) {
				expired++;
			}

		}
		return expired;
	}
}
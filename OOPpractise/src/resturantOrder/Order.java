package resturantOrder;

public class Order {
	Order_Items[] list;
	String[] items = { "Biryani", "Pulao", "Karahi", "Qorma", "Daal" };
	int[] itemsPrice = { 300, 200, 700, 600, 350 };
	String[] others = { "Kheer", "IceCream", "Tea", "Coffee", "Qehwa" };
	int[] othersPrice = { 130, 200, 80, 100, 70 };
	int count = 0;

	Order(int NOofITEMS) {
		list = new Order_Items[NOofITEMS];
	}

	public void OrderItemsOthers(Order_Items obj, String item, int itemQuant, String other, int otherQuant) {

		this.list[count] = obj;
		this.list[count].item = item;
		this.list[count].itemQuant = itemQuant;
		this.list[count].other = other;
		this.list[count].otherQuant = otherQuant;

		count++;
		System.out.println("> ORDER NO "+count+" IS PLACED...!");
	}

	public void DisplayBill() {
		int bill = 0;
        System.out.println("==========================================");
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < items.length; j++) {
				if (this.list[i].item.equalsIgnoreCase(items[j])) {
					bill += (this.list[i].itemQuant * this.itemsPrice[j]);
					System.out.println("  You Ordered: "+this.list[i].item+" x "+this.list[i].itemQuant);
				}
			}
		}
		System.out.println("==========================================");
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < items.length; j++) {
				if (this.list[i].other.equalsIgnoreCase(others[j])) {
					bill += (this.list[i].otherQuant * this.othersPrice[j]);
					System.out.println("  You Ordered: "+this.list[i].other+" x "+this.list[i].otherQuant);
				}
			}
		}
		System.out.println("==========================================");
		System.out.println("\n  You have to Pay " + bill + " Rupees.\n");
		System.out.println("==========================================");
	}

	public static void main(String[] args) {
		Order_Items obj = new Order_Items();
		Order_Items obj1 = new Order_Items();
		Order odr = new Order(2);

		odr.OrderItemsOthers(obj, "pulao", 2, "tea", 2); 
		odr.OrderItemsOthers(obj1, "pulao", 1, "tea", 1);
		odr.DisplayBill();
	}
}

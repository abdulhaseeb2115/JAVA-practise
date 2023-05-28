
public class CarRentalSystem {
	String owner;
	String[] cars = new String[10];
	Boolean[] rented = new Boolean[10];
	int[] days = new int[10];

	public CarRentalSystem(String owner) {
		this.owner = owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getOwner() {
		return owner;
	}

	public void insertAcar(int position, String car) {
		cars[position - 1] = car;
	}

	public void rentAcar(int position, int numOfdays) {
		if (rented[position - 1]== null || rented[position - 1]== false)
		{
			rented[position - 1] = true;
			days[position - 1] = numOfdays;
			System.out.println("Car Rented Successfully...");
		} 
		else if(rented[position - 1] == true)
		{
			System.out.println("Car Already Rented..!");
		}

	}

	public int calculateRentOfCar(int position) {
		int rent = 0;
		rent = (days[position - 1]) * 500;
		return rent;
	}

	public void Display(int position) {

		System.out.println("\nOwner Name: " + owner + "\n" + "Name: " + cars[position - 1] + "\n" + "Rented or Not: "
				+ rented[position - 1] + "\n" + "Rented for days: " + days[position - 1]);
	}

	public CarRentalSystem  compareTwoRentalSystem(CarRentalSystem system1, CarRentalSystem system2) {
        int days1=0;
        int days2=0;
        for(int i=0;i<days.length;i++) {
        	days1+=system1.days[i];
        	days2+=system2.days[i];
        }
		if(days1 > days2) {
			System.out.println("System1 has more Income...!");
			return system1;
		}
		else if(days1 < days2){
			System.out.println("System2 has more Income...!");
			return system2;
		}
		else {
			System.out.println("Both have equal Income...!");
			return system1;
		}
		
	}
	
	public static void main(String[] args) {
CarRentalSystem system1 = new CarRentalSystem("ALI");
CarRentalSystem system2 = new CarRentalSystem("ali");
CarRentalSystem system = new CarRentalSystem("LLLLLL");
//////////////////////////////////////////////
		System.out.println(system1.getOwner());
/////////////////////////////////////////////		
		system1.insertAcar(1, "Honda");
		system1.insertAcar(2, "H");
		system1.insertAcar(3, "o");
		system1.insertAcar(4, "n");
		system1.insertAcar(5, "d");
		system1.insertAcar(6, "a");
		system1.insertAcar(8, "Ha");
		
		system2.insertAcar(1, "Honda");
		system2.insertAcar(2, "H");
		system2.insertAcar(3, "o");
		system2.insertAcar(4, "n");
		system2.insertAcar(5, "d");
		system2.insertAcar(6, "a");
		system2.insertAcar(8, "Ha");
/////////////////////////////////////////////		
		system1.rentAcar(1, 1);
		system1.rentAcar(2, 2);
		system1.rentAcar(3, 3);
		system1.rentAcar(4, 4);
		
		system2.rentAcar(1, 1);
		system2.rentAcar(2, 2);
		system2.rentAcar(3, 3);
		system2.rentAcar(4, 5);
/////////////////////////////////////////////
		system1.Display(1);
		system1.Display(2);
/////////////////////////////////////////////	
	System.out.println(system1.calculateRentOfCar(1));
	System.out.println(system1.calculateRentOfCar(2));
	System.out.println(system1.calculateRentOfCar(3));
	System.out.println(system1.calculateRentOfCar(4));
/////////////////////////////////////////////	
	system.compareTwoRentalSystem(system1, system2);
	
	}
	

}

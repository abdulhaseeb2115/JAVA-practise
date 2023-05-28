package q1;

public class surchargedElectricity extends Electricity {

	public surchargedElectricity(int units, double pricePerUnit) {
		super(units, pricePerUnit);
	}

	@Override
	public double calculateBill() {

		if (units < 300) {
			double bill = units * pricePerUnit;
			return bill;
		} else {

			double additional = pricePerUnit + (pricePerUnit * 0.1);
			double bill = units * additional;
			return bill;
		}

	}

}

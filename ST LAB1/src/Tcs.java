
public class Tcs {
	private int weight;
	private int parcelId;
	private int cost;
	private String parcelName;
	private String destinationAddress;

	public Tcs(String parcelName, int weight, int parcelId, String destinationAddress, int cost) {
		this.parcelName = parcelName;
		this.weight = weight;
		this.parcelId = parcelId;
		this.destinationAddress = destinationAddress;
		this.cost = cost;
	}

	public int DeliveryCost() {

		int extraCharge = 0;
		int extraNationalCost = 1;
		int extraInternationalCost = 20;

		if (parcelName.equals("national")) {
			if (weight <= 5) {
				extraCharge = 6;
			} else if (weight > 5) {
				extraCharge = 6 + ((weight - 5) * extraNationalCost);
			}
		} else if (parcelName.equals("international")) {
			if (weight <= 5) {
				extraCharge = 100;
			} else if (weight > 5) {
				extraCharge = 100 + ((weight - 5) * extraInternationalCost);
			}
		}

		return cost + extraCharge;

	}

	public String getDescription() {
		return String.format("Name: ", parcelName, "/nWeight: ", weight, "/nParcel ID: ", parcelId,
				"/nDestination Address: ", destinationAddress, "/nTotal Cost: ", DeliveryCost());
	}

}

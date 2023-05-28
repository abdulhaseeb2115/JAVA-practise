package quesion2;

public class Laptop extends Computer {
	int width;
	int length;
	int weight;

	public Laptop() {
		super();
	}

	public Laptop(int wordSize, int memorySize, int storageSize, int speed, int width, int length, int weight) {
		super(wordSize, memorySize, storageSize, speed);
		this.length = length;
		this.width = width;
		this.weight = weight;
	}

	public void display() {
		System.out.println("--WORDSIZE->" + wordSize.Bits + "bits\n" + "--MEMORYSIZE->" + memorySize.megaBytes + "MBs\n"
				+ "--STORAGESIZE->" + storageSize.megaBytes + "MBs\n" + "--SPEED->" + speed.megaHertz + "MHz\n"
				+ "--WIDTH->" + width + "Inches\n" + "--LENGTH->" + length + "Inches\n" + "--WEIGHT->" + weight
				+ "kgs");
		System.out.println("-------------------------------------");
	}

}
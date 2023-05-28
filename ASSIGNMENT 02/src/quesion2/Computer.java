package quesion2;

public class Computer {
	WordSize wordSize;
	MemorySize memorySize;
	StorageSize storageSize;
	Speed speed;

	public Computer() {
		wordSize = new WordSize();
		memorySize = new MemorySize();
		storageSize = new StorageSize();
		speed = new Speed();
	}

	public Computer(int WordSize, int MemorySize, int StorageSize, int Speed) {
		this();
		this.wordSize.Bits = WordSize;
		this.memorySize.megaBytes = MemorySize;
		this.storageSize.megaBytes = StorageSize;
		this.speed.megaHertz = Speed;
	}

	public void display() {
		System.out.println("-------------------------------------");
		System.out.println("--WORDSIZE->" + wordSize.Bits + "bits\n" + "--MEMORYSIZE->" + memorySize.megaBytes + "MBs\n"
				+ "--STORAGESIZE->" + storageSize.megaBytes + "MBs\n" + "--SPEED->" + speed.megaHertz + "MHz\n");
		System.out.println("-------------------------------------");
	}
}

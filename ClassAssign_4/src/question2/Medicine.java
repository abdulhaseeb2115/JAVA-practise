package question2;
public class Medicine {
	String name;
	String expDate;

	public Medicine() {

	}

	public Medicine(String name, String idCard) {
		this.name = name;
		this.expDate = idCard;
	}

	@Override
	public String toString() {
		return "\n\tName\t\t" + name + "\n\tExpiry Date\t" + expDate;
	}
}

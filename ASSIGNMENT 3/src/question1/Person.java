package question1;

public class Person {
	private String name;
	private int age;

	public Person() {
	}

	public Person(String name, int age) {
		this.age = age;
		this.name = name;
	}

	public String toString() {

		return name;
	}

	public int getAge() {
		return this.age;
	}
}

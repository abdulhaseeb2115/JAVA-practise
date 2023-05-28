package cs_DEPT_MANAGEMENT_SYSTEM;

import java.io.Serializable;

public class Person implements Serializable {
	String name;
	String phone;
	String address;
	int age;

	Person() {

	}

	public String toString() {
		return "\t NAME: " + name + "\n AGE: " + age + "\t ADDRESS: " + address + "\n PHONE NO: " + phone;
	}

}

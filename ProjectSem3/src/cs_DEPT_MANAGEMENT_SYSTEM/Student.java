package cs_DEPT_MANAGEMENT_SYSTEM;

import java.io.Serializable;
import java.util.Scanner;

public class Student extends Person implements PersonInformation, Serializable {
	transient Scanner inp = new Scanner(System.in);
	int sem;
	char sec = 'a';
	int rollNo;

	Student(String name, String phone, String address, int age) {
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.age = age;
	}

	public String toString() {
		return "\n NAME: " + name + "    ROLL NO: " + sem + Character.toUpperCase(sec) + rollNo + "\n SEMESTER: " + sem
				+ "\tSECTION: " + Character.toUpperCase(sec) + "\n AGE: " + age + "        ADDRESS: " + address
				+ "\n PHONE NO: " + phone;
	}

	public void info() {
		System.out.print("\tSEMESTER :");
		sem = inp.nextInt();
	}
}
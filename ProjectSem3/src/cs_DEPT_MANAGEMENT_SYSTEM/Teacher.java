package cs_DEPT_MANAGEMENT_SYSTEM;

import java.io.Serializable;
import java.util.Scanner;

public class Teacher extends Person implements PersonInformation, Serializable {
	transient Scanner inp = new Scanner(System.in);
	String qualification;
	String subject;
	int id;

	Teacher(String name, int id, String phone, String address, int age) {
		this.name = name;
		this.id = id;
		this.phone = phone;
		this.address = address;
		this.age = age;
	}

	public String toString() {
		return "\n ID: " + id + super.toString() + "\n QUALIFICATION: " + qualification + "\n SUBJECT: " + subject;
	}

	public void info() {
		System.out.print("\tQUALIFICATION :");
		qualification = inp.next();
		System.out.print("\tSUBJECT :");
		subject = inp.next();
	}
}

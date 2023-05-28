package question_1;

import java.util.Scanner;

public class Teacher extends Person implements Association {
	private String designation, department;
	private Scanner input = new Scanner(System.in);

	public Teacher() {
		name = "";
		idCard = "";
	}

	public Teacher(String n, String id) {
		name = n;
		idCard = id;
	}

	@Override
	public String toString() {
		return super.toString() + "\tTeacher\n\tDesignation\t" + designation + "\n\tDepartment\t" + department;
	}

	@Override
	public void associate() {
		System.out.println("Enter following information for Mr/Ms " + name);
		System.out.print("Designation: ");
		designation = input.nextLine();
		System.out.print("Department: ");
		department = input.nextLine();
	}

	public String getId() {
		return idCard;
	}

	public String getName() {
		return name;
	}
}
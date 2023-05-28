package question_1;

import java.util.Scanner;

public class Student extends Person implements Association {

	int rollNo;
	int semester;

	public Student(String n, String id) {
		name = n;
		idCard = id;
	}

	@Override
	public void associate() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter following information for Mr/Ms " + name);
		System.out.print("Roll No: ");
		rollNo = input.nextInt();
		System.out.print("Semester: ");
		semester = input.nextInt();
	}

	@Override
	public String toString() {
		return super.toString() + "\tStudent\n\tRoll No\t\t" + rollNo + "\n\tSemester\t" + semester;
	}

	public String getId() {
		return idCard;
	}

	public String getName() {
		return name;
	}
}
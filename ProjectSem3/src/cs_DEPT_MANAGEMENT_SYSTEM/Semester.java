package cs_DEPT_MANAGEMENT_SYSTEM;

import java.io.Serializable;
import java.util.ArrayList;

public class Semester implements Serializable {
	Section[] sections;
	ArrayList<String> subjs;
	int sem;

	////// * COSNTRUCTOR *//////

	Semester(int sem) {
		this.sem = sem;
		subjs = new ArrayList<String>();
		sections = new Section[3];

		sections[0] = new Section(); // Section a
		sections[1] = new Section(); // b
		sections[2] = new Section(); // c
	}

	////// * SET SUBJECTS FOR SEMESTER *//////

	public void setSubj(Subjects s) {
		this.subjs = s.subjs;
	}

	////// * SHOW SUBJECTS FOR SEMESTER *//////

	public void showSubj() {
		if (subjs.size() == 0) {
			System.out.println("\nNo Subject Assigned Yet...!");
		} else {
			System.out.println("\n-----Semester " + sem + " Subjects-----");
			for (int i = 0; i < subjs.size(); i++) {
				System.out.println(" "+(i + 1) + "- " + subjs.get(i));
			}
			System.out.println("-----------------------------");
		}
	}

	////// * ADD STUDENT IN EACH SECTION *//////

	public void addStudents(Student s) {

		if (sections[0].Students.size() < 40) {

			sections[0].addStudents(s);
			s.sec = 'a';
			s.rollNo = sections[0].Students.size();

		} else if (sections[1].Students.size() < 40) {

			sections[1].addStudents(s);
			s.sec = 'b';
			s.rollNo = sections[1].Students.size() + 39;

		} else if (sections[2].Students.size() < 40) {

			sections[2].addStudents(s);
			s.sec = 'c';
			s.rollNo = sections[2].Students.size() + 79;

		}
	}

	////// * SHOW STUDENTS IN SECTION A *//////

	public void printStSecA() {
		for (int i = 0; i < sections[0].Students.size(); i++) {
			if (sections[0].Students.size() != 0) {
				System.out.println(sections[0].Students.get(i).toString());
			} else {
				System.out.println("Class Empty..!");
			}
		}
	}

	////// * SHOW STUDENTS IN SECTION B *//////

	public void printStSecB() {
		for (int i = 0; i < sections[1].Students.size(); i++) {
			if (sections[0].Students.size() != 0) {
				System.out.println(sections[1].Students.get(i).toString());
			} else {
				System.out.println("Class Empty..!");
			}
		}
	}

	////// * SHOW STUDENTS IN SECTION C *//////

	public void printStSecC() {
		for (int i = 0; i < sections[2].Students.size(); i++) {
			if (sections[0].Students.size() != 0) {
				System.out.println(sections[2].Students.get(i).toString());
				System.out.println("Class Empty..!");
			}
		}
	}
}
//////-----------------------------------------------------------------//////

package question3;

import java.util.*;

public class Employee {

	String name;
	int yearOfJoining;
	int basicSalaryAtJoining;

	Employee(int joiningYear, int basicSalary) {
		this.yearOfJoining = joiningYear;
		this.basicSalaryAtJoining = basicSalary;
	}

	public int yearsOfExperience() {

		Date currentDate = new Date();
		int experience = (currentDate.getYear() + 1900) - this.yearOfJoining;

		return experience;
	}

	public int currentSalary() {

		int salary = 0;
		int increment = (this.basicSalaryAtJoining * 10) / 100;

		for (int i = 1; i <= yearsOfExperience(); i++) {

			if (i % 2 == 0) {
				salary = salary + increment;
			}

		}

		int totalSalary = salary + this.basicSalaryAtJoining;
		return totalSalary;
	}

	public boolean longTermServiceAward() {

		int experience = this.yearsOfExperience();

		if (experience >= 10) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Employee emp1 = new Employee(2000, 1000);
		Employee emp2 = new Employee(2005, 1000);
		Employee emp3 = new Employee(2010, 1000);
		Employee emp4 = new Employee(2015, 1000);
		Employee emp5 = new Employee(2020, 1000);

		System.out
				.println(emp1.yearsOfExperience() + " , " + emp1.currentSalary() + " , " + emp1.longTermServiceAward());
		System.out
				.println(emp2.yearsOfExperience() + " , " + emp2.currentSalary() + " , " + emp2.longTermServiceAward());
		System.out
				.println(emp3.yearsOfExperience() + " , " + emp3.currentSalary() + " , " + emp3.longTermServiceAward());
		System.out
				.println(emp4.yearsOfExperience() + " , " + emp4.currentSalary() + " , " + emp4.longTermServiceAward());
		System.out
				.println(emp5.yearsOfExperience() + " , " + emp5.currentSalary() + " , " + emp5.longTermServiceAward());

	}

}

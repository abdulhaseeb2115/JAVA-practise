package cs_DEPT_MANAGEMENT_SYSTEM;

import java.io.Serializable;
import java.util.ArrayList;

public class Section implements Serializable {
	ArrayList<Student> Students;

	////// * CONSTRUCTOR *//////

	public Section() {
		Students = new ArrayList<Student>();
	}

	////// * ADD STUDENTS IN SECTION LIST *//////

	public void addStudents(Student s) {
		Students.add(s);
	}
}
package studentRecord;

public class StudentData {

	StudentSubject[] stdsbj = new StudentSubject[10];
	String[] name = new String[10];
	int[] rollno = new int[10];
	int count = 0;

	/////////////////////////////////////////

	public void SetStudentData(String name, StudentSubject obj) {

		this.name[count] = name;
		this.stdsbj[count] = obj;
		this.rollno[count] = count++;
	}

	/////////////////////////////////////////

	public void SubjectName(String subjname1, String subjname2, String subjname3) {

		this.stdsbj[count - 1].subjname1 = subjname1;
		this.stdsbj[count - 1].subjname2 = subjname2;
		this.stdsbj[count - 1].subjname3 = subjname3;

	}

	/////////////////////////////////////////

	public void SubjectNo(int subj1, int subj2, int subj3) {

		this.stdsbj[count - 1].subj1 = subj1;
		this.stdsbj[count - 1].subj2 = subj2;
		this.stdsbj[count - 1].subj3 = subj3;

	}

	/////////////////////////////////////////

	public void Display() {

		for (int count = 0; count < name.length; count++) {

			if (this.name[count] == null) {
				System.out.println("NO RECORD FOUND..!");
			} else {
				System.out.println("==========================================");

				System.out.println(" STUDENT NAME:" + this.name[count] + "\n ROLL NO:" + this.rollno[count]);

				System.out.println("---- SUBJECT NAME ----\n 1:" + stdsbj[count].subjname1 + "\n 2:"
						+ stdsbj[count].subjname2 + "\n 3:" + stdsbj[count].subjname3);

				System.out.println("---- SUBJECT MARKS ----\n 1:" + stdsbj[count].subj1 + "\n 2:" + stdsbj[count].subj2
						+ "\n 3:" + stdsbj[count].subj3);

				System.out.println("==========================================");
			}

		}

	}

	/////////////////////////////////////////

	public static void main(String[] args) {

		StudentSubject student1 = new StudentSubject();
		StudentSubject student2 = new StudentSubject();
		StudentData student = new StudentData();

		student.SetStudentData("Johar", student1);
		student.SubjectName("Calculus", "ECA", "ICT");
		student.SubjectNo(76, 90, 92);

		student.SetStudentData("Khattak", student2);
		student.SubjectName("Calculus", "ECA", "ICT");
		student.SubjectNo(40, 33, 20);

		student.Display();
	}

}

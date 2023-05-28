package cs_DEPT_MANAGEMENT_SYSTEM;

import java.io.*;
import java.util.*;

public class Working implements Serializable {

	private transient Scanner inp = new Scanner(System.in);
	private transient Working w;
	private transient Working x;

	Semester[] semesters;
	ArrayList<Student> stdArr;
	ArrayList<Teacher> tchrArr;

	private static String mainFile = "C:\\Users\\Hp\\Desktop\\CsManagement.dat";
	private static String tchrFile = "C:\\Users\\Hp\\Desktop\\CsManagementTCHR.dat";

	private String name;
	private String address;
	private String phone;
	private int sem;
	private char sec;
	private int age;
	private int idROLL;
	private ArrayList<Working> objects;

	////// * COSNTRUCTOR *//////

	Working() {
		stdArr = new ArrayList<Student>();
		tchrArr = new ArrayList<Teacher>();
		semesters = new Semester[8];

		objects = new ArrayList<Working>();
	}

	////// * CREATING SEMESTERS *//////

	public void createSem() {
		for (int i = 0; i < semesters.length; i++) {
			semesters[i] = new Semester(i + 1);
		}
	}

	////// * WRITING DATA TO MAIN FILE *//////

	public void appendData() throws IOException, FileNotFoundException, StreamCorruptedException {
		File f = new File(mainFile);
		ObjectOutputStream objAppend = !f.exists() ? new ObjectOutputStream(new FileOutputStream(f))
				: new ObjectOutputStream(new FileOutputStream(f, true)) {
					@Override
					public void writeStreamHeader() {
					}
				};

		Working wkn = new Working();
		wkn.semesters = this.semesters;
		wkn.stdArr = this.stdArr;

		objAppend.writeObject(wkn);
		objAppend.close();

	}

	////// * WRITING DATA TO TEACHER FILE *//////

	public void appendTchrData() throws IOException, FileNotFoundException, StreamCorruptedException {
		File f = new File(tchrFile);
		ObjectOutputStream objAppend = !f.exists() ? new ObjectOutputStream(new FileOutputStream(f))
				: new ObjectOutputStream(new FileOutputStream(f, true)) {
					@Override
					public void writeStreamHeader() {
					}
				};

		Working wkn = new Working();
		wkn.tchrArr = this.tchrArr;

		objAppend.writeObject(wkn);
		objAppend.close();

	}

	////// * READING DATA FROM MAIN FILE *//////

	public void readData() throws IOException, ClassNotFoundException {
		boolean check = true;
		FileInputStream read = new FileInputStream(mainFile);
		ObjectInputStream objRead = new ObjectInputStream(read);

		while (check) {
			try {
				w = (Working) objRead.readObject();
			} catch (EOFException e) {
				check = false;
			}
		}
	}

	////// * READING DATA FROM TEACHER FILE *//////

	public ArrayList<Working> readTchrData() throws IOException, ClassNotFoundException {
		boolean check = true;
		FileInputStream read = new FileInputStream(tchrFile);
		ObjectInputStream objRead = new ObjectInputStream(read);

		while (check) {
			try {
				x = (Working) objRead.readObject();
				objects.add(x);
			} catch (EOFException e) {
				check = false;
			}
		}
		return objects;
	}

	////// * ASSIGNING SUBJECTS TO SEMESTERS *//////

	public void assignSubjdToSem() throws FileNotFoundException, IOException {

		System.out.print("\tENTER SEMESTER:");
		this.sem = inp.nextInt();
		if (sem != 0) {
			Subjects subj = new Subjects();
			subj.SetSubjects();
			semesters[sem - 1].setSubj(subj);
			appendData();
			System.out.println("\n\t Subject Added...!");
		} else {
			System.out.println("\nInvalid Input...!");
		}
	}

	////// * VIEWING SUBJECTS TO SEMESTERS *//////

	public void showSubjects() throws FileNotFoundException, IOException, ClassNotFoundException {
		System.out.print("\tENTER SEMESTER:");
		this.sem = inp.nextInt();
		if (sem != 0) {
			readData();
			w.semesters[sem - 1].showSubj();
		} else {
			System.out.println("\nInvalid Input...!");
		}

	}

	////// * ADDING STUDENTS AND TEACHERS *//////

	public void addStudentOrTeacher(char type) throws FileNotFoundException, IOException {

		if (tchrArr.size() == 0) {
			tchrArr = new ArrayList<Teacher>(1);
		} else if (stdArr.size() == 0) {
			stdArr = new ArrayList<Student>(1);
		}

		if (type == 'S') {

			getInfo('S');
			stdArr.add(new Student(name, phone, address, age));
			stdArr.get(stdArr.size() - 1).info();
			sem = stdArr.get(stdArr.size() - 1).sem;

			if (sem != 0) {
				semesters[sem - 1].addStudents(stdArr.get(stdArr.size() - 1));
				System.out.println("\n\t Student Added...!");
			} else {
				System.out.println("\nInvalid Input...!");
			}
			appendData();
		} else if (type == 'T') {

			getInfo('T');
			tchrArr.add(new Teacher(name, idROLL, phone, address, age));
			tchrArr.get(tchrArr.size() - 1).info();
			appendTchrData();
			System.out.println("\n\t Teacher Added...!");
		}
	}

	////// * SHOWING DIFFERENT LISTS *//////

	public void showList(String type) throws ClassNotFoundException, IOException {

		if (type.equalsIgnoreCase("S.SEC")) {
			readData();
			getSemSec();
			System.out.println("\n------STUDENT DATA-----");
			if (sec == 'a' || sec == 'A') {
				w.semesters[sem - 1].printStSecA();
			} else if (sec == 'b' || sec == 'B') {
				w.semesters[sem - 1].printStSecB();
			} else if (sec == 'c' || sec == 'C') {
				w.semesters[sem - 1].printStSecC();
			}
			System.out.println("\n-----------------------");
		}

		else if (type.equalsIgnoreCase("S.FULL")) {
			readData();
			System.out.print("\n\tENTER SEMESTER: ");
			sem = inp.nextInt();

			System.out.println("\n------STUDENT DATA-----");
			w.semesters[sem - 1].printStSecA();
			w.semesters[sem - 1].printStSecB();
			w.semesters[sem - 1].printStSecC();
			System.out.println("\n-----------------------");
		} else if (type.equalsIgnoreCase("T.FULL")) {
			ArrayList<Working> wor = readTchrData();
			Working wk = wor.get(wor.size() - 1);
			System.out.println("\n------TEACHER DATA-----");
			for (int j = 0; j < wk.tchrArr.size(); j++) {
				System.out.println(wk.tchrArr.get(j).toString());
			}
			System.out.println("\n-----------------------");
		}
	}

	////// * SEARCHING DIFFERENT DATA *//////

	public void search(char type) throws ClassNotFoundException, IOException {

		boolean found = false;
		if (type == 'S') {
			System.out.print("\tENTER ROLL NO:");
			idROLL = inp.nextInt();
			getSemSec();
		} else if (type == 'T') {
			System.out.print("\tENTER ID:");
			idROLL = inp.nextInt();
		}

		if (type == 'S') {
			readData();
			System.out.println("\n------STUDENT DATA-----");
			for (int i = 0; i < semesters.length; i++) {
				for (int j = 0; j < 3; j++) {
					for (int k = 0; k < w.semesters[i].sections[j].Students.size(); k++) {

						Student s = w.semesters[i].sections[j].Students.get(k);
						if (s.rollNo == this.idROLL && s.sec == this.sec && s.sem == this.sem) {
							System.out.println(s.toString());
							found = true;
							break;
						}
					}
				}
			}
			System.out.println("\n-----------------------");
		} else if (type == 'T') {
			System.out.println("\n------TEACHER DATA-----");
			ArrayList<Working> wor = readTchrData();
			Working wk = wor.get(wor.size() - 1);

			for (int j = 0; j < wk.tchrArr.size(); j++) {
				if (wk.tchrArr.get(j).id == idROLL) {
					System.out.println(wk.tchrArr.get(j).toString());
					found = true;
					break;
				}
			}
			System.out.println("\n-----------------------");
		}
		if (found == false) {
			System.out.println("\nRecord Not Found...!");
		}
	}

	////// * utility functions *//////

	private void getSemSec() {

		System.out.print("\tENTER SEMESTER:");
		this.sem = inp.nextInt();
		System.out.print("\tENTER SECTION:");
		this.sec = inp.next().charAt(0);

	}

	private void getInfo(char type) {

		System.out.print("\n\tEnter following information\n\tNAME :");
		name = inp.next();
		if (type == 'T') {
			System.out.print("\tID:");
			idROLL = inp.nextInt();
		}
		System.out.print("\tPHONE NO :");
		phone = inp.next();
		System.out.print("\tADDRESS :");
		address = inp.next();
		System.out.print("\tAGE :");
		age = inp.nextInt();

	}
}
//////-----------------------------------------------------------------//////
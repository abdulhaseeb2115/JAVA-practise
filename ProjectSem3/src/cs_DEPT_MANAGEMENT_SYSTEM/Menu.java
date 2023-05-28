package cs_DEPT_MANAGEMENT_SYSTEM;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Menu {
	private int choice;
	private Boolean run = true;
	private Scanner inp = new Scanner(System.in);
	private Working wrk = new Working();

	////// * START PROGRAM *//////

	public void StartProgram() throws FileNotFoundException, IOException, ClassNotFoundException {
		System.out.println("  WELCOME to   *****  *****\n              **     **\n             "
				+ "**       *****\n              **          **\n               *****"
				+ "  *****   DEPARTMENT Managment Program.");

		wrk.createSem();
		MainMenu();
	}

	////// * MAIN MENU *//////

	private void MainMenu() throws FileNotFoundException, IOException, ClassNotFoundException {
		while (run == true) {

			System.out.println("\nM A I N  MENU\n 1.Student Menu\n 2.Teacher Menu\n 3.Class Menu\n 4.Exit");
			System.out.print(" Enter Choice:");
			choice = inp.nextInt();
			if (choice == 1) {
				StudentMenu();
			} else if (choice == 2) {
				TeacherMenu();
			} else if (choice == 3) {
				ClassMenu();
			} else if (choice == 4) {
				System.out.println("--Exitting--");
				break;
			} else {
				System.out.println("Wrong Input..!\n" + "--Exitting--");
				run = false;
				break;
			}
		}
	}

	////// * STUDENT MENU *//////

	private void StudentMenu() throws FileNotFoundException, IOException, ClassNotFoundException {
		System.out.println("\n   S T U D E N T  MENU\n   1.Add Student\n   2.Student List\n   "
				+ "3.Search\n   4.Main Menu\n   5.Exit");
		System.out.print("   Enter Choice:");
		choice = inp.nextInt();

		switch (choice) {
		case 1:
			wrk.addStudentOrTeacher('S');
			StudentMenu();
			break;
		case 2:
			list('S');
			break;

		case 3:
			search('S');
			break;

		case 4:
			MainMenu();
			break;

		case 5:
			System.out.println("--Exitting--");
			run = false;
			break;

		default:
			System.out.println("Wrong Input..!\n--Exitting to Previous Menu--");
			MainMenu();
			break;
		}

	}

	////// * TEACHER MENU *//////

	private void TeacherMenu() throws FileNotFoundException, IOException, ClassNotFoundException {
		System.out.println("\n   T E A C H E R  MENU\n   1.Add Teacher\n   2.Teacher List\n   "
				+ "3.Search\n   4.Main Menu\n   5.Exit");
		System.out.print("   Enter Choice:");
		choice = inp.nextInt();

		switch (choice) {
		case 1:
			wrk.addStudentOrTeacher('T');
			TeacherMenu();
			break;

		case 2:
			list('T');
			break;

		case 3:
			search('T');
			break;

		case 4:
			MainMenu();
			break;

		case 5:
			System.out.println("--Exitting--");
			run = false;
			break;

		default:
			System.out.println("Wrong Input..!\n--Exitting to Previous Menu--");
			MainMenu();
			break;
		}

	}

	////// * CLASS MENU *//////

	private void ClassMenu() throws FileNotFoundException, IOException, ClassNotFoundException {
		System.out.println(
				"\n   C L A S S  MENU\n   1.Assign Subjects\n   2.Show Subjects\n   " + "3.Main Menu\n   4.Exit");
		System.out.print("   Enter Choice:");
		choice = inp.nextInt();

		switch (choice) {
		case 1:
			wrk.assignSubjdToSem();
			ClassMenu();
			break;

		case 2:
			wrk.showSubjects();
			ClassMenu();
			break;

		case 3:
			MainMenu();
			break;

		case 4:
			System.out.println("--Exitting--");
			run = false;
			break;

		default:
			System.out.println("Wrong Input..!\n--Exitting to Previous Menu--");
			MainMenu();
			break;
		}

	}

	/**
	 * @throws IOException
	 * @throws FileNotFoundException
	 * @throws ClassNotFoundException
	 *************************/

	////// * LIST MENU *//////

	private void list(char type) throws FileNotFoundException, IOException, ClassNotFoundException {
		if (type == 'S') {
			System.out.println("\n     Show:\n\t1.By Semester\n\t2.By Class\n\t3.Main Menu");
			System.out.print("\tEnter Choice:");
			int choice = inp.nextInt();

			switch (choice) {

			case 1:
				wrk.showList("S.FULL");
				break;

			case 2:
				wrk.showList("S.SEC");
				break;
			case 3:
				MainMenu();
				break;

			default:
				System.out.println("Wrong Input..!\n--Exitting to Previous Menu--");
				StudentMenu();
				break;
			}

		} else if (type == 'T') {
			wrk.showList("T.FULL");
		}

	}

	////// * SEARCH utiltity function *//////

	private void search(char type) throws FileNotFoundException, IOException, ClassNotFoundException {
		if (type == 'T') {
			wrk.search('T');
			TeacherMenu();
		} else if (type == 'S') {
			wrk.search('S');
			StudentMenu();
		}
	}

}
//////-----------------------------------------------------------------//////

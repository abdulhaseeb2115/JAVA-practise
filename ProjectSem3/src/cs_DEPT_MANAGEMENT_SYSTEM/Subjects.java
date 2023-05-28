package cs_DEPT_MANAGEMENT_SYSTEM;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Subjects implements Serializable {

	ArrayList<String> subjs;
	private int noOFsubjs;
	transient Scanner inp = new Scanner(System.in);

	Subjects() {
	}

	public void SetSubjects() {

		System.out.print("   No of Subjects:");
		noOFsubjs = inp.nextInt();
		subjs = new ArrayList<String>(noOFsubjs);

		for (int i = 0; i < noOFsubjs; i++) {
			System.out.print("   Enter Subject " + (i + 1) + ":");
			subjs.add(inp.next());
		}
	}

}
package txtbasedmenurunner;

import java.util.Scanner;

public class Menu {

	String[] mm;

	Menu(String[] m) {
		mm = m;
	}

	void display() {
		int i;
		System.out.println("Select an option or 0 to exit");
		for (i = 0; i < mm.length; i++)
			System.out.println(i + 1 + ". " + mm[i]);
	}

	int getOption() {
		this.display();
		System.out.print("Enter choice:");
		Scanner inp = new Scanner(System.in);
		int x = inp.nextInt();

		return x;
	}

}
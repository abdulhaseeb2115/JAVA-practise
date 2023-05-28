package txtbasedmenurunner;

public class TxtBasedMenuRunner {

	public static void main(String[] args) {
		/*
		 * Select an option or 0 to exit 1. First 2. Second 3. Third
		 */
		// String[]mo = new String[3];

		String[] mo = { "First", "Second", "Third" };
		Menu aMenu = new Menu(mo);
		int i = aMenu.getOption();
		if (i < 1 || i > mo.length) {
			System.out.println("You entered '0'  or Invalid choice !!");
		} else {
			System.out.println("You opted " + mo[i - 1]);
		}

		String[] str = { "a", "b", "c" };
		Menu anotherMenu = new Menu(str);
		int j = anotherMenu.getOption();
		if (j < 1 || j > str.length) {
			System.out.println("You entered '0'  or Invalid choice !!");
		} else {
			System.out.println("You opted " + str[j - 1]);
		}
	}
}
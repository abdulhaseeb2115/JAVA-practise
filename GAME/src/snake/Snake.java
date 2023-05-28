package snake;

import java.util.Scanner;

public class Snake {
	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		int dice;
		int current = 1;
		System.out.println("---WELCOME TO THE GAME---");
		System.out.println("1  2  3  4  5\n6  7  8  9  10\n11 12 13 14 15"
				+ "\n16 17 18 19 20\n21 22 23 24 25\n26 27 28 29 30" + "\n-You are on '" + 1 + "'.");
		System.out.print(" Press '1' to Start Game :");
		int choice = inp.nextInt();
		if (choice == 1) {
              System.out.println("----------------------------------");
			while (choice == 1 && current != 30) {

				System.out.print("Press any key to roll the dice: ");
				String roll = inp.next();
				if (true) {

					dice = (int) (Math.random() * 6) + 1;
					System.out.println("->Dice:" + dice);

					if (current + dice > 30) {
						System.out.println("->TRY AGAIN..! [you need " + (30 - current) + " to Win]");
					} else if (current + dice <= 30) {
						current += dice;
					}

					if (current == 4) {
						current = 9;
						System.out.println("->L A D D E R..!   [you went up to " + current + "]");
					} else if (current == 8) {
						current = 2;
						System.out.println("->S N A K E..!   [you went down to " + current + "]");
					} else if (current == 12) {
						current = 24;
						System.out.println("->L A D D E R..!   [you went up to " + current + "]");
					} else if (current == 14) {
						current = 10;
						System.out.println("->S N A K E..!   [you went down to " + current + "]");
					} else if (current == 19) {
						current = 27;
						System.out.println("->L A D D E R..!   [you went up to " + current + "]");
					} else if (current == 22) {
						current = 5;
						System.out.println("->S N A K E..!   [you went down to " + current + "]");
					} else if (current == 29) {
						current = 18;
						System.out.println("->S N A K E..!   [you went down to " + current + "]");
					} else if (current == 30) {
						System.out.println("---YOU HAVE REACHED FINISH POINT---");
						break;
					} else {
						System.out.println("->You are on '" + current + "'.");
					}
				}
			}

		} else {
			System.out.println("EXITTING...!");
		}
		inp.close();
	}
}

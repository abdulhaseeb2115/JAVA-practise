package practisee;

import java.util.Scanner;

public class QuestionTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner inp=new Scanner(System.in);
		
		System.out.print("Enter 3 Digit Number:");
		int num=inp.nextInt();
	    int num3=num%10;
	    num=num/10;
	    int num2=num%10;
	    num=num/10;
	    int num1=num%10;
		System.out.println(fact(num1)+"\n"+fact(num2)+"\n"+fact(num3));
		inp.close();
	}

	public static int fact(int num) {
			if (num>0) {
				return num*(fact(num-1));
			}	
			else {
			  return 1;
			}
		}

}

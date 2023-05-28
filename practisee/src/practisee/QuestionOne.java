package practisee;

import java.util.Scanner;

public class QuestionOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inp=new Scanner(System.in);
		System.out.print("Enter:");
		String str=inp.next();
		int i=0;
		for(int j=0;j<str.length();j++) {
			if(str.charAt(j)!=' ') {
				i++;
			}
		}
        System.out.println(i);
        inp.close();  
	}
}
package basic;

import java.util.Scanner;

public class JavaBasic {

	public static void main(String[] args) {

	
	Scanner input = new Scanner(System.in);	
	
	System.out.print("Enter First Number:");	
	int num1=input.nextInt();
	
	System.out.print("Enter Operator:");	
	String operator=input.next();
	
	System.out.print("Enter Second Number:");	
	int num2=input.nextInt();
	
	System.out.print("\n"+num1+" "+operator+" "+num2+" = ");
	
//	Start Calculations  + , - , / , * ;
	
	if(operator.equals("+") ) {
		System.out.println(num1+num2);
	}
	
	
	
	
	
	
	
	}
	
}

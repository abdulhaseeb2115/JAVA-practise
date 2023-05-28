package assignments;
import java.util.*;
import java.math.BigInteger;
public class RecursiveFactorial {

	public static void main(String[] args) {
		System.out.println(145%10);
		Scanner inp = new Scanner(System.in);
		 System.out.print("Enter Number:");
	   	  BigInteger num=inp.nextBigInteger();
		   inp.close();
		
		//Calling Method... 
		 BigInteger fact = numProduct(num);
		  System.out.println("Factorial of '"+num+"' is '"+fact+"'.");
	}

	public static BigInteger numProduct(BigInteger num) {
	   //Recursion...
		if (num.compareTo(BigInteger.ZERO)==1) {
			return num.multiply(numProduct(num.subtract(BigInteger.ONE)));
		}
	   //For 0...	
		else {
		  return BigInteger.ONE;
		}
	}

}

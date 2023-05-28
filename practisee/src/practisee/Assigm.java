package practisee;
import java.util.*;
public class Assigm {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner inp = new Scanner(System.in);
    System.out.print("Enter sentence:");
	String Str=inp.nextLine();
	int len=Str.length();
	String str=Str.toLowerCase();
	
	int vov=0;
	int oth=0;
	int spc=0;
	for(int i=0;i<len;i++) {
		
		char ch=str.charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='a') {
			vov++;}
		else {
			oth++;}
		if(ch==' ') {
			spc++;}
	}
	int cons=(oth-spc);
	System.out.println("There are "+vov+" vowels and "+cons+" consunants");
			
	}}


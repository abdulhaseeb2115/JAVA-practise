import java.util.*;
public class PracTime {

	public static void main(String[] args) {
	int a,b,ans;
	Scanner inp=new Scanner(System.in);
	System.out.print("Press '1' if you want to play?__");
	int choice=inp.nextInt();
	if (choice==1) {
	  System.out.println("Multiplication first");
		a=(int)(System.currentTimeMillis()%10);
	    b=(int)((System.currentTimeMillis()/8)%10);
	    System.out.println(a+"x"+b+"=?");
	    ans=inp.nextInt();
	    if(a*b==ans) {
	    	System.out.println("You are right..");}
	    else {
	    	System.out.println("You are wrong..");}
	 System.out.println("Its time for Addition");
	    a=(int)(System.currentTimeMillis()%10);
	    b=(int)((System.currentTimeMillis()/8)%10);
	    System.out.println(a+"+"+b+"=?");
	    ans=inp.nextInt();
	    if(a+b==ans) {
	    	System.out.println("You are right..");}
	    else {
	    	System.out.println("You are wrong..");}
	  System.out.println("Its time for Subtraction");
	    a=(int)(System.currentTimeMillis()%10);
	    b=(int)((System.currentTimeMillis()/8)%10);
	    System.out.println(a+"-"+b+"=?");
	    ans=inp.nextInt();
	    if(a-b==ans) {
	    	System.out.println("You are right..");}
	    else {
	    	System.out.println("You are wrong..");}
	  System.out.println("Chal ab Nikal..");  
	}
	else {
		System.out.println("Go to  HELL..");}
	}
	}

	
	
	
	
	
	

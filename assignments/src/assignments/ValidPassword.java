package assignments;
import java.util.Scanner;
public class ValidPassword {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		 System.out.print("Enter Password:");
	   	  String pass=inp.nextLine();
		   inp.close();
		
		 pass.toLowerCase();//Converting to lower case..
          int dig=0;//For counting number of digits...
           int alpha=0;//For counting number of alphabets...      
        
         //Length must be 8 or greater...	     
          if(pass.length()>=8) {
	    	   for(int i=0;i<pass.length();i++) {
	    		      if(pass.charAt(i)>='0' && pass.charAt(i)<='9') {
		        		 dig+=1; }
	    		      if(pass.charAt(i)>='a' && pass.charAt(i)<='z') {
			        		 alpha+=1; }
	    	   }
	    	  //Password must contain only alphabets and digits... 
	           if(dig+alpha==pass.length()) { 
	               //Password must contain at least 2 digits...
	        	    if(dig>=2) {
	    	 	       System.out.println("'"+pass+"' is a Valid Password.");  
	    	        }
	        	    else {
	        		    System.out.println("'"+pass+"' is an Invalid Password.");
	        	    } 	   
	           }    
	           else {
	    		    System.out.println("'"+pass+"' is an Invalid Password.");
	    	    }   
          }
          else {
	    	  System.out.println("'"+pass+"' is an Invalid Password.");
	      }
	}        		 
}        	 
		       
		        
		         
				

	



package heavy;

import java.util.Scanner;

public class GeneFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner inp= new Scanner(System.in);
		   System.out.print("Enter Genome:");
		    String str=inp.nextLine();
            inp.close();
		 
         int count=0;
          int longest=0;  
           int x;
		    int y;
		     int j;
    ///Main Loop... 
    for(int i=0;i<(str.length()-2);i++) {
		      ///Start  CODONssss... 
			  if((Character.toString(str.charAt(i)).equalsIgnoreCase("A"))&& 
			    (Character.toString(str.charAt(i+1)).equalsIgnoreCase("T"))&& 
			    (Character.toString(str.charAt(i+2)).equalsIgnoreCase("G"))) {
				
			      j=i;
			      x=i;
		    
		   ///Stop CODONssss...               
		   while(x<(str.length()-2)) {
		     y=x+2;
	          if((y-j+1)%3==0) {
			    ///For TAA & TAG...
		    	if(Character.toString(str.charAt(x)).equalsIgnoreCase("T")&&
		    	   Character.toString(str.charAt(x+1)).equalsIgnoreCase("A")&&
		           ( (Character.toString(str.charAt(x+2)).equalsIgnoreCase("A"))||
	               (Character.toString(str.charAt(x+2)).equalsIgnoreCase("G")) ) ){
				
			     	System.out.print(++count+":");
					  
					                    while(j<=y){
					                           System.out.print(Character.toUpperCase(str.charAt(j)));	 
					                           j++;}
					                            System.out.println();
					                            i=x+2; 
					                              break;}   
		     
	    
	           ///For TGA......
		       if((Character.toString(str.charAt(x)).equalsIgnoreCase("T")&&
		       	 (Character.toString(str.charAt(x+1)).equalsIgnoreCase("G"))&&
	     	     (Character.toString(str.charAt(x+2)).equalsIgnoreCase("A")))){
		        							  
		           System.out.print(++count+":");
		  
		        					    while(j<=y){
		        					           System.out.print(Character.toUpperCase(str.charAt(j)));	 
		        		                       j++;}
      				                            System.out.println();
		        		                        i=x+2;  
      				                             break;}
		       if((y-j+1)>longest) {
		    	   longest=y-j+1;}}
		       
		   
		       ///For 2nd Loop Iteration...
	           x++;}}}
			   System.out.println("Length of longest GENE is "+(longest+3));
	       
		    }
	}		  
					  



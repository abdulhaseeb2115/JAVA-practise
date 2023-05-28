package heavy;
import java.util.*;
public class DnaGene {

	public static void main(String[] args) {
		 Scanner inp= new Scanner(System.in);
		   System.out.print("Enter String:");
		    String str=inp.nextLine();

		   int x;
		    int y;
		     int j;
		    ///Main Loop... 
		   for(int i=0;i<(str.length()-2);i++)
		    ///Starting  CODONssss... 
			  {if((Character.toString(str.charAt(i)).equalsIgnoreCase("A"))&& 
			    (Character.toString(str.charAt(i+1)).equalsIgnoreCase("T"))&& 
			    (Character.toString(str.charAt(i+2)).equalsIgnoreCase("G"))) {
						  
			      j=i;
			      x=i;
		    
		    ///Stoping CODONssss...               
		   while(x<(str.length()-2))
		     {if(Character.toString(str.charAt(x)).equalsIgnoreCase("T")&&
		    	 Character.toString(str.charAt(x+1)).equalsIgnoreCase("A")&&
		        ( (Character.toString(str.charAt(x+2)).equalsIgnoreCase("A"))||
	            (Character.toString(str.charAt(x+2)).equalsIgnoreCase("G")) ) ){
						  
				   y=x+2;
					 ///For Confirming length of gene...
					  if((y-j+1)%3==0) {
					                    while(j<=y){
					                      System.out.print(Character.toUpperCase(str.charAt(j)));	 
					                       j++;}
					                        System.out.println();}
					                         break;}   
		     
	    
	                          ///For TGA......
		  if((Character.toString(str.charAt(x)).equalsIgnoreCase("T")&&
			(Character.toString(str.charAt(x+1)).equalsIgnoreCase("G"))&&
		    (Character.toString(str.charAt(x+2)).equalsIgnoreCase("A")))){
		        							  
		         y=x+2;
		        	///For Confirming length of gene...
		        	  if((y-j+1)%3==0) {	    	
		        						 while(j<=y){
		        					      System.out.print(Character.toUpperCase(str.charAt(j)));	 
		        		                   j++;}
        				                    System.out.println();}
		        		                     break;}
		   
		                              ///For 2nd Loop Iteration..
					                       x++;
					                        inp.close();}}}
		   }}		  
					  


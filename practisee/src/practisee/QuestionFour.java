package practisee;

import java.io.*;
import java.util.Scanner;

public class QuestionFour {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("C:\\Users\\Hp\\OneDrive\\Desktop\\abc.txt.TXT");
	     Scanner inp= new Scanner(System.in);
          PrintWriter  out = new PrintWriter(file);
           Scanner reader=new Scanner(file);  
		  int choice=1;
           int num=0;
            int sum=0;
         while(choice==1) {
		     System.out.println("Enter name:");
	          String name=inp.next();
	         System.out.println("Enter Marks:");
	          int mks=inp.nextInt();
             out.println(name+"  "+mks);
	       
             System.out.println("press 1 to run again & 0 to stop:");
	         choice=inp.nextInt();
	          num++;
	          sum+=mks;
    }
		System.out.println("Average of class is:"+(sum/num));
		
	    while(reader.hasNext()) {
	    	
	    }
	    	
		
		
            inp.close();
		    out.close();   
	}

}
   
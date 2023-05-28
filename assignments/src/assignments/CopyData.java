package assignments;
import java.io.*;
import java.util.*;
public class CopyData {	
  public static void main(String[] args){
		    // TODO Auto-generated method stub
            
	        Scanner inp=new Scanner(System.in);
	          System.out.print("Enter Name of Data File:");	   	
                String name1=inp.nextLine();//File with input Data...
                 System.out.print("Enter Name of New File:");
     	           String name2=inp.nextLine();//Target File...
	        
     	    int i=0;//For Writing Line NO...
              File file1=new File(name1);
                File file2=new File(name2);    
     //For checking existence of files...       
            if(!file1.exists()) {
              System.out.println(name1+" Does not exist...");
            }
            else {
                 
                try {
			       file2.createNewFile();//If file not present then creating a new one... 
		        }catch(IOException e1) {
			          // TODO Auto-generated catch block
			            e1.printStackTrace();
		         }
        	   
                try {
				  Scanner reader=new Scanner(file1);
				    PrintWriter out=new PrintWriter(file2);
				      while(reader.hasNext()) {
                	    String data=reader.nextLine();//Reading data...
                	      out.println(i++ +" "+ data);//Writing data...
                      }
                   reader.close();
                     out.close();
                       inp.close();
        	     }catch (FileNotFoundException e) {
				    System.out.println("Error:");
        		      // TODO Auto-generated catch block
				        e.printStackTrace();
        	      }
                    
                System.out.println("\n  Done!");
            }   
   
  }

}

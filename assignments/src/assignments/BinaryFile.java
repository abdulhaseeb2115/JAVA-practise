package assignments;
import java.io.*;
public class BinaryFile {
	public static void main(String[]args) throws IOException {
	
		 File file=new File("C:\\Users\\Hp\\eclipse-workspace\\Assignments\\AvgMarks.txt");// OUTPUT FILE...
		  if(!file.exists()) {
             file.createNewFile();}
		 
		 FileInputStream fis=new FileInputStream("C:\\Users\\Hp\\eclipse-workspace\\Assignments\\Marks.txt");// INPUT FILE...
		  DataInputStream inp=new DataInputStream(fis);
		   PrintWriter out= new PrintWriter(file);
            byte name;
		     double avg,q1,q2,q3,q4; 		
		 for(int i=1;i<=50;i++) {
			 
			 name=inp.readByte();
			  q1=inp.readDouble();
			   q2=inp.readDouble();
			    q3=inp.readDouble();		
			     q4=inp.readDouble();
             avg=(q1+q2+q3+q4)/4;
             out.println(name+"  "+q1+" "+q2+" "+q3+" "+q4+"  "+avg);
		     
		 }
		 System.out.println(" DONE!");
		 out.close();
		 inp.close();
    		
	}
}
	        
		
		
		
		
		
	
	
	
	
	
	

		
				  
				  
	

		                       









package schoolManag;
import java.util.*;
import java.io.*;
public class ProjScManag {
	
	/*[[START OF PROGRAM]]*/
	public static void main(String[] args) throws IOException {
		   System.out.println("  WELCOME to   *****  *****\n              **     **\n             "
	                          + "**       *****\n              **          **\n               *****"
	                          + "  *****   DEPARTMENT Managment Program.");
		   /*Starting the program*/
		   RunProj();
	}

////---------------------------------------------------------------------------------------------------------------------////

	/*[[MAIN MENU]]*/
    public static void RunProj() throws IOException {
		  
    	Scanner inp= new Scanner(System.in);
		System.out.print("\nPRESS 'F' FOR [FACULTY] & 'S' FOR [STUDENTS]:");
	    String studentsORfaculty=inp.next();// choice... 	     
       
	  /*Faculty Menu*/   
      if(studentsORfaculty.equalsIgnoreCase("F")) {
	        File facultyFile=new File("C:\\Users\\Hp\\OneDrive\\Desktop\\PROJFILES\\FACMAG.txt.TXT");//File Specified for Faculty data...
	        System.out.print("PRESS 'I' FOR [SPECIFIC RECORD],'E' FOR [ENTERING DATA] & 'L' FOR [FULL LIST]:");
	        String readORwrite=inp.next();// R\W choice...
	        /*Read/Write Menu*/
	          if(readORwrite.equalsIgnoreCase("I")) {FacultyInfo(facultyFile);}// Reading Information...
	           else if(readORwrite.equalsIgnoreCase("E")) {EnterFaculty(facultyFile);}// Entering Data...
	            else if(readORwrite.equalsIgnoreCase("L")){FullList(facultyFile);}// Reading Full List... 
	             else if(!readORwrite.equalsIgnoreCase("I")&&!readORwrite.equalsIgnoreCase("E")// Invalid Choice...
	            		                                   && !readORwrite.equalsIgnoreCase("L")) { 
	                          System.out.println("Invalid Input\n\n  TERMINATED..!\n");RunAgain();}
      }
   
      /*Student Menu*/   
      else if(studentsORfaculty.equalsIgnoreCase("S")) {
	 	      System.out.print("PRESS 'I' FOR [SPECIFIC RECORD],'E' FOR [ENTERING DATA] & 'L' FOR [FULL LIST]:");
               String readORwrite=inp.next();// R\W choice...
              System.out.print("Enter Semester:");
               int semester=inp.nextInt();// Semester choice...
              System.out.print("SECTION 'A' or 'B' :");
               String section=inp.next();// Section choice      
           /*Read/Write Menu*/
           if(readORwrite.equalsIgnoreCase("I") || readORwrite.equalsIgnoreCase("E")  //
                                                ||readORwrite.equalsIgnoreCase("L")) {// Reading\Writing\Full List 
                       
        	   StudentSemSec(semester,section,readORwrite);}
           
           else if(!readORwrite.equalsIgnoreCase("I") && !readORwrite.equalsIgnoreCase("E")// Invalid Choice...
        		                                   && !readORwrite.equalsIgnoreCase("L")) {//        	
        	     System.out.println("Invalid Input\n\n  TERMINATED..!\n");
        	     RunAgain();// Calling Function to Loop...
        	    }   
   }
        
   /*Invalid Choice In S\F */
   else if(!studentsORfaculty.equalsIgnoreCase("S") && !studentsORfaculty.equalsIgnoreCase("F")) {
	   System.out.println("Invalid Input\n\n  TERMINATED..!\n");
	   RunAgain();// Calling Function to Loop Program...
	   }      
   inp.close();
}

////---------------------------------------------------------------------------------------------------------------------////

    /*FACULTY INFO*/
    public static void FacultyInfo(File file) throws IOException { 
	   Scanner inp=new Scanner(System.in);
       System.out.println("\n<<<<PLEASE USE '-' or '_' INSTEAD OF SPACE>>>>\n");
       String continueORstop="C";// choice...
        /*Main Loop*/
         while(!continueORstop.equalsIgnoreCase("E")) {
        	   Scanner reader=new Scanner(file);//Scanner is Kept inside loop to read the file again from Start... 
        	   System.out.print("ENTER NAME:");
	           String name=inp.next();
	           String foundORnot="C";// condition...
	        while(reader.hasNext() && foundORnot!="E") {
	        	    String matchName=reader.next();//To Match name...
	        	    String recordOutput=reader.nextLine();//To Show Record Respective to Name...
           	      if(matchName.equalsIgnoreCase(name)) {
           	         System.out.println("\n<NAME>     <QUALIFICATION> <SPECIALIZATION> <EXPERIENCE>\n\n>("+matchName+")"+recordOutput);
           	         foundORnot="E";
        	     }     
	        }
	       /*In Case Data Not Found*/
	        if(foundORnot=="C") {
	        	   System.out.println("[NO RECORD FOUND]");}
	               /*For Terminating or Continuing Main LOOP*/
	                System.out.print("\nPress 'E' to stop & any other key to continue:");
	                continueORstop=inp.next();
	                reader.close();            
	    }
        System.out.println("TERMINATED..!");                          
         RunAgain();// Calling Function to Loop Program...
          inp.close();
}

////--------------------------------------------------------------------------------------------------------------------////

    /*FACULTY ENTER*/ 
    public static void EnterFaculty(File file) throws IOException {
   	    Scanner inp= new Scanner(System.in);
   	    FileWriter  fw = new FileWriter(file,true);
   	    BufferedWriter out = new BufferedWriter(fw);
   	     String spec;////
   	      String qual;/// Initializing Variables...
   	       String name;//
   	        String ex;///
   	         String continueORstop="C";// choice...
   	    System.out.println("\n<<<<PLEASE USE '-' or '_' INSTEAD OF SPACE>>>>\n");
   	   /*Main Loop*/
   	   while(!continueORstop.equalsIgnoreCase("E")) {
   		   System.out.print("\nENTER NAME:");
   		     name=inp.next();
   		   System.out.print("ENTER QUALIFICATION :");
   		     qual=inp.next();
   		   System.out.print("ENTER SPECIALIZATION:");
   		     spec=inp.next();
   		   System.out.print("ENTER EXPERIENCE    :");
		     ex=inp.next();
           // Method 'SPACES' Is Called For Aligned Output On FILE...   		 
   		   out.write(" "+name+Spaces(name.length())+"["+qual+"]"+Spaces(qual.length())+// Output on File...
   				                          "["+spec+"]"+Spaces(spec.length())+"["+ex+"]");//
   		   System.out.print("\npress 'E' to stop & any other key to continue:");
   		   continueORstop=inp.next();// choice... 
   	   }
   	       System.out.println("\n\n DONE!!!");
            RunAgain();// Calling Function to Loop Program...
   	         out.close();
   	          inp.close();
}
////---------------------------------------------------------------------------------------------------------------------////

    /*SELECTING SEMESTER/SECTION FOR STUDENT*/	 
    public static void StudentSemSec(int semester,String section,String readORwrite) throws IOException {
	 
	       if(!section.equalsIgnoreCase("A") && !section.equalsIgnoreCase("B")) {//Invalid Semester...
		       System.out.println("Invalid Input\n\n TERMINATED..!");RunAgain();}//
	
	
	       File one_a=new File("C:\\Users\\Hp\\OneDrive\\Desktop\\PROJFILES\\sem1a.TXT");
	       File one_b=new File("C:\\Users\\Hp\\OneDrive\\Desktop\\PROJFILES\\sem1b.TXT");
	        File two_a=new File("C:\\Users\\Hp\\OneDrive\\Desktop\\PROJFILES\\sem2a.TXT");
	        File two_b=new File("C:\\Users\\Hp\\OneDrive\\Desktop\\PROJFILES\\sem2b.TXT");
	         File three_a=new File("C:\\Users\\Hp\\OneDrive\\Desktop\\PROJFILES\\sem3a.TXT");
	         File three_b=new File("C:\\Users\\Hp\\OneDrive\\Desktop\\PROJFILES\\sem3b.TXT");
	          File four_a=new File("C:\\Users\\Hp\\OneDrive\\Desktop\\PROJFILES\\sem4a.txt");
	          File four_b=new File("C:\\Users\\Hp\\OneDrive\\Desktop\\PROJFILES\\sem4b.TXT");
	 
	       File five_a=new File("C:\\Users\\Hp\\OneDrive\\Desktop\\PROJFILES\\sem5a.TXT");
	       File five_b=new File("C:\\Users\\Hp\\OneDrive\\Desktop\\PROJFILES\\sem5b.TXT");
	        File six_a=new File("C:\\Users\\Hp\\OneDrive\\Desktop\\PROJFILES\\sem6a.TXT");
	        File six_b=new File("C:\\Users\\Hp\\OneDrive\\Desktop\\PROJFILES\\sem6b.TXT");
	         File seven_a=new File("C:\\Users\\Hp\\OneDrive\\Desktop\\PROJFILES\\sem7a.TXT");
	         File seven_b=new File("C:\\Users\\Hp\\OneDrive\\Desktop\\PROJFILES\\sem7b.TXT");
	          File eight_a=new File("C:\\Users\\Hp\\OneDrive\\Desktop\\PROJFILES\\sem8a.TXT");
	          File eight_b=new File("C:\\Users\\Hp\\OneDrive\\Desktop\\PROJFILES\\sem8b.TXT");
	 
         switch(semester ){
   	      case 1: if(section.equalsIgnoreCase("A"))      {EnterInfoListStudents(one_a,readORwrite);}
   	              else if(section.equalsIgnoreCase("B")) {EnterInfoListStudents(one_b,readORwrite);}
   	              break;
   	
   	      case 2: if(section.equalsIgnoreCase("A"))      {EnterInfoListStudents(two_a,readORwrite);}
   	      		  else if(section.equalsIgnoreCase("B")) {EnterInfoListStudents(two_b,readORwrite);}
   	        	  break;
   	
   	      case 3: if(section.equalsIgnoreCase("A"))      {EnterInfoListStudents(three_a,readORwrite);}
   	      		  else if(section.equalsIgnoreCase("B")) {EnterInfoListStudents(three_b,readORwrite);}
   	        	  break;
   	
   	      case 4: if(section.equalsIgnoreCase("A"))      {EnterInfoListStudents(four_a,readORwrite);}
                  else if(section.equalsIgnoreCase("B")) {EnterInfoListStudents(four_b,readORwrite);}
   	        	  break;        	
   	
   	      case 5: if(section.equalsIgnoreCase("A"))      {EnterInfoListStudents(five_a,readORwrite);}
                  else if(section.equalsIgnoreCase("B")) {EnterInfoListStudents(five_b,readORwrite);}
   	              break;
   	
   	      case 6: if(section.equalsIgnoreCase("A"))      {EnterInfoListStudents(six_a,readORwrite);}
   	      		  else if(section.equalsIgnoreCase("B")) {EnterInfoListStudents(six_b,readORwrite);}
   	        	  break;
   	
   	      case 7: if(section.equalsIgnoreCase("A"))      {EnterInfoListStudents(seven_a,readORwrite);}
   	      		  else if(section.equalsIgnoreCase("B")) {EnterInfoListStudents(seven_b,readORwrite);}
   	              break;
   	
   	      case 8: if(section.equalsIgnoreCase("A"))      {EnterInfoListStudents(eight_a,readORwrite);}
                  else if(section.equalsIgnoreCase("B")) {EnterInfoListStudents(eight_b,readORwrite);}
   	              break;
   	     
   	      default: System.out.println("Invalid Input\n\n  TERMINATED...!\n");   
                   RunAgain();// Calling Function to Loop Program...
   	      } 
    }
////---------------------------------------------------------------------------------------------------------------------////
   /*ENTER\INFO STUDENTS*/
    public static void EnterInfoListStudents(File studentFile,String readORwrite) throws IOException {
	       Scanner inp= new Scanner(System.in);
 	       FileWriter  fw = new FileWriter(studentFile,true);
 	       BufferedWriter out = new BufferedWriter(fw);
        /*Enter Data*/	
        if(readORwrite.equalsIgnoreCase("E")) { 
                String name,rollno,gpa,attendance;
 	            String continueORstop="C";// choice...
 	            System.out.println("\n<<<<PLEASE USE '-' or '_' INSTEAD OF SPACE>>>>\n");
      	       /*Main Loop*/    
 	           while(!continueORstop.equalsIgnoreCase("E")) {
 		            System.out.print("\nENTER ROLL NO    :");
 		              rollno=inp.next();
 		            System.out.print("ENTER NAME       :");
 		             name=inp.next();
 		            System.out.print("ENTER GPA        :");
 		             gpa=inp.next();
 		            System.out.print("ENTER ATTENDANCE%:");
		             attendance=inp.next();
                   // Method 'Spaces' is called for Aligned Output on FILE...   		 
                    out.write("\n "+rollno+Spaces(rollno.length())+"["+name+"]"+Spaces(name.length())+"["+gpa+"]" // Output in FILE...
        	                                                    + ""+Spaces(gpa.length())+"["+attendance+"]");//
                    //For Terminating or Continuing Main LOOP...
                    System.out.print("\npress 'E' to stop & any other key to continue:");
 		            continueORstop=inp.next();// choice... 
 	           }
 	           System.out.println("\n\n DONE!!!");
 	            out.close();
 	             RunAgain();// Calling Function to Loop Program... 
        }
	    /*Student Info*/
        else if(readORwrite.equalsIgnoreCase("I")) {
	            System.out.println("\n<<<<PLEASE USE '-' or '_' INSTEAD OF SPACE>>>>\n");
                String continueORstop="C";// choice...
              /*Main Loop*/  
              while(!continueORstop.equalsIgnoreCase("E")) {
  	                Scanner reader=new Scanner(studentFile);//Scanner is Kept inside loop to read the file again from Start... 
  	                System.out.print("ENTER ROLLNO:");
                    String rollno=inp.next();
                    String foundORnot="C";// choice...
                  /*Output Loop*/ 
                  while(reader.hasNext() && foundORnot!="E") {
      	                String matchName=reader.next();//To Match name...
      	                String showRecord=reader.nextLine();//To Show Data...
     	              //Condition To Break Loop...
      	              if(matchName.equalsIgnoreCase(rollno)) {
     	                 System.out.println("\n<ROLL NO>    <NAME>  <GPA> <ATTENDANCE>\n\n>("+matchName+")"+showRecord);
     	                 foundORnot="E";
  	                     break;
                      }     
                  }
                  //For Showing "NOT FOUND" Statement...
                  if(foundORnot=="C") {
      	             System.out.println("[NO RECORD FOUND] ");}
                  //For Terminating or Continuing Main LOOP...
                  System.out.print("\npress 'E' to stop & any other key to continue:");
                  continueORstop=inp.next();// choice...
                  reader.close();            
              }
              System.out.println("TERMINATED..!\n");       
              RunAgain();// Calling Function to Loop Program... 
        }
        else if(readORwrite.equalsIgnoreCase("L")) {
	            FullList(studentFile);// Calling Function To Show List...
        }
        inp.close();        
    }

////---------------------------------------------------------------------------------------------------------------------////

    /*SHOW FULL LIST*/
    public static void FullList(File file) throws FileNotFoundException{
	       Scanner reader=new Scanner(file);
	       Scanner inp=new Scanner(System.in);
	     if(reader.hasNext()) {
	         System.out.println("\n");	
  	        while(reader.hasNext()){  	   
	              String showRecord=reader.nextLine();
                  System.out.println(showRecord);
            }

	     }
	     else if(!reader.hasNext()) {
	    	      System.out.println("[NO RECORD FOUND]");
	     }
	            
	     System.out.println("\n\n   END!!!\n");
	     
	     try {
			  RunAgain();// Calling Function to Loop Program... 
	     } catch (IOException e) {
		          e.printStackTrace();
		   }
	     inp.close();
		 reader.close();
    }

////---------------------------------------------------------------------------------------------------------------------////

    /*SPACES ACCORDING TO CONDITION*/    
    public static String Spaces(int namelength) throws IOException {
           //This Method Aligns the OUTPUT in BOTH File & Console...
           String s=" ";
         for(int i=1;i<(14-namelength);i++) {
        	 s+=" ";
         }
         return s;
    }

////---------------------------------------------------------------------------------------------------------------------////

    /*LOOPING PROGRAM*/
    public static void RunAgain() throws IOException {
           Scanner inp=new Scanner(System.in);
	       System.out.print("PRESS 'E' TO STOP & ANY OTHER KEY TO RUN THE PROGRAM AGAIN:");
	       String exitORnot=inp.next();// choice...
	     if(!exitORnot.equalsIgnoreCase("E")) {
	    	 RunProj();// Calling Function to Start The Program Again... 
	     }
	     else {
	    	       System.out.println("\n\n     EEEEEE  NN   NN  DDDDDD\n     EE      "
	 	    	 	+ "NNN  NN  DD   DD\n     EEEE    NN N NN  DD    DD\n"
	 	     		 + "     EE      NN  NNN  DD   DD\n     EEEEEE  NN   NN  DDDDDD  OF PROGRAM...\n\n\n Project By "
	 	     		  + "[Abdul Haseeb & Abdul Mateen]\n Roll No    [FA19-BSE-091 & FA19-BSE-092]");	    	
	    	 
	     }
	    	
	     inp.close();
    }
                            /******************* 
                               END OF PROGRAM
                            *******************/         
}

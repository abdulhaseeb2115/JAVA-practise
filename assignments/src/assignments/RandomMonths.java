package assignments;
import java.io.*;
public class RandomMonths {

	public static void main(String[] args) {
	    
	   //English Months...(Spaces after names are used for Arranged Output of line no '74'&'79')
		String[] mon = {"January  ","February ","March    ","April    ","May      ","June     ",
				        "July     ","August   ","September","October  ","November ","December "};
	   //2nd array for storing total number of repetitions...
		 int[] total= {0,0,0,0,0,0,0,0,0,0,0,0};
	       
//For storing Data in a Text File & Displaying Output... 
  try {
	File file=new File("RanMon.txt");
	 PrintWriter out=new PrintWriter(file);
	
	            //For checking Existence of file...	 
			     if(!file.exists()) {
				     file.createNewFile();//(Creating New File...)  
			           }
				       
        //Random Output...   
	    System.out.println("Randomly generated Numbers & their respective Months:");
	    out.println("Randomly generated Numbers & their respective Months:");
	    
	    for(int i=0;i<=100;i++) {
		  int rand=(int)(Math.random()*12);
		 
		   switch(rand) {
             case 0: System.out.println(" 0"+(rand+1)+" "+mon[rand]);
                      out.println(" 0"+(rand+1)+" "+mon[rand]);
                       total[rand]+=1;break;
			 case 1: System.out.println(" 0"+(rand+1)+" "+mon[rand]);
			          out.println(" 0"+(rand+1)+" "+mon[rand]);
			           total[rand]+=1;break;
			 case 2: System.out.println(" 0"+(rand+1)+" "+mon[rand]);
	                  out.println(" 0"+(rand+1)+" "+mon[rand]);
	                   total[rand]+=1;break;
			 case 3: System.out.println(" 0"+(rand+1)+" "+mon[rand]);
	                  out.println(" 0"+(rand+1)+" "+mon[rand]);
	                   total[rand]+=1;break;
			 case 4: System.out.println(" 0"+(rand+1)+" "+mon[rand]);
	                  out.println(" 0"+(rand+1)+" "+mon[rand]);
	                   total[rand]+=1;break;
			 case 5: System.out.println(" 0"+(rand+1)+" "+mon[rand]);
	                  out.println(" 0"+(rand+1)+" "+mon[rand]);
	                   total[rand]+=1;break;
			 case 6: System.out.println(" 0"+(rand+1)+" "+mon[rand]);
	                  out.println(" 0"+(rand+1)+" "+mon[rand]);
	                   total[rand]+=1;break;
			 case 7: System.out.println(" 0"+(rand+1)+" "+mon[rand]);
	                  out.println(" 0"+(rand+1)+" "+mon[rand]);
	                   total[rand]+=1;break;
			 case 8: System.out.println(" 0"+(rand+1)+" "+mon[rand]);
	                  out.println(" 0"+(rand+1)+" "+mon[rand]);
	                   total[rand]+=1;break;
			 case 9:  System.out.println(" "+(rand+1)+" "+mon[rand]);
			           out.println(" "+(rand+1)+" "+mon[rand]);
			            total[rand]+=1;break;
			 case 10: System.out.println(" "+(rand+1)+" "+mon[rand]);
			           out.println(" "+(rand+1)+" "+mon[rand]);
			            total[rand]+=1;break;
			 case 11: System.out.println(" "+(rand+1)+" "+mon[rand]);
			           out.println(" "+(rand+1)+" "+mon[rand]);
			            total[rand]+=1;break;
	       }
	    }
		
		//Total Repetitions Output...
		 System.out.println("\nNumber of Repetitions:");//Display...
		 out.println("\nNumber of Repetitions:");//Writing in file...
		    for(int j=0;j<=11;j++) {
			   System.out.println(" "+mon[j]+" '"+total[j]+"'");//Display...	
			   out.println(" "+mon[j]+" '"+total[j]+"'");//Writing in file...
		    }
		     	 
   out.close();
  }catch (IOException e) {
    //TODO Auto-generated catch block
	  e.printStackTrace();
		      }
				    
	}
}

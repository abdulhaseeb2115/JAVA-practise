package question;
import java.io.*;
import java.util.*;
public class Runner {
public static void main(String []args) throws IOException, ClassNotFoundException
{
final String FILENAME = "C:\\Users\\Hp\\Desktop\\myFile.dat";
HumanResource oldHR = new HumanResource();
oldHR.addHumanResource("Mukhtar", "61101","Teacher");
oldHR.addHumanResource("Iftikhar", "61101","Student");
oldHR.addHumanResource("Bakhtiar", "61101","Student");
oldHR.saveHumanResource(FILENAME);
HumanResource newHR;
newHR=HumanResource.loadHumanResource(FILENAME);
System.out.println("Read infor,ation for file into newHR");
//Add a human resource in new HR
newHR.addHumanResource("Fakhar", "61102", "Teacher");
//Delete a human resource from old HR
if(oldHR.delHumanResource("Iftikhar", "61101"))
System.out.println("Person removed successfully");
else
System.out.println("<ERROR> Failed to remove person");
System.out.println(oldHR);
System.out.println("This is from newHR:\n" + newHR + "\n=======");
System.out.println("This is from oldHR:\n" + oldHR);
}
}

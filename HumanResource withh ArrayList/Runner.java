package LabSess2;
import java.util.ArrayList;
import java.util.Scanner;
public class Runner {
    
public static void main(String []args){
        HumanResource HR = new HumanResource();
        HR.addHumanResource("Mukhtar", "61101","Teacher");
        HR.addHumanResource("Iftikhar", "61101","Student");
        HR.addHumanResource("Bakhtiar", "61101","Student");
        if(HR.delHumanResource("Iftikhar", "61101"))
            System.out.println("Person removed successfully");
        else
            System.out.println("<ERROR> Failed to remove person");
        System.out.println(HR);
        
    
    }
    
}

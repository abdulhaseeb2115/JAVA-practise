package question;
import java.util.Scanner;

public class Student extends Person implements Association {

    private int rollNo;
    private int semester;
    private transient Scanner input = new Scanner(System.in);

    public Student(String n, String id){
        name = n;
        idCard = id;
    }
    
    @Override
    public String toString(){
             return super.toString()+"\tStudent\n\tRoll No\t\t"+rollNo+"\n\tSemester\t"+semester;
    }
    @Override
    public void associate() {
        System.out.println("Enter following information for Mr/Ms " + name);
        System.out.print("Roll No: ");
        rollNo = input.nextInt();
        System.out.print("Semester: ");
        semester = input.nextInt();
    }
    
}
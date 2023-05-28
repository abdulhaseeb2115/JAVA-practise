package question2;

import java.util.Scanner;

public class MuscleRelaxants extends Medicine{
	private String  ingredients, price;    
    private Scanner input= new Scanner(System.in);
    
    public MuscleRelaxants(String n, String exp){
        name = n;
        expDate = exp;     
    }
 
    @Override
    public String toString() {
        return super.toString()+"\tTeacher\n\tIngredients\t"+ingredients+"\n\tPrice\t"+price;
    }    
}

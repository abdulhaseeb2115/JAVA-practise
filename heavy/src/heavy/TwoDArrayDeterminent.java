package heavy;
import java.util.*;
public class TwoDArrayDeterminent {
	public static void main(String[] args) {
		
		Scanner inp=new Scanner(System.in);
		 System.out.println("3 X 3 Determinant..");
		  int [][] det=new int[3][3];
		  
		    for (int row=0;row<det.length; row++) {
			    System.out.print("Enter row no "+(row+1)+":");
			   
			     for(int col=0;col<det[row].length;col++) {
				    det[row][col]=inp.nextInt();}}
		
		inp.close();
		
		
		int x1=(det[0][0])*(((det[1][1])*(det[2][2]))-((det[2][1])*(det[1][2])));
		int x2=(det[0][1])*(((det[1][0])*(det[2][2]))-((det[2][0])*(det[1][2])));
		int x3=(det[0][2])*(((det[1][0])*(det[2][1]))-((det[2][0])*(det[1][1])));
		int ans=x1-x2+x3;
		
		   for (int row=0;row<det.length; row++) 
		    {   System.out.print("|");
			for(int col=0;col<det[row].length-1;col++) 
				{System.out.print(det[row][col]+" ");}
			
			for(int col=2;col<det[row].length;col++) 
				{System.out.print(det[row][col]+"|");
				if(row==1) {
					System.out.print(" = "+ans);}
				}
			System.out.println();
			}
		
		}}		
			



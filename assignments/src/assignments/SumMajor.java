package assignments;
import java.util.*;
public class SumMajor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inp = new Scanner(System.in);
		 System.out.print("Enter number of Rows & Coloumns:");
		  int n=inp.nextInt();
		   double [][] matrix=new double[n][n];
		    System.out.println("Enter values seperated by spaces.. ");
	//For Storing data in array...      
        for (int row=0;row<matrix.length; row++) {
	     System.out.print("Enter row no "+(row+1)+":");
		  for(int col=0;col<matrix[row].length;col++) {
		   matrix[row][col]=inp.nextInt();}}
		 
        inp.close();
	     System.out.println("The Sum of Major Diagonals is "+sumMajorDiagonal(matrix));//Calling method...
	}
	
	
	public static double sumMajorDiagonal(double[][]m) {
	   int sum=0;
		 for(int i=0;i<m.length;i++) {
			 sum+=m[i][i];//Summing diagonal entries...
		 }
		  
		 return sum;
	}	 	
}



package practisee;

import java.util.Arrays;
import java.util.Scanner;

public class QuestionThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		 System.out.print("Enter number of Rows & Coloumns:");
		  int n=inp.nextInt();
		   int [][] matrix=new int [n][n];
		    System.out.println("Enter values seperated by spaces.. "); 
       for (int row=0;row<matrix.length; row++) {
	     System.out.print("Enter row no "+(row+1)+":");
		  for(int col=0;col<matrix[row].length;col++) {
		   matrix[row][col]=inp.nextInt();}}
 inp.close();
	     System.out.println("The Sum of [Major Diagonals],[Anti Diagonals],"
	     		+ "[Center Coloumn] is "+Arrays.toString(sumDiagonal(matrix)));
		
		
		
	}
	public static int[] sumDiagonal(int[][]m) {
		   int sumM=0;
		   int sumA=0;
		   int sumC=0;
			 
		     for(int i=0;i<m.length;i++) {
				 sumM+=m[i][i];
			 }
			 
			 for(int i=0;i<m.length;i++) {
				 sumA+=m[i][m.length-1-i];
			 }
			 
			 for(int i=0;i<m.length;i++) {
				 sumC+=m[i][(m.length-1)/2];
				 
			 }
				 
			 int []ans=new int[3];
			 ans[0]=sumM;
			 ans[1]=sumA;
			 ans[2]=sumC;
			 

			 return ans;
		}	 	
	
}

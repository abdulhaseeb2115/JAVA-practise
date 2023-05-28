package perimeter;
import java.util.*;
public class PerimeterOfShapes {

	public static void main(String[] args) {
	Scanner inp=new Scanner(System.in);
		System.out.print("Enter numer of Points:");
		// num is total number of points..
		int num=inp.nextInt();
		
		int[][] points =new int [num+1][2];
		// set means(x,y)..
		for (int set=0;set<points.length-1; set++) {
			System.out.print("Enter point no "+(set+1)+":");
	        // pts means 'x' and 'y'..		
			for(int pts=0;pts<points[set].length;pts++) {
				points[set][pts]=inp.nextInt();}}
		inp.close();
		// copying first point to last index..
		points[points.length-1][0]=points[0][0];
		points[points.length-1][1]=points[0][1];
		//calculation..
		double side1=0;
		double perimeter=0;
        for (int i=0;i<points.length-1;i++){			
	double side=Math.pow((Math.pow((points[i+1][0]-points[i][0]),2)+Math.pow((points[i+1][1]-points[i][1]),2)),0.5);
	perimeter=perimeter+side;
      //Longest side..	
	if(side>side1) {
		side1=side;}}
	 // output..
        System.out.print("Points={");
        for(int k=0;k<points.length-1;k++) {
        		System.out.print("("+points[k][0]+","+points[k][1]+")");}
        	          System.out.println("}\nPerimeter=["+perimeter+"]");
        	         System.out.println("Longest Side=["+side1+"]"); 
        	         }}
		 
		

			



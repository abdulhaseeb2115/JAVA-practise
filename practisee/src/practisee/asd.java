package practisee;
import java.util.*;
public class asd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner inp = new Scanner(System.in);
    System.out.print("Enter no of lines:");
    int giv=inp.nextInt();

for(int r=1;r<(giv+1);r++) {
	for(int s=(giv-r);s>=1;s--) {
		System.out.print("  ");
	}
	for(int a=r;a>=2;a--) {
		System.out.print(a + " ");
	}
	for(int b=1;b<=r;b++) {
	    System.out.print(b + " ");	
	}
	    System.out.println();
}}}





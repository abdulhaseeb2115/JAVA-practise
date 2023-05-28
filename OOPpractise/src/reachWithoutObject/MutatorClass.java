package reachWithoutObject;

import reachWithoutObject.DataMembers;

public class MutatorClass {

	public static void seta(int[] a1) {
		DataMembers.a = a1;
	}

	public static void setb(String[] b1) {
		DataMembers.b = b1;
	}

	public static void setc(boolean[] c1) {
		DataMembers.c = c1;
	}

	public static void setd(char d1) {
		DataMembers.d = d1;
	}

	public static void sete(Integer e1) {
		DataMembers.e = e1;
	}

	public static void setf(double f1) {
		DataMembers.f = f1;
	}

	public static int[] geta() {
		return DataMembers.a;
	}

	public static String[] getb() {
		return DataMembers.b;
	}

	public static boolean[] getc() {
		return DataMembers.c;
	}

	public static char getd() {
		return DataMembers.d;
	}

	public static Integer gete() {
		return DataMembers.e;
	}

	public static double getf() {
		return DataMembers.f;
	}

	public static void main(String[] args) {
		setd('a');
		setf(100);
	 
		System.out.println(getd()); 
		System.out.println(getf());
	
	
		setd('b');
		setf(200);
	 
		System.out.println(getd()); 
		System.out.println(getf());
	
	
	
	}

}


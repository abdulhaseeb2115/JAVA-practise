package testCompareable;

public class TestCompareable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Integers i = new Integers(3);
        Integers j = new Integers(3);
	
        System.out.println(i.compareTo(j));
	}

}

class Integers implements Comparable<Integers>{
	
	int x;
	public Integers(int i) {
		x=i;
	}
	
	public int compareTo(Integers t) {
		 if(this.x>t.x) {
			 return 1;
		 }
		 else if(this.x<t.x) {
			 return -1;
		 }
		 else {
			 return 0;
		 }
	}
}
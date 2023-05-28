package quesion1;

public class RunnerQ1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Publications pb = new Publications();
        Book bk = new Book();
        Tape tp = new Tape();
        
        pb.set(450, "BOOK1");
        pb.display();
        
        bk.set(500, "BOOK2", 469);
        bk.display();
		
        tp.set(1000, "MUSIC", 90);
        tp.display();
	}
}

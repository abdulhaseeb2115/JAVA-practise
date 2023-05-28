package part2;

public class Runeer {
	public static void main(String[] args){
	    

	    Bus bs=new Bus(6);
	     
	     bs.BookSeat(1,"nonsmoking");
	     bs.BookSeat(2,"nonsmoking");
	     bs.BookSeat(3,"nonsmoking");

         System.out.println("Empty Seats:"+bs.VacantSeatCount());

	    }
	
}

package part2;
public class Bus {

	private Seat[] seats;
    private int totalseats;

//****************************************************************************//
//****************************************************************************//
    
    public Bus(){
    	
    	this.totalseats=14;
        this.seats = new Seat[totalseats];
    }
//****************************************************************************//
//****************************************************************************//

    public Bus(int seats){
    	
    	this.totalseats=seats;
        this.seats = new Seat[totalseats];
    }
    
//****************************************************************************//
//****************************************************************************//
    
    public  boolean BookSeat(int seatnum,String type){
          
    	   Seat obj=new Seat();
           obj.SetSeatType(type);
           this.seats[seatnum]=obj;
           System.out.println("Seat No-"+seatnum+" Booked..!");
           return true;
    }
    
//****************************************************************************//
//****************************************************************************//
    
   public boolean UnbookSeat(int seatnum){
           
	       seats[seatnum].Unbookseat(false);
           this.seats[seatnum]=null;
           System.out.println("Seat No-"+seatnum+" UnBooked..!");
           return true;
   }
   
//****************************************************************************//
//****************************************************************************//
   
   public int VacantSeatCount(){
       
	 int count=0;
     for(int i=0;i<seats.length;i++){
       
    	 if(seats[i]==null){
           count++;
         }
      }
      
     
      return count;
   }
   
//****************************************************************************//
//****************************************************************************//
}

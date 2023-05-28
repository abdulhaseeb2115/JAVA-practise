
public class Runner {
	 public static void main(String args[]){ 
	    
		 
	        PhoneBook pb=new PhoneBook(10);
	        pb.InsertContact(3, "AAAAA", 1, 4, "0300", "jazz");
	        pb.InsertContact(1, "BBBBB", 2, 5, "0314", "zong");
	        pb.InsertContact(2, "CCCCC", 3, 6, "0343", "telenor");
	        
	        pb.GetContact("0300");
	        pb.GetContact("0314");
	        
	        pb.PrintFullList();
	        pb.DeleteContact("0300");
	        
	        pb.GetContact("0300");
	        pb.GetContact("1234");
	        
	        pb.PrintFullList();

	    }
}

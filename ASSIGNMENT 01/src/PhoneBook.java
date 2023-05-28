
public class PhoneBook {
	private Contact[] contacts;
    private int contact_count;
 private static final int DEFAULT_CAPACITY=20;
 
//****************************************************************************//
//****************************************************************************//
 
 public PhoneBook(){
    
	 contacts=new Contact[PhoneBook.DEFAULT_CAPACITY];
 
 }
 
//****************************************************************************//
//****************************************************************************//
 
 PhoneBook(int capacity){
 
	 contacts=new Contact[capacity];

 }
 
//****************************************************************************//
//****************************************************************************//

 private Contact SetContact(String name, int countryCode, int cityCode,
		                   String mobileNum, String mobileNumType){
	 
       Contact TemporaryContact = new Contact(name, countryCode, cityCode, mobileNum, mobileNumType);        
       return TemporaryContact;
 }
     
//****************************************************************************//
//****************************************************************************//
     
public boolean InsertContact(int index,String name, int countryCode, 
		      int cityCode, String mobileNum, String mobileNumType){
	
         contacts[index]=this.SetContact(name, countryCode, cityCode, mobileNum, mobileNumType);
         return true;
}

//****************************************************************************//
//****************************************************************************//

public boolean DeleteContact(String mobilenum){
   
	for (int i=0;i<=contacts.length-1;i++){
		
        if(contacts[i]==null){
        	
        }
        
        else if(contacts[i].getMobileNum()==mobilenum){
                
        	    contacts[i]=null;
                System.out.println("Contact Deleted...!");
        }
    }
    
	return true;
}

//****************************************************************************//
//****************************************************************************//

public Contact GetContact(String mobilenum){
        
        for(int i=0;i<contacts.length;i++){
        	
            if(contacts[i]==null || contacts[i].getMobileNum()!=mobilenum){
            	
                if(i==contacts.length-1) {
                	
                  System.out.println("Contact Not Found");
                  return null;
                }
            }
            
            else if(contacts[i].getMobileNum()==mobilenum) {
            
                contacts[i].printcontact();
                return null;
            }
        }
    return null;
    
}

//****************************************************************************//
//****************************************************************************//

public void PrintFullList(){
	System.out.println("\n---------------------------------------------------------");
	for (int i=0;i<contacts.length;i++){
      
		if (contacts[i]==null){
    	}
    
        else{
                 
    	     contacts[i].printcontact();
    	    }
        }
	System.out.println("---------------------------------------------------------\n");
}

//****************************************************************************//
//****************************************************************************//

}





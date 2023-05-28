
public class Contact {

	 private String name;
     private int countrycode;
     private int citycode;
     private String mobilenum;
     private String mobilenumtype;
     
//****************************************************************************//
//****************************************************************************//
     
public Contact(String name, int countryCode, int cityCode, String mobileNum, String mobileNumType){
    
	this.name=name;
    this.countrycode=countryCode;
    this.citycode=cityCode;
    this.mobilenum=mobileNum;
    this.mobilenumtype=mobileNumType;
    
}

//****************************************************************************//
//****************************************************************************//
     
    public void setMobileNum(String mobilenum){

        this.mobilenum=mobilenum;
        
    }

//****************************************************************************//
//****************************************************************************//

    public String getMobileNum(){

        return this.mobilenum;
    }
    
//****************************************************************************//
//****************************************************************************//
    
    public void printcontact(){

             System.out.println(" Name->["+this.name+ "]--CountryCode->[" + this.countrycode +
            		            "]--CityCode->["+this.citycode+"]--MobileNum->["+this.mobilenum+"]"
            		             + "]--MobileNumType->[" + this.mobilenumtype+"]");
	
	}
//****************************************************************************//
//****************************************************************************//

}
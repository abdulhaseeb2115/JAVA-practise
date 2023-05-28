package question;
import java.io.*;
import java.util.*;
public class HumanResource implements Serializable{
    ArrayList<Association> HRList;
    
    public HumanResource() {
        HRList = new ArrayList<Association>();
    }
    
    public boolean delHumanResource(String n, String id){
        return HRList.remove(new Person(n,id));
          
    }
    
    public void addHumanResource(String name, String id, String type){
        if(HRList.size()==0)
           HRList = new ArrayList<Association>(1); 

        if(type.matches("Teacher"))
            HRList.add(new Teacher(name, id));           
        else if(type.matches("Student"))
            HRList.add(new Student(name, id));
        
        HRList.get(HRList.size()-1).associate();
        
    }

    @Override
    public String toString(){
        String s="";
        for(int i=0;i<HRList.size();i++)
        {
        s=s + "\n"+HRList.get(i).toString();
        }
        return s;
    }
	public void saveHumanResource(String fILENAME) throws IOException, FileNotFoundException {
		// TODO Auto-generated method stub
		FileOutputStream fileout = new FileOutputStream(fILENAME);
		ObjectOutputStream objout = new ObjectOutputStream(fileout);
		HumanResource hr = new HumanResource();
		hr.HRList=HRList;
		objout.writeObject(hr);
	}
	public static HumanResource loadHumanResource(String fILENAME) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream fileout = new FileInputStream(fILENAME);
		ObjectInputStream objout = new ObjectInputStream(fileout);
		HumanResource hr;
		hr =(HumanResource) objout.readObject();
		return hr;
	}
}

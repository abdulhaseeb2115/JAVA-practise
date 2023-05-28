package question_1;

public class Runnerr {

	public static void main(String []args){
	    HumanResource HR = new HumanResource();
	    HR.addHumanResource("Mukhtar", "611","Teacher");
	    HR.addHumanResource("Iftikhar", "6110","Student");
	    HR.addHumanResource("Bakhtiar", "61101","Student");
	    System.out.println(HR);
	    HR.delHumanResource("Iftikhar","6110");
	    System.out.println(HR);
	    
	}
	public static void main1(String[] args) {
	    Association[]hr;
	    hr = new Association[10];
	    
	    hr[0]=new Teacher("Mukhtar", "61101-1960934-1");
	    hr[0].associate();

	    
	    hr[1] = new Student("Iftikhar", "61101-1960934-2");
	    hr[1].associate();
	    
//	       for(Person p:hr){
	        System.out.println(hr[0]);
	        System.out.println(hr[1]);
//	       }
	}

	}


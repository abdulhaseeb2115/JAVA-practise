package lab10;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="ABC";
		String b="abc";
		
		StudentTask sT = new StudentTask(a,20,3.3);
		EmplayeeTask eT = new EmplayeeTask(b,"30/9",310);
	
	    sT.register();
	    System.out.println("===========");
	    eT.register();
	}

}

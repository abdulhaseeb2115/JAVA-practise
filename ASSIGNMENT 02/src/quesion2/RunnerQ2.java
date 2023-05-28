package quesion2;

public class RunnerQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Computer comp =new Computer(2,8000,100000,2);
		Laptop lapt = new Laptop(2,6000,20000,1,10,15,1);
		
		comp.display();
		lapt.display();
	}

}

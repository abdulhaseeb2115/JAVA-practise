package lab10;

public class EmplayeeTask implements RegisterForExams {
	private String name;
	private String date;
	private int salary;
	public EmplayeeTask()
	{
	name = null;
	date = null;
	salary = 0;
	}
	public EmplayeeTask(String name,String date,int salary)
	{
	this.name = name;
	this.date = date;
	 this.salary = salary;
	}
	@Override
	public void register() {
	// TODO Auto-generated method stub
	System.out.println(">Name " + name + "\n>salary " + salary + "\n>Employeereistered on date " + date);
	}
	}


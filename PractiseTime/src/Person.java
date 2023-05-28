
public class Person {
	private String name;
	public Person()
	{
	name = "none";
	}
	public Person(String theName)
	{
	name = theName;
	}
	public Person(Person theObject)
	{
	name = theObject.name;
	}
	public String getName()
	{
	return name;
	}
	public void setName(String theName)
	{
	name = theName;
	}
	public String toString()
	{
	return name;
	}
	public boolean equals(Object other)
	{
	return name.equals(((Person)other).name);
	}

}

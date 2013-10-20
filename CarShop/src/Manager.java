public class Manager 
{
	public Manager()
	{
		name = null;
		age = 0;
		salary = 0;
	}
	public Manager(String aName, int anAge)
	{
		name = aName;
		age = anAge;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public int getSalary()
	{
		return salary;
	}
	public void setName(String aName)
	{
		name = aName;
	}
	public void setAge(int anAge)
	{
		age = anAge;
	}
	public void sale(Car aCar)
	{
		salary += (int)(aCar.getPrice()*0.05);
	}
	
	private String name;
	private int age;
	public int salary;
}

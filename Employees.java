public class Employees 
{
	private String FirstName;
	private String LastName;
	private int ContactNumber;
	private int Id;
	public Employees()
	{
		FirstName=null;
		LastName=null;
		ContactNumber=0;
		Id=0;
	}
	public String getFirstName()
	{
		return FirstName;
	}
	public String getLastName()
	{
		return LastName;
	}
	public int getContactNumber()
	{
		return ContactNumber;
	}
	public int getId()
	{
		return Id;
	}
	public void setFirstName(String s)
	{
		FirstName=s;
	}
	public void setLastName(String s)
	{
		LastName=s;
	}
	public void setContactNumber(int s)
	{
		ContactNumber=s;
	}
	public void setId(int s)
	{
		Id=s;
	}
}
	
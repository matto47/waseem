//Q4
import java.util.Scanner;
public class testEmployees
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		Employees emp=new Employees();
//Setting Process		
		System.out.println("Enter your First Name:");
		emp.setFirstName(input.nextLine());
		
		System.out.println("Enter your Last Name:");
		emp.setLastName(input.nextLine());
		
		System.out.println("Enter your Contact Number:");
		emp.setContactNumber(input.nextInt());
		
		System.out.println("Enter your Id:");
		emp.setId(input.nextInt());
//getting Process
		System.out.println("Your First Name is:"+emp.getFirstName());
		System.out.println("Your Last Name is:"+emp.getLastName());
		System.out.println("Your Contact number is:"+emp.getContactNumber());
		System.out.println("Your Id is:"+emp.getId());
	}
}
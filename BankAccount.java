//Q3
import java.util.Scanner;
public class BankAccount
{
	String N;
	public BankAccount(String Name)
	{
		N=Name;
	}
	public String getName()
	{
		return N;
	}
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		BankAccount [] array;
//Q3(i)
		array=new BankAccount[5];

//Q3(ii)
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter name of Account Holder:");
			array[i]=new BankAccount(input.nextLine());
			System.out.println(array[i].getName());
		}	
	}
}
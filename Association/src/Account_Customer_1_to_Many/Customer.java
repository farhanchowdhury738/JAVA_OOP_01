package Account_Customer_1_to_Many;

public class Customer
{
	private String cusName;
	private int cusID;
	private Account acc[];// 1 to m
	
	public Customer()
	{
		
	}
	public Customer(String cusName, int cusID, int count)
	{
		this.cusName=cusName;
		this.cusID = cusID;
		acc = new Account[count];
	}
	public void setName(String cusName)
	{
		this.cusName = cusName;
	}
	public void setID(int cusID)
	{
		this.cusID = cusID;
	}
	public void setAcc(int count)
	{
		acc = new Account[count];
	}
	public String getName()
	{
		return cusName;
	}
	public int getID()
	{
		return cusID;
	}
	
	public void addAccount(Account a)
	{
		int check = 0;
		for(int i=0; i<acc.length; i++)
		{
			if(acc[i]==null)
			{
				acc[i] = a;
				check = 1;
				break;
			}
		}
		if(check == 1)
		{
			System.out.println("Account added!");
		}
		else
		{
			System.out.println("Account not added!");
		}
	}
	public void deleteAccount(Account a)
	{
		int check = 0;
		for(int i=0; i<acc.length; i++)
		{
			if(acc[i]==a)
			{
				acc[i] = null;
				check = 1;
				break;
			}
		}
		if(check == 1)
		{
			System.out.println("Account deleted!");
		}
		else
		{
			System.out.println("Account not deleted!");
		}
	}
	public boolean searchAccount(Account a)
	{
		int check = 0;
		for(int i=0; i<acc.length; i++)
		{
			if(acc[i]==a) //acc[2] == a; a3 == a3
			{
				check = 1;
				break;
			}
		}
		if(check == 1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void display()
	{
		System.out.println("Customer Name: "+cusName);
		System.out.println("Customer ID: "+cusID);
		System.out.println("Customer Account Details: ");
		for(int i=0; i<acc.length; i++)
		{
			if(acc[i]!=null)
			{
				acc[i].display();
			}
			else
			{
				System.out.println("This account was closed!");
			}
			
		}
	}
	public void performDeposit(Account a, double amount)
	{
		int check = 0;
		for(int i=0; i<acc.length; i++)
		{
			if(acc[i]==a)//acc[0] == a1-> a1 == a1
			{
				acc[i].deposit(amount);//a1.deposit(500);
				check = 1;
				break;
			}
		}
		if(check == 1)
		{
			System.out.println("Account found!");
		}
		else
		{
			System.out.println("Account not found!");
		}
	}
	public void performWithdraw(Account a, double amount)
	{
		int check = 0;
		for(int i=0; i<acc.length; i++)
		{
			if(acc[i]==a)//acc[0] == a1-> a1 == a1
			{
				acc[i].deposit(amount);//a1.deposit(500);
				check = 1;
				break;
			}
		}
		if(check == 1)
		{
			System.out.println("Account found!");
		}
		else
		{
			System.out.println("Account not found!");
		}
	}
	public void performTransfer(Account a1, Customer c,Account a2, double amount)
	{
		for(int i=0; i<acc.length; i++)
		{
			if(acc[i] ==  a1 && c.searchAccount(a2))
			{
				this.performWithdraw(a1, amount);
				c.performDeposit(a2, amount);

			}

		}
		//acc.transfer(c.acc, amount);
	}
	
	
}
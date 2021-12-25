package flex;
import java.util.*;
import java.lang.*;
import java.io.*;
class Account
{
	private int balance;
	public Account(int bal)
	{
		this.balance=bal;
	}
	public boolean isSufficientBalance(int w)
	{
		if(balance>=w) {
			return true;
		}
		else {
			return false;
		}
	}
	public void withdraw(int a)
	{
		balance=balance-a;
		System.out.println("Withdrawl Amount ->"+a);
		System.out.println("Your Current Balance ->"+this.balance);
		
	}
}
class Customer implements Runnable
{
	
	private Account acc;
	private String name;
	
	public Customer(Account A,String name)
	{
		this.acc=A;
		this.name=name;
	}
	
	
	
	public void run()
	{
		
		
		synchronized(acc) {
			Scanner sc=new  Scanner(System.in);
			System.out.println(name+"Enter the amount to withdraw->");
			int amount=sc.nextInt();
			if(acc.isSufficientBalance(amount))
			{
				System.out.println(name);
				acc.withdraw(amount);
			}
			else {
				System.out.println("Insufficient balance");
			}
		}
		
	}
	
}
public class MultipleThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Account a1=new Account(1000);
		Customer c1=new Customer(a1,"Omama"),c2=new Customer(a1,"Santosh");
		Thread t1=new Thread(c1);
		Thread t2=new Thread(c2);
		t1.start();
		t2.start();
	}

}

OUTPUT ->
OmamaEnter the amount to withdraw->
500
Omama
Withdrawl Amount ->500
Your Current Balance ->500
SantoshEnter the amount to withdraw->
500
Santosh
Withdrawl Amount ->500
Your Current Balance ->0


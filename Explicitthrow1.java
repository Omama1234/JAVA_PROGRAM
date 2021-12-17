package flex;
import java.io.*;
import java.lang.*;
import java.util.*;

public class Explicitthrow1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int balance=5000;
		int withdrawlAmount=9000;
		
		try {
			if(balance<withdrawlAmount)
			{
				throw new ArithmeticException("Insufficient Balance");
			}
			balance=balance-withdrawlAmount;
			System.out.println("Transaction Successfully Completed");
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception ->"+e.getMessage());
		}
		System.out.println("Program Continue...");

	}

}
OUTPUT ->
Exception ->Insufficient Balance
Program Continue...

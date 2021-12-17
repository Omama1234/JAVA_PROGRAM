package flex;
import java.io.*;
import java.lang.*;
import java.util.*;

public class Explicitthrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int balance=5000;
		int withdrawlAmount=9000;
		if(balance<withdrawlAmount)
		{
			throw new ArithmeticException("Insufficient Balance");
		}
		balance=balance-withdrawlAmount;
		System.out.println("Transaction Successfully Completed");
		System.out.println("Program Continue...");

	}

}

OUTPUT ->
  Exception in thread "main" java.lang.ArithmeticException: Insufficient Balance
	at Index/flex.Explicitthrow.main(Explicitthrow.java:14)

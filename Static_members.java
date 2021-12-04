//Static member variable 
//Static member function


package Test;

import java.lang.*;

class Example
{
	int x;
	private static int y;
	public void fun1() {
		System.out.println("Hello");
	}
	public static void fun2() {
		System.out.println(y);
		System.out.println("World");
	}
	static class Test
	{
		public static String country="INDIA";
	}
}

class HelloWorld {

	public static void main(String [] args)
	{
		
		 Example.fun2();
		 System.out.println(Example.Test.country);
        
		
	
	}
	

}

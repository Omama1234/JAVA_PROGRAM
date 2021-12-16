package flex;

public class Exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println("Start");
			System.out.println(3/0);  //Arithmetic Exception 
			System.out.println("End");
		}
		
		catch(NullPointerException a)    //Not able to catch the Exception
		{
			System.out.println("Exception ->"+a.getMessage());
		}
		
		System.out.println("In finally block");
	

	}

}

OUTPUT ->
Start
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at Index/flex.Exception.main(Exception.java:10)


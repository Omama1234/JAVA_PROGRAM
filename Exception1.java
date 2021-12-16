package flex;

public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println("Start");
			System.out.println(3/0);
			System.out.println("End");
		}
		catch(ArithmeticException a)
		{
			System.out.println("Exception ->"+a.getMessage());
		}
		finally {
			System.out.println("In finally block");
		}

	}

}

OUTPUT ->
  
Start
Exception ->/ by zero
In finally block

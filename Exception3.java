package flex;

public class Exception3 {

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
		finally {
			System.out.println("In finally block");
		}
	System.out.println("Hello");

	}

}

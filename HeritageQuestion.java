public class HeritageQuestion
{
	public static void main(String[] args) {
		try {
		    System.out.println("1");
		    int data=5/0;
		    
		} catch(ArithmeticException e) {
		    System.out.println("Exception ->"+e.getMessage());
		    System.out.println("2");
		    System.exit(0);  // This will stop our program and program ends here
		}
		finally{
		    System.out.println("3");
		}
		System.out.println("4");
	}
}


OUTPUT ->
1
Exception ->/ by zero
2

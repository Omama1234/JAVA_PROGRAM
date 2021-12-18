public class HeritageQuestion1
{
	public static void main(String[] args) {
		try {
		    System.out.println("1");
		    int data=5/0;
		    
		} catch(ArithmeticException e) {
		    System.out.println("Exception ->"+e.getMessage());
		    System.out.println("2");
		    //System.exit(0);
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
3
4

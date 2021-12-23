package flex;

public class Test {

	
		private static int[] x; 
	    public static void main(String[] args) 
	    { 
	        System.out.println(x[0]); 
	    } 
	
}
OUTPUT ->
Exception in thread "main" java.lang.NullPointerException: Cannot load from int array because "flex.Test.x" is null
	at Index/flex.Test.main(Test.java:9)

class Test
{
    void myMethod()
    {
        System.out.println("Semester");
    }

    
}
public class College_paper extends Test
{
    void myMethod()
    {
        System.out.println("Even Sem");
    }
	public static void main(String[] args) {
	    
	    College_paper object=new Test();
	    object.myMethod();
      
   }
		
}	


OUTPUT ->
  Main.java:27: error: incompatible types: Test cannot be converted to College_paper
	    College_paper object=new Test();
	                ^
1 error

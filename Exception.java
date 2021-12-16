//Throwable is the Super/Parent class of all the Exception classes.
//Object is the Super/Parent class of all the java Classes.

package flex;
import java.io.*;
import java.lang.*;
import java.lang.*;
class Throwable{
	private String s1;
	public Throwable(String name)
	{
		this.s1=name;
	}
	public String getMessage()
	{
		return s1;
		
	}
}
public class Exception{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Throwable e1=new Throwable("Exception");
		System.out.println(e1.getMessage());
		
		

	}

}

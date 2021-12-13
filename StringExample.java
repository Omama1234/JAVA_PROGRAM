import java.lang.*;
public class StringExample
{
	public static void main(String[] args) {
		String s1="Computer";
		String s2="Computer";
		String s3=new String("Computer");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
	}
}

OUTPUT ->
true
true
false
true


...Program finished with exit code 0
Press ENTER to exit console.

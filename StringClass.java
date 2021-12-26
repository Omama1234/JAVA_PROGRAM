/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
    
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a String ->");
		String str=sc.nextLine();
		System.out.println(str.length());
		char[] ch=str.toCharArray();
		int low=0;
		int high=str.length()-1;
		while(high>low)
		{
		    char temp=ch[low];
		    ch[low]=ch[high];
		    ch[high]=temp;
		    low++;
		    high--;
		}
		System.out.println("Reversed String ->");
		for(int i=0;i<ch.length;i++)
		{
		    System.out.print(ch[i]);
		}
	}
}
OUTPUT ->
Enter a String ->
Santosh
7
Reversed String ->
hsotnaS

...Program finished with exit code 0
Press ENTER to exit console.

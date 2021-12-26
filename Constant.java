/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Constant
{
	public static void main(String[] args) {
		int a=1_23_4;
		System.out.println(++a);
	}
}
OUTPUT ->
1235


//Expalantion ->	
// Separate groups of digits in numeric literals, Which improves the readability of our code
//You cannot use underscore at the beginning or end of number .
/*Example ->   
  int a=_10; //Error,this is an identifier,not a numeric literals 
  int a=10_;//Error
  
 
 */
	

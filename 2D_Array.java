package Test;
import java.io.*;
import java.util.*;


public class 2D_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(System.in);
		int[][] arr=new int[4][];
		
		System.out.println("arr[0][0]="+arr[0][0]);  //error
		
		

	}

}

Output -> Exception in thread "main" java.lang.NullPointerException: Cannot load from int array because "arr[0]" is null
	at HelloWorld/Test.Array.main(Array.java:13)

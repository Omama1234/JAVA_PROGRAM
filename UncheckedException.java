package flex;
import java.io.*;
//import java.sql.*;

public class UncheckedException {

	public static void main(String[] args) throws IllegalAccessException, IOException{
		// TODO Auto-generated method stub
		
		throw new IOException();
		//System.out.println("Hello");

	}

}

// DCM will Excecute here print the error message and our program ends
OUTPUT ->
  Exception in thread "main" java.io.IOException
	at Index/flex.UncheckedException.main(UncheckedException.java:10)

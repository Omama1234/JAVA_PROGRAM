package flex;

public class CommandLineArgument2 {

	
	public static void main(String [] args) 
    {
        String [][] argCopy = new String[2][2];
        int x;
        argCopy[0] = args;
        x = argCopy[0].length;
        System.out.println("Size of argCopy[0]->"+x);
        for (int y = 0; y < x; y++) 
        {
            System.out.print(" " + argCopy[0][y]);
        }
    }
}
//in Command line argument->  1 2 3
OUTPUT ->
Size of argCopy[0]->3
 1 2 3

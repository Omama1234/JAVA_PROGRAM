import java.util.*;
public class StringBuilder{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string ->");
        String str=sc.nextLine();
        System.out.println("Size of string ->"+str.length());
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        System.out.print("Reversed string ->");
        System.out.println(sb.toString());
    }
}

OUTPUT ->
Enter a string ->Santosh Kumar
Size of string ->13
Reversed string ->ramuK hsotnaS

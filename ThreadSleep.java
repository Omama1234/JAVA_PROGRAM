import java.util.*;
class t implements Runnable{
    @Override
    public void run(){
        for(int i=0;i<10;i++)
        {
            try {
                Thread.sleep(10000);
                
            } catch(Exception e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
}
public class Main
{
    
	public static void main(String[] args) {
	  Thread t=new Thread(new t());
	  t.start();
	}
}

OUTPUT ->
0    //Duration between each print will be 10 seconds
1
2
3
4
5
6
7
8
9


...Program finished with exit code 0
Press ENTER to exit console.

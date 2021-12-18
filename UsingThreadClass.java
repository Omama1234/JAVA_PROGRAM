
//Thread Implementation Using extends of THread class
package flex;
import java.lang.*;

class A1 extends Thread
{
	@Override
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println("i="+i+"Thread A");
		}
	}
}
class B1 extends Thread
{
	@Override
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println("i="+i+"Thread B");
		}
	}
}
public class UsingThreadClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A1 o1=new A1();
		B1 o2=new B1();
		o1.start();
		o2.start();

	}

}

OUTPUT ->
i=0Thread A
i=1Thread A
i=0Thread B
i=2Thread A
i=1Thread B
i=3Thread A
i=2Thread B
i=4Thread A
i=3Thread B
i=5Thread A
i=4Thread B
i=6Thread A
i=5Thread B
i=7Thread A
i=6Thread B
i=8Thread A
i=7Thread B
i=9Thread A
i=8Thread B
i=9Thread B
i=10Thread B
i=10Thread A


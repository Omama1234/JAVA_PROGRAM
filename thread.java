package flex;
import java.lang.*;
class A implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=10;i++)
		{
			System.out.println("Thread A->"+i);
		}
		
	}
	
}
class B implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=10;i++)
		{
			System.out.println("Thread B->"+i);
		}
		
	}
	
}

public class thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1=new Thread(new A());
		Thread t2=new Thread(new B());
		t1.start();
		t2.start();

	}

}


OUTPUT ->
  
Thread A->0
Thread A->1
Thread B->0
Thread A->2
Thread B->1
Thread B->2
Thread A->3
Thread A->4
Thread B->3
Thread B->4
Thread A->5
Thread A->6
Thread B->5
Thread B->6
Thread A->7
Thread B->7
Thread A->8
Thread B->8
Thread A->9
Thread B->9
Thread A->10
Thread B->10


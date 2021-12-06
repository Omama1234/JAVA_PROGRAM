
package Test;




class T {
	
	private int l,b,h;
	public T()
	{
		
	}
	public T(int l,int b,int h)
	{
		this.l=l;
		this.b=b;
		this.h=h;
	}
	public void Show()
	{
	   System.out.println("L="+l);
	   System.out.println("B="+b);
	   System.out.println("H="+h);
	}
	

	

}
public class Hello{
	public static void main(String[] args)
	{

       T h1=new T(10,15,8);
       T h2=new T();
       h1.Show();
       h2.Show();
		
		
	
	}
	
}

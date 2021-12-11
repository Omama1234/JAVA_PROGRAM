package Test;


class A
{
	int a;
	public A(int x)
	{
		System.out.println("A");
	}
}
class B extends A
{
	int b;
	public B()
	{
		super(5); // Must be the first line
		System.out.println("B");
	}
}
public class Constructor_in_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B obj=new B();

	}

}

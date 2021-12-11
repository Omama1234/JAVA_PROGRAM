package HelloWorld;
class A {
	int a;
	public A()
	{
		System.out.println("S");
	}
	public A(int x)
	{
		//a=x;
		System.out.println("A");
	}
}
class B extends A
{
	int b;
	public B()
	{
		super(4);
		System.out.println("B");
	}
}
public class Costructor_inheritance
{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj=new B();
	}

}

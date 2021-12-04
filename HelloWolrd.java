//HelloWorld.java
//With Using object
package Test;

import java.lang.*;

class Box
{
	private int l,b,h;
	public void SetDimension(int l,int b,int h)
	{
		this.l=l;
		this.b=b;
		this.h=h;
	}
	public void ShowDimension()
	{
		System.out.println("L="+l);
		System.out.println("B="+b);
		System.out.println("H="+h);
	}
}

class HelloWorld {

	public static void main(String [] args)
	{
		
     	Box b1=new Box();
     	b1.SetDimension(12,6,9);
     	b1.ShowDimension();
     	
        
		
	
	}
	

}


//With Static keyword
//Without using object
//file name -> type_casting.java
package Test;

import java.lang.*;
class box
{
	private static int length,breadth,height;
	public static void setdimension(int l,int b, int h)
	{
		length = l; breadth =b; height = h;
	}
	public static void showdimension()
	{
		System.out.println("l="+length);
		System.out.println("b="+breadth);
		System.out.println("h="+height);
	}
}
class type_casting{
	public static void main(String args[]) {
		box.setdimension(12,5,9);
		box.showdimension();
	}
	
}

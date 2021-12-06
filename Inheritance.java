package Test;


class Animal
{
	protected  int numleg;
	protected  String Sound;
	
	public int Set(int x,String s)
	{
		numleg=x;
		Sound=s;
		return 0;
	}
	
	
}
class Dog extends Animal{
	
	int a=Set(4,"Bhaw Bhaw");
	
	public void Show()
	{
		System.out.println("Number of legs of Dog->"+numleg);
		System.out.println("Dog Sounds like ->"+Sound);

	}
}
class Cow extends Animal{
	int z=Set(4,"Moo");
	public void Show()
	{
		System.out.println("Number of legs of Cow->"+numleg);
		System.out.println("Cow Sounds like ->"+Sound);

	}
	
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d1=new Dog();
		d1.Show();
		Cow c1=new Cow();
		c1.Show();
		
		
		

	}

}

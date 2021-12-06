package Test;

class p {
	private int age;
	private String name;
	public void setage(int a)
	{
		age=a;
  }
	public void setname(String n)
	{
		name=n;
	}
		public int getAge()
		{
			return(age);
		}
		public String getName()
		{
			return(name);
		}
}
class student extends p
{
	private int rollno;
	public void setRollno(int r)
	{
		rollno=r;
	}
	public int getRollno()
	{
		return rollno;
	}
	
	
}
public class person{
	public static void main(String[] args) {
		student s1=new student();
		s1.setRollno(100);
		s1.setname("Santosh");
		s1.setage(25);
		System.out.println("Rollno ->"+s1.getRollno());
		System.out.println("Name ->"+s1.getName());
		System.out.println("Age ->"+s1.getAge());
		}
}

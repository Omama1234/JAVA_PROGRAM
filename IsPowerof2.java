package Test;

public class IsPowerof2 {
	
	static boolean isPowerof2(int n) {
		
		if(n==0)
			return false;
		while(n!=1)
		{
			if(n%2!=0)
				return false;
			n=n/2;
		}
		if(n==1)
		{
			return true;
		}
		return false;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	     int n=8;
	     
	     
	     System.out.println(isPowerof2(n));

	}

}

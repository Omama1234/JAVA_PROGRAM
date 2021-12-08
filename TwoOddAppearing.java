package Test;

public class TwoOddAppearing {
	
	public static void main(String[] args) {
		int[] arr= {20,15,20,16};
		int xor=0;
		int res1=0;
		int res2=0;
		for(int i=0;i<4;i++) {
			xor=xor^arr[i];
		}
		int sn=xor & ~(xor-1);  //right most set bit
		
		for(int i=0;i<4;i++)
		{
			if((sn & arr[i])!=0)
				res1=res1^arr[i];
			else
				res2=res2^arr[i];
		}
		System.out.println(res1+" "+res2);
	}

}

//OUTPUT -> 15 16


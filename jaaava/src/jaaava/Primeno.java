package jaaava;

public class Primeno {

	public static boolean isprime(int n) {
		
		if (n<=1)
		{
			return false;
		}
		
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		 }
		return true;
	}
	 static public void main(String[] args) {
		
		System.out.println("2 is prime no:"+isprime(2));

		System.out.println("56 is prime no:"+isprime(56));
	}
}

package jaaava;

public class Armstroing {
public static void main(String[] args) 
   {
	int k=0,a,q;
	int n=123;
	q=n;
	while(n>0)
	{
		a=n%10;
		n=n/10;
		k=k+(a*a*a);
	}
		if(k==q)
		 System.out.println("armstrong no");
		else
		  System.out.println("it is not armstrong no");
		
	  }
	
    }
	


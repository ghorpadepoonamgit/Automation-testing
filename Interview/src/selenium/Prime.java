package selenium;

public class Prime {
	
	public static String prime(int N)
	{  
	   int count; int count2= 0 ; int temp;
	   for(temp= 1;temp<=N; temp++)
	 {
		   count= 0;
	 }
	  for(int j= 1;j<=temp; j++)
	   { 
	    if(temp%j==0)
	    {   count++;
	     }
	 if(count==2)
	 { 
		System.out.println(temp);
	  }
	return  count2++;
	   }
		
	}
	
	
public static void main(String[] args) {
	int N=20;
	
}
}

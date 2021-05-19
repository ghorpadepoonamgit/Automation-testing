package jaaava;



public class Starpattrns 
{
public static void main(String[] args) {
	int row=5;
	for(int i=1;i<=row;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	 
	System.out.println("-------------");
	
	
	 for(int k=1;k<=6;k++)
	 {
		 for(int m=6;m>=k;--m)
		 {
			 System.out.print("*");
		 }
		 System.out.println();
	 }
	 
	 
	 System.out.println("-------------");
	 
	 int star=1;
	 int space=5;
	  for(int p=1;p<=5;p++)
	  {
		 for(int q=1;q<space;q++)
		 {
			System.out.print(" ");
		 }
		 for(int q=1;q<=star;q++)
		 {
			System.out.print("* ");
		 }
		  System.out.println();
		  star++;
		  space--;
		   
	  }
	  
	  System.out.println("----------");
	  
	  
	  
	  int str=5;
	  int spc=1;
	  for(int r=1;r<=5;r++)
	  {
		  for(int l=1;l<spc;l++ )
		  {
			  System.out.print(" ");
			  
		   }
		  for(int l=1;l<=str;l++)
		  {
			  System.out.print("* ");
		  }
		System.out.println();
		str--;
		spc++;
		
	  }
	  
	  System.out.println("----------");
	  
	  int str1=1;
	  int spc1=5;
	  for(int w=1;w<=10;w++)
	  {
		  for(int u=1;u<spc1;u++)
		  {
			  System.out.print(" ");
		  }
		  for(int u=1;u<=str1;u++)
		  {
			  System.out.print("*");
		  }
		  System.out.println();
		  if(w<5)
		  {
			  spc1--;
			  str1=str1+2;
		  }
		  else
		  {
			  spc1++;
			  str1=str1-2;
		  }
	  }
	  
	System.out.println("-----------");
	  
	
	  }
  }
 


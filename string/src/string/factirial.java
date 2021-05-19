package string;

import java.util.Scanner;

public class factirial
{
public static void main(String[] args) 
{
    int fact=1;//a=4;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no");
	 int a=sc.nextInt();
	for(int i=1;i<=a;i++)
	{
		fact=fact*i;
	}
   System.out.println("factorial" + fact);
   }
}


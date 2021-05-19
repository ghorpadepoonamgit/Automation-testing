package jaaava;

import java.util.Scanner;

public class fibonaacciseris {
	public static void main(String[] args) {
		int k=0,a=1,b=1;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter no ");
		int  m=sc.nextInt();
		System.out.print(" 1 1 ");
		while(k<=m)
		//while(k<=100)
		{
			k=a+b;
		  System.out.print(k+" ");
		  a=b;
		  b=k;
		}
	}
	

}

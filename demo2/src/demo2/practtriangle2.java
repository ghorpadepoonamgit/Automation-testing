package demo2;

//without space
//*
//**
//***
//****
//*****
//******
//*******



public class practtriangle2
{

	public static void main(String[] args)
   {
		int star=1;
		int space=7;
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");// add remove space dffent output
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print("* ");//add remove space u will get traigles 
			}                          //pattrn
			System.out.println();
			star++;
			space--;
		}
		
		
	}
}

package demo2;
//*            
//***
//*****
//*******
//*********
//*******
//*****
//***
//*
//remove space
public class diamond {

	public static void main(String[] args) 
	{
		int star=1;
		int space=4;
		for(int i=1;i<=8;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print("  ");//add  space diamond output  
			                            //2 space add mirrror image 
			}                           
			for(int j=1;j<=star;j++)    
			{                           
				System.out.print("* ");  
			}                           
			System.out.println();       
			if(i<4)                     
			{
				space--;
				star=star+1;
			}
			else
			{
				space++;
				star=star-1;
			}
		}
	}
}

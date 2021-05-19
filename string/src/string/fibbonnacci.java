package string;

public class fibbonnacci 
{
	public static void main(String[] args) 
	{
		//0 1 1 2 3 5 8  n3=n1+n2
		int n1=0,n2=1,n3;
       

	for(int i=0;i<=20;i++)
	{
		n3=n1+n2;
		System.out.println("fibonacci no is " +n3);
		n1=n2;
		n2=n3;
	}
	}

}

package demo2;

public class triangle
{

	public static void main(String[] args) 
	{
		
		for(int lineNum=7;lineNum >= 1 ; lineNum--)
		{
			for(int printNum =1; printNum <=lineNum; ++printNum)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

package demo2;

public class triange2 
{
    public static void main(String[] args)
    {  
    	int line=7;
    	for(int lineNum =1; lineNum <= line; lineNum++ )
    	{
    	for(int space=(line-lineNum);space >=1;space--)
    	 {
    		System.out.print(" ");
    	 }
    	for(int print =1; print <= lineNum; ++print)
    	 {
    		System.out.print("* ");
    	 }
    	System.out.println();
    	}
		
	}
}
 
package selenium;

public class Rightselenium {

	public static void main(String[] args) {
		
	
	String b="Selenium";
	
	for(int p=0;p<b.length();p++)
	{
		for(int q=0;q<p+1;q++)
		{ 
			System.out.print(b.charAt(q));
		}
		System.out.println();
	 }
 
	System.out.println();
  String c="Selenium";
	
	for(int d=0;d<c.length();d++)
	{
		for(int l=0;l<c.length()-d;l++)
		{ 
			System.out.print(c.charAt(l));
		}
		System.out.println();
	 }
	
	
}}

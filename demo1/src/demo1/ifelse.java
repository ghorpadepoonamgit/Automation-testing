package demo1;

public class ifelse {
	public static void main(String[] args) {
		int a=70;
		int b=40;
		int c=32;
		int d=98;
		if(a>b)
		{
			if(a>c)
			{
				if(a>d)
				 {
					System.out.println("a");
				 }
				else 
				 {
					System.out.println("d");
				 }
			}
				else
				{
					 if(c>d)
					 {
						System.out.println("c"); 
						
					 }
					 else
					 {
						 System.out.println("d");
						 
					 }
					 
				  }
		}
			else
			{
				if(b>c)
				{
					if(b>d)
					{
						System.out.println("b");
						
					}
					else
					{
						System.out.println("d");
						
					
					}
				}
					else 
					{
						if(c>d)
						{
							System.out.println("c");
							
						}
						else
						{
							System.out.println("d");
						}
					}
				}
			}
		
		
	}



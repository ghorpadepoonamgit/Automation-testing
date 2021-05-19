package mock;

public class exc extends instance
{
	 static void demotest()
	{
		System.out.println("sub class");
	}
	
	
	public static void main(String[] args) 
	{
		instance.demotest();
		exc.demotest();
	    exc H=new exc();
		H.demotest();
		
		instance G=new instance();
         G.demotest();
		}
}

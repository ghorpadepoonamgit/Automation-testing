package aceess;

public class classA 
{
	
	
  public int a=30;
   int b=20;
   private int f=40;
   protected  int j=35;
   protected static int k=54;
   
   protected classA()
	{
	  b=60;
	}
  public static void main(String[] args)
  {
    classA M=new classA();
	  System.out.println(M.a);
	  System.out.println(M.b);
	  System.out.println(M.f);
	  System.out.println(M.j);
	  
}
   
}

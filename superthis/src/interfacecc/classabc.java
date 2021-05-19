package interfacecc;

public class classabc implements test,call
{
	public void demo()//this is alwys public
	{
		System.out.println("print");
	}
   public void testing()
   {
	   System.out.println("done");
   }
   public void testd()
   {
	   System.out.println("call");
	   
   }
   
   public void callD()
   {
	   System.out.println("hiii");
   }
   
   public static void main(String[] args) 
   
   {
	  classabc y=new classabc();
	  y.demo();
	  y.testing();
	  y.callD();
	  y.testd();
   }
}

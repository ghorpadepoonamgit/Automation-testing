package mock;

public class constuctor
{ 
/*	public int a=10;
	
	static int b=22;
	
    constuctor()
   {
	   a=40;
	    b=30;
	   // return a;
   }
   */
    int b,a;
    constuctor(int a)
   {
	   a=23;
	   b=35;
	   
   }
    
    void classd(int a)
    {
    	
    	System.out.println("hi...");
    	//return 0;
    }
  
    
 public static void main(String[] args) 
 {
	/* constuctor y=new constuctor();
	 System.out.println(y.a);
		System.out.println(b); //compl error
	 constuctor x=new constuctor(4);
	
	System.out.println(x.a);
	System.out.println(constuctor.b);
    
	System.out.println(x.b);
	System.out.println(b);
	 */
constuctor x =new constuctor(5);
System.out.println(x.a);
System.out.println(x.b);
//System.out.println(constuctor.classd(4));
	 
	
 }
   
}

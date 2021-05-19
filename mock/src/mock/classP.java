package mock;

public class classP 

{
	
	
	int c=20;
	static int f=5;
	void test()
	{
		
		System.out.println("without argument");
	}

	void test(int k)
	{
		System.out.println("with argument int");
	}
	
	static void demo()
	{
		System.out.println("static without argu");
	}
	
	static void demo(int d)
	{
	   int c=10;
	   System.out.println(c);
		System.out.println("static with argument");
	}
	
	public static void main(String[] args) 
	{
		classP d=new classP();
		d.test();
		d.test(5);
		
		classP.demo();
		classP.demo(4);
		classP.demo(7);
		System.out.println(f);
		System.out.println(d.c);
		
		classP W=new classP();
		System.out.println(W.c);
				
		
		
		
	}
}

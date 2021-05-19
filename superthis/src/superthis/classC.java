package superthis;



public class classC extends classD
{
	
	 int h=10;
	int k =20;
	
	void test()
	{
		int h=30;
		System.out.println("local" + h);
		System.out.println("global" + this.h);
		System.out.println("super" + super.h);

	}
	public static void main(String[] args) 
	{
		classC x=new classC();
		x.test();
		System.out.println("----");
		
		x.h=40;
		x.test();
		
		System.out.println("----");
		classC y=new classC();
		y.test();
		
		
	}
}

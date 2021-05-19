package demo5;

public class excute 
{
	public static void main(String[] args)
	{
		//method class from classA
		classA.statictest();
		classA x=new classA();
		x.test();
		
		//method call from classB
		classB.staticsubtest();
		classB y=new classB();
		y.subtest();
		
		//Inheritance
		classB.staticsubtest();
		y.test();
		
		System.out.println(y.c);
		System.out.println(classB.d);
		
		
		
		
	}

}

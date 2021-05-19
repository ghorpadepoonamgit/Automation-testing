package demo4;



public class multipleconstuctor
{
	int a;
	static  int b;
	int c;
	int g;
	 multipleconstuctor() 
	 {
		 a=30;
		 b=20;
		 c=30;
		
	 }
	multipleconstuctor(int k)
	{
		a=22;
		b=25;
		c=32;
	}
public static void main(String[] args) 
{
	System.out.println(b);
	multipleconstuctor add=new multipleconstuctor();
	multipleconstuctor sub=new multipleconstuctor(10);
	multipleconstuctor mul=new multipleconstuctor();
	
	add.g=add.b + add.a;
	System.out.println(add.g);
	sub.g=sub.c-sub.a;
	System.out.println(sub.g);
	mul.g=mul.a*mul.b;
	System.out.println(mul.g);
}
}

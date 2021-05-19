package demo4;

public class  Const {
		int a;
		static  int b;
		int c;
		int g;
		 Const() 
		 {
			 a=30;
			 b=20;
			 c=30;
			
		 }
		Const(int k)
		{
			a=22;
			b=25;
			c=32;
		}
	public static void main(String[] args) 
	{
		System.out.println(b);
		Const add=new Const();
		Const sub=new Const(10);
		Const mul=new Const();
		
		add.g=add.b + add.a;
		System.out.println(add.g);
		sub.g=sub.c-sub.a;
		System.out.println(sub.g);
		mul.g=mul.a*mul.b;
		System.out.println(mul.g);
	}
	}


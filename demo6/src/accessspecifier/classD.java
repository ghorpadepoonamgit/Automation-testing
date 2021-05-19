package accessspecifier;

import demo6.classA;

public class classD extends classA
{
public static void main(String[] args)
{
	System.out.println(classA.A);
//	System.out.println(classA.B);not call bcoz its private 
	System.out.println(classA.D);
//	System.out.println(classA.C); can not call bcoz default
}
}

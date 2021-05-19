package accessspecifier;

import demo6.classA;

public class classC extends classD
{
   public static void main(String[] args) {
	
	   System.out.println(classA.A);
//	   System.out.println(classA.B);  can not call bcoz its in 
//	   System.out.println(classA.C);  diffrent pkg
	   System.out.println(classD.D);
	   
}
}

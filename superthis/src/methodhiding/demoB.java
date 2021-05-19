package methodhiding;

public class demoB extends demoA
 {
   static void demo()
    {
	   int a=40,b=8;
	   int s=a*b;
	System.out.println(s);
	System.out.println("subclass");
    }
}

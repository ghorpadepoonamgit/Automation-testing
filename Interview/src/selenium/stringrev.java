package selenium;

import java.util.Scanner;

public class stringrev {

	public static void main(String []args){
      
	   String str="poonam ghorpade bbubcb";
       System.out.println(stringrev.remove(str));
    }

	public static String remove(String str)
	{
		str=str.replaceAll("\\s", "");
		return str;
	}
}

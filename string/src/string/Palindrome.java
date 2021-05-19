package string;

public class Palindrome
{
	public static void main(String[] args) {
		
	
	int len,i;
  String  a="mom";
  
  String str1="";
  System.out.println("String is:" +a);
   len= a.length();
  System.out.println("string lenght is:" +len);
  for(i=len;i>0;i--)
  {
	  str1+=a.charAt(i-1);
  }
  
  System.out.println("revrse of string is:"+str1);
  if(str1.equals(a))
  {
	  System.out.println("string is palindrome");
  }
  else
  {
	  System.out.println("string is not palindrome");
  }

  
  
	}	
}

package string;



public class stringS 
{
public static void main(String[] args) 
{
	String A="Nvidia Graphics";
	String B="Nvidia Graphics";
	
	String C=new String("Velocity");
	System.out.println(A.substring(0, 6));
	System.out.println(A.equals(B));
	System.out.println(A.charAt(5));
	System.out.println(A.compareTo(B));
	System.out.println(C.toUpperCase());
	System.out.println(C.toLowerCase());
	System.out.println(C.replace("o","w"));
	System.out.println(A.concat("America"));
	System.out.println(A.indexOf("G"));
	System.out.println(B.trim());
	System.out.println(A.equalsIgnoreCase(B));
	System.out.println(A.lastIndexOf("a"));
	System.out.println(A.startsWith("Nv"));
	System.out.println(A.endsWith("cs"));
	System.out.println(A.length());
    }
}

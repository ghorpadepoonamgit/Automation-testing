package demoArry;

import java.util.Arrays;

public class Assry3dpostion
{

	
	public static int getThirdLargest(int[] a, int total){  
		Arrays.sort(a);  
		return a[total-3];  
		}  
		public static void main(String args[]){  
		int a[]={1,2,5,6,3,2,7,9};  
		int b[]={44,66,99,77,33,22,55,88};  
		System.out.println("Third Largest: "+getThirdLargest(a,8));  
		System.out.println("Third Largest: "+getThirdLargest(b,8)); 
		
		
		}		
		
		
}

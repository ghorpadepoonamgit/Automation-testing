package demoArry;

import java.util.Arrays;

public class REVERSE
{
 public static void main(String[] args) {
	 int [] arr = new int [] {31,20, 2, 3, 4, 5}; 
	 String [] a= {"velocity","pune","nvidia"};
	
	 
	/* for(int i:arr)
	 {
		System.out.print(""+i);
	 }
	 
     System.out.println("Original array: "); 
     Arrays.sort(arr);
     System.out.println("sort: "); 
     for (int i = 0; i < arr.length; i++) {  
         System.out.print(arr[i] + " ");  
     }  
     System.out.println();  */
     System.out.println("Array in reverse order: ");  
                                      //Loop through the array in reverse order  
     for (int i = arr.length-1; i >= 0; i--) {  
         System.out.print(arr[i] + " ");  
         
     }  
  }
}

package jaaava;

public class Rightpyramid {
	public static void main(String[] args) {
		
		 int rows =5;
	               
	        for (int i= 1; i<= rows ; i++)
	        {
	            for (int j=1; j<=i; j++) 
	            { 
	            	System.out.print(j);
	            } 
	            System.out.println("");
	            } 
	           for (int i=rows; i>=0; i--)
	            {
	            for(int j=1; j <= i-1;j++)
	            {
	                System.out.print(j);
	            }
	            System.out.println("");
	        }
	        
	      
	 
	        int row=5;      
	        for (int i= 1; i<= row ; i++)
	        {
	            for (int j=i; j <row ;j++)            
	            {
	                System.out.print(" ");
	            }
	            for (int k=1; k<=i;k++)
	            {
	            System.out.print("*");
	            }
	            System.out.println("");
	            } 
	            for (int i=row; i>=1; i--)
	            {
	            for(int j=i; j<=row;j++)
	            {
	                System.out.print(" ");
	            }
	            for(int k=1; k<i ;k++) 
	            {
	                System.out.print("*");
	            }
	            System.out.println("");
	 
	            
	        }
	
	  }
}

package string;

import java.util.Scanner;

public class hcfLcm 
{
public static void main(String[] args) 
{
	
	int A, B, num1, num2, temp, hcf, lcm;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter two Number: ");
    num1 = scanner.nextInt();
   
    num2 = scanner.nextInt();
   
    A = num1;
    B = num2;

    while(B != 0){
       temp = B;
       B = A%B;
       A = temp;
    }

    hcf = A;
    lcm = (num1*num2)/hcf;

    System.out.println("HCF of input numbers: "+hcf);
    System.out.println("LCM of input numbers: "+lcm);
 }
}


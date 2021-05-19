package demo2;
//*******           
//******             
//*****               
//****
//***
//**
//*
//without space
public class practicetriangle
{
public static void main(String[] args) 
{
	int star=7;
	int space=1;
	for(int i=1;i<=7;i++)//print new line
	{
		for(int j=1;j<=space;j++)//print space
		{
			System.out.print(" ");//add & remove space
			
		}
			for(int j=1;j<=star;j++)//print star
			{
				System.out.print("*");//add space & remove space
			}
			System.out.println();
		
		star--;
		space++;
	}
}
}

//*******
// ******
 // *****
 //  ****
   // ***
    // **
    //  *
// with one space


//* * * * * * * 
// * * * * * * 
//  * * * * * 
//   * * * * 
//    * * * 
//     * * 
//      * 
//with one space in star & space






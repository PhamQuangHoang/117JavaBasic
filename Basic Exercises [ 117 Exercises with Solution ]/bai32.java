package batap;

import java.util.Scanner;

public class bai32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner input = new Scanner(System.in);
	        int a; // first number to compare       
	        int b; // second number to compare  
	      
	        System.out.print( "Input first integer: " ); // prompt        
	        a = input.nextInt(); // read first number from user   
	 
	        System.out.print( "Input second integer: " ); // prompt        
	        b = input.nextInt(); // read second number from user               
	        
	        if ( a == b )           
	            System.out.printf( "%d == %d\n", a, b );  
	        if ( a != b )          
	            System.out.printf( "%d != %d\n", a, b );  
	        if ( a < b )          
	            System.out.printf( "%d < %d\n", a, b );  
	        if ( a > b )          
	            System.out.printf( "%d > %d\n", a, b );  
	        if ( a <= b )          
	            System.out.printf( "%d <= %d\n", a, b );  
	        if ( a >= b )          
	            System.out.printf( "%d >= %d\n", a, b ); 
	}

}

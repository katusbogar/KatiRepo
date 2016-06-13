/**
 * 
 */
/**
 * @author Katika
 *
 */
package Scanner;

/*
 * class that handles input from a user is called the Scanner class. 
 * The Scanner class can be found in the java.util library. 
 * To use the Scanner class, you need to reference it in your code. 
 * This is done with the keyword import.
 */

import java.util.Scanner;

public class ScannerIn {
	
	public static void main( String[ ] args ) {  

	Scanner user = new Scanner( System.in );    //create a new Scanner object - create new objects from a class. 
	
	String name;
	name = user.next( );
	System.out.print("Enter your first name: ");
	name = user.next( );

	
	
	}
}
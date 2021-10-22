/**
 * Program to find the correct int data type
 * @author Ikram M B A (201511043)
 * Reference sources:
   http://javagoodpractices.blogspot.com/2019/03/java-datatypes-hackerrank-solution-in.html
 */

package week2;

// impor scanner to program
import java.util.*;

public class Question1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// variable declaration
		long ln;
		
		// create a new scanner
		Scanner keyboard = new Scanner(System.in);
		
		// scan the number of loops output
		System.out.println("Input the number of repetition: ");
		int k = keyboard.nextInt();
		
		for (int i=0; i<k; i++) {
			try {
				// scan the output of the number you want to use
				System.out.println("\nInput the number: ");
				ln = keyboard.nextLong();
				
				// show results
				System.out.println(ln+" can be fitted in:");
                if(ln>=-128 && ln<=127)System.out.println("* byte");
                if(ln>=-32768 && ln<=32767)System.out.println("* short");
                if(ln>=-2147483648 && ln<= 2147483647)System.out.println("* int");
                if(ln>=-9223372036854775808L && ln<= 9223372036854775807L)System.out.println("* long");
			}
			// if greater than long
			catch(Exception moreThanLong)
	        {
	            System.out.println(keyboard.next() + " can't be fitted anywhere.");
	        }
		}
		
		

		
		
				

	}

}

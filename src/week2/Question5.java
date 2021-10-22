/**
 * Program to compare String A and B lexicographically 
 * and capitalize each first letter 
 * @author Ikram M B A (201511043)
 */

package week2;

//impor scanner to program
import java.util.*;

public class Question5 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		// create a new scanner
		Scanner keyboard = new Scanner(System.in);
		
		// scan String A and B from user's input
		String A = keyboard.nextLine();
		String B = keyboard.nextLine();
		
		// compare String A and B lexicographically
		System.out.println(A.length() + B.length());
		if( A.compareTo(B) > 0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
		// capitalize first letter of A and B
		String A1 = A.substring(0,1).toUpperCase() + A.substring(1);
		String B1 = B.substring(0,1).toUpperCase() + B.substring(1);
		
		// print the capitalized A and B
		System.out.print(A1 + " ");
		System.out.print(B1);
	}
		
}

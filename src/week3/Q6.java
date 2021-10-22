/**
 * Program big number
 * to show how to use BigInteger
 * @author Ikram M B A (201511043)
 */

package week3;

import java.util.Scanner;
import java.math.BigInteger;

public class Q6 {

	public static void main(String[] args) {
		// variable declaration
		String A, B;
		
		// create a new scanner
		Scanner keyboard = new Scanner(System.in);
        
		// scan the big number as string
        A = keyboard.nextLine();
        B = keyboard.nextLine();
        keyboard.close();
        
        // cast string to a big integer
        BigInteger bigA = new BigInteger(A);
        BigInteger bigB = new BigInteger(B);
        
        // print the output
        System.out.println(bigA.add(bigB));
        System.out.println(bigA.multiply(bigB));

	}

}

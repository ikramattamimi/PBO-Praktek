/**
 * Program buka tutup jalan
 * for traffic management
 * @author Ikram M B A (201511043)
 */

package week3;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {

		// variable declaration
		String plateNumber; 
		
		// create a new scanner
		Scanner keyboard = new Scanner(System.in);
        
		// input four plate number
        plateNumber = keyboard.next();
        keyboard.close();
        
        // delete the space
        plateNumber = plateNumber.replaceAll("\s+", "");
                
        // print the output
        // is there any mistakes? 
        // in the requirement, if the result = 0 it'll print the output "berhenti"
        // but in this program, if the result = 0 it'll print the output "jalan"
        System.out.println( ( (Long.parseLong(plateNumber) - 999999) % 5 == 0) ? "berhenti" : "jalan");
        
        // correct code for the requirement:
        // System.out.println( ( (Long.parseLong(plateNumber) - 999999) % 5 == 0) ? "jalan" : "berhenti");
	}

}

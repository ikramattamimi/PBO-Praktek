/**
 * Program input & output (2) 
 * @author Ikram M B A (201511043)
 */

package week3;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		
		// variable declaration
		String input;
		String[][] arrayWords = new String[3][2];
		
		// create a new scanner
		Scanner keyboard = new Scanner(System.in);
				
        // input words to array
		for(int i = 0; i < 3; i++) {
            input = keyboard.nextLine();
            arrayWords[i] = (input.split("\\s+"));
        }
		keyboard.close();
        
        // print the new formatted words
        System.out.println("================================");
        for(String[] newString : arrayWords) {
            System.out.println(String.format("%-15s", newString[0]).toLowerCase() + String.format("%3s", newString[1]).replace(" ", "0"));
        }
        System.out.println("================================");            
    

	}

}

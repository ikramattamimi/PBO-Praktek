/**
 * Program input & output
 * to change words to tokens
 * @author Ikram M B A (201511043)
 * Reference sources:
   https://www.wildantechnoart.net/2018/01/belajar-cara-menggunakan-string-regex-pada-java.html
 */

package week3;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		
		// variable declaration
		String input;
		
		// create a new scanner
		Scanner keyboard = new Scanner(System.in);
		
		// scan words from keyboard
        input = keyboard.nextLine();
        keyboard.close();
        
        // turn string into tokens
        String[] tokens = (input.split("\\s+|!|,|\\?|\\.|_|'|@"));
        
        // print tokens amount
        System.out.println(tokens.length);
                
        // *Notes:
        // tried this line to print the tokens on array
        // but got another words "[Ljava lang String; 71c7db30" 
        // still cant find how to fix it
        // System.out.println(tokens.toString().replaceAll("\\s+|!|,|\\?|\\.|_|'|@", "\n"));

        // so i use this line to print tokens
        System.out.println(input.replaceAll("\\s+|!|,|\\?|\\.|_|'|@", "\n"));
        
	}

}

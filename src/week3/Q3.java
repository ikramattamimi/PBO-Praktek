/**
 * Program berhitung
 * to calculate integer operation from string input
 * @author Ikram M B A (201511043)
 */

package week3;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		
		// variable declaration
		String[] arrayInput;
		
		// create a new scanner
		Scanner keyboard = new Scanner(System.in);
		
		// input number and operator to array
		arrayInput = (keyboard.nextLine().split("\\s+"));
		keyboard.close();
		
		// calculating the input
        if(Integer.parseInt(arrayInput[0]) >= 1 && Integer.parseInt(arrayInput[2]) <= 1000){
            switch (arrayInput[1]) {
                case "+":
                    System.out.println(Integer.parseInt(arrayInput[0]) + Integer.parseInt(arrayInput[2]));
                    break;
                case "-":
                    System.out.println(Integer.parseInt(arrayInput[0]) - Integer.parseInt(arrayInput[2]));
                    break;
                case "*":
                    System.out.println(Integer.parseInt(arrayInput[0]) * Integer.parseInt(arrayInput[2]));
                    break;                
                case "/":
                    System.out.println(Integer.parseInt(arrayInput[0]) / Integer.parseInt(arrayInput[2]));
                    break;
                case "%":
                    System.out.println(Integer.parseInt(arrayInput[0]) % Integer.parseInt(arrayInput[2]));
                    break;
            }
        } else {
            System.out.println("Unexpected input. The first number must be >= 1 and the second number must be <= 1000.");
        }

	}

}

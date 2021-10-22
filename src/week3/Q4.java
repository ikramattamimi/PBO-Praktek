/**
 * Program gaji agent
 * to calculate agent's salary
 * @author Ikram M B A (201511043)
 */

package week3;

import java.util.Scanner;

public class Q4 {
	
	public static void main(String[] args) {

		// variable declaration
        final int basicSalary = 500000, item = 50000;
        int selling;
        double finalSalary, formula, percent; 
        
		// create a new scanner
		Scanner keyboard = new Scanner(System.in);
        
		// scan the amount of sold items
        selling = keyboard.nextInt();
        keyboard.close();
        
        // calculate the percentation
        if (selling >=80)
        	percent = 0.35;
        else if (selling >=40 && selling <80)
            percent = 0.25;
        else if (selling >=15 && selling <40)
            percent = 0.1;
        else 
            percent = 0.15;    
        
        // calculate the final salary
        if (percent == 0.15) 
        	formula = -percent * item * (15-selling); 
        else
        	formula = percent * item * selling;
        
        finalSalary = basicSalary + formula;
        System.out.println(finalSalary);

	}

}

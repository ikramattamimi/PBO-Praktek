/**
 * Program to find different between final double
   and public static final double 
 * @author Ikram M B A (201511043)
 */

package week2;

public class Question2Constants {

	public static void main(String[] args) {
		final double CM_PER_INCH = 2.54;
		double paperWidth = 8.5;
		double paperHeight = 11;
		System.out.println("Paper size in centimeters: " + paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);

	}

}

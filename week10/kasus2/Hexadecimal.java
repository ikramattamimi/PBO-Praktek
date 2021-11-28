package kasus2;

import java.util.Scanner;

public class Hexadecimal {
	public static int parseHexInt(String hexaDecimal) {
	    try {
	        return Integer.parseInt(hexaDecimal, 16);
	    } catch (NumberFormatException e) {
	        return 0;
	    }
	}
	public static String inputHexaDecimal() {
		String hexaDecimal=null;
		try (Scanner keyboard = new Scanner(System.in)) {
				System.out.print("Bilangan Hexadecimal : ");
				hexaDecimal = keyboard.next();
		}
		catch (Exception e) {
			System.out.println("Format Salah");
		}
		
		return hexaDecimal;
	}
	
	public static void main(String[] args) {
		String hexaDecimal = inputHexaDecimal();
		int hasil= parseHexInt(hexaDecimal);
		System.out.println( "Bilangan Decimal dari " + hexaDecimal + " = " + hasil);
	}
}

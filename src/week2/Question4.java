/**
 * Program to cast double to byte
 * @author Ikram M B A (201511043)
 */

package week2;

public class Question4 {
	
	// methodOne definition
	// cast long to short
	static short methodOne(long l){
        int i = (int) l;
        return (short)i;
    }

    public static void main(String[] args){
        double d = 10.25;
        float f = (float) d;
        byte b = (byte) methodOne((long) f);
        System.out.println(b);
    }

}

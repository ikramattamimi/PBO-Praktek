/**
 * Program array
 * @author Ikram M B A (201511043)
 */

package week3;

public class Q7 {

	public static void main(String[] args) {
		
		//One Dimensional Arrays
        int[] fisrtArray = {2, 5, 3};
        int[] secondArray = {9, 5, 3};
        int[] thirdArray = {2, 4, 9};
        int[] fourthArray = {10, 11, 12};
        int[] fifthArray = {13, 14, 15};
        int[] sixthArray = {16, 17, 18};
        int[] seventhArray = {19, 20, 21};
        int[] eighthArray = {22, 23, 24};
        int[] ninthArray = {25, 26, 27};
        
        //Two Dimensional Arrays
        int[][] twoDimensionalArray1 = {fisrtArray, secondArray, thirdArray};
        int[][] twoDimensionalArray2 = {fourthArray, fifthArray, sixthArray};
        int[][] twoDimensionalArray3 = {seventhArray, eighthArray, ninthArray};

        //Three Dimensional Array
        int[][][] threeDimensionalArray = {twoDimensionalArray1, twoDimensionalArray2, twoDimensionalArray3};
        
        for(int[][] array3d : threeDimensionalArray){
        	System.out.print("{");
            	for(int[] array2d : array3d){
            		System.out.print("{");
            		for(int array : array2d){
            			System.out.print(array + " ");
            		}
            		System.out.print("} ");
            	}
            System.out.print("}");
            System.out.println();
        }

	}

}

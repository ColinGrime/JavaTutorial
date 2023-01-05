import java.util.Arrays;

/**************************************************************************************
 * Level 4 Topics:    					   		   		   		   		   		      *
 * - Arrays        	       (accessing, 0-indexed, length attribute, IndexOutOfBounds) *
 * - Iterating over arrays (printing, for loop, for each loop)				 		  *
 * - Common Array methods  (more can be found online)								  *
 *************************************************************************************/
public class Level4 {
	
	public static void main(String[] args) {
		/*****************************************************************
		 * Arrays: Holds a fixed number of values of a single data type. *
		 *****************************************************************/
		int[] arr1 = new int[10];
		int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		arr1[0] = 1; // Arrays are 0-indexed, so the 0th index is the 1st element.
		arr1[1] = 2;

		System.out.println("arr1 length: " + arr1.length); // Arrays have a length attribute that holds the size of the array.
		System.out.println("arr2 length: " + arr2.length);
		
	 // System.out.println(arr2[arr2.length]); // PROBLEM: You can only access indices 0 to (length - 1).
		System.out.println("Last element of arr2: " + arr2[arr2.length - 1]); // Last element in the array.

	 // arr[10] = 10; // PROBLEM: IndexOutOfBoundsException is thrown because there's only 10 elements, not 11.

		/***************************************************************
		 * Iterating over an array (printing, for loop, for each loop) *
		 ***************************************************************/
		System.out.println("\narr1: " + Arrays.toString(arr1));
		System.out.println("arr2: " + Arrays.toString(arr2));

		System.out.print("arr1: ");
		for (int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]);
			System.out.print(i == arr1.length - 1 ? '\n' : ", ");
		}

		System.out.print("arr2: ");
		for (int num : arr2) {
			System.out.print(num + ", ");
		}

		/***********************************************************************
		 * Common Array methods (look up "Java Arrays Javadocs" to learn more) *
		 ***********************************************************************/
		System.out.println("\n\nString representation of an array: " + Arrays.toString(arr1));

		int[] arr3 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		System.out.println("arr3 before: " + Arrays.toString(arr3));
		Arrays.sort(arr3); // Sorts the array.
		System.out.println("arr3 after: " + Arrays.toString(arr3));
	}
}

/*******************************************
 * Level 3 Topics:    					   *
 * - Loops        	(while, for, do-while) *
 * - Keywords 	  	(break, continue)      *
 * - Nested loops 	(+ example usage)      *
 * - Variable scope (+ examples)		   *
 *******************************************/
public class Level3 {

	public static void main(String[] args) {		
		/***********************************************************************************
		 * While loop: Repeatedly executes the block of code while the condition is true. *
		 ***********************************************************************************/
		System.out.print("While: ");

		int num = 0;
		while (num < 10) {
			System.out.print(num + (num == 9 ? "\n" : ", "));
			num++;
		}

		/*********************************************************************************
		 * For loop: Similar to while loop, except you can initialize/increment 		 *
		 *           variables on the same line in additional to evaluating a condition. *
		 *                                                                               *
		 * - Format: for (initialization; conditional; increment) {}                     *
		 *********************************************************************************/
		System.out.print("For: ");

		for (int i=10; i<20; i++) {
			System.out.print(i + (i == 19 ? "\n" : ", "));
		}

		/**********************************************************************
		 * Do-while loop: Identical to while loops, except the conditional    *
		 * 				  is checked after the code block is ran, not before. *
		 **********************************************************************/
		System.out.print("Do-while: ");

		num = 20;
		do {
			System.out.print(num + (num == 29 ? "\n" : ", "));
		} while (++num < 30);

		/*
		 * Clarity note:
		 * 
		 * All loops can be expressed in terms of one another.
		 * For/while loops are the most commonly used. For loops are often used when the number of iterations is known.
		 */

		/***********************************
		 * Loop keywords: break; continue; *
		 ***********************************/
		System.out.print("Using keywords: ");

		for (int i=0; i<20; i++) {
			if (i >= 4 && i <= 6) {
				continue; // Stop the current iteration -- Continue with the next iteration.
			} else if (i == 15) {
				break; // Break out of the entire loop.
			}

			System.out.print(i + (i == 14 ? "\n" : ", "));
		}

		/*****************************************************************************************
		 * Nested loops: A loop is called nested if it placed inside another loop.               *
		 *               For each iteration of the outer loop, the inner loop is completely run. *
		 *****************************************************************************************/
		System.out.print("Nested loops:\n");

		for (int i=0; i<10; i++) {
			for (int j=0; j<10; j++) {
				String coordinateDisplay = "(" + i + ", " + j + ")";
				System.out.print(coordinateDisplay + (j == 9 ? "\n" : ", "));
			}
		}

		/*********************************************************************************************
		 * Variable scope: The part of the program where the variable is accessible and can be used. *
		 *********************************************************************************************/
		// Example #1:
		do {
			int counter = 0;
	 // } while (counter); // PROBLEM: counter is outside of the code block it was created in, so it CANNOT be used here.
		} while (false);

		// Example #2:
		int testOne = 1;
		if (true) {
			int testTwo = 2;
			System.out.println("testOne is equal to " + testOne); // Since testOne is still inside of its declared code block, it can be used here.
			System.out.println("testTwo is equal to " + testTwo); // Since testTwo was made inside of this code block, it can be used here.
		}

		System.out.println("testOne is equal to " + testOne); // Since testOne was made inside of this code block, it can be used here.
		// PROBLEM: testTwo is outside of the code block it was created in, so it CANNOT be used here.
	}
}

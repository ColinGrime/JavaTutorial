import java.util.Scanner;
import java.util.Random;

/**********************************************************************************
 * Level 1 Topics:                                                 				  *
 * - Comments                   (single/multiline)                                *
 * - Variables                  (declaration vs. initialization)                  *
 * - Operators                  (assignment, arithmetic, unary)                   *
 * - Console I/O                (System.out.println() and Scanner class)          *
 * - Data types                 (primitives vs. references)                       *
 * - Casting                    (narrowing vs. widening)                          *
 * - Overflow                   (& how to avoid it)                               *
 * - Common Math/String methods (more can be found online)                        *
 * - Random class               (+ how to get a random number between two values) *
 **********************************************************************************/
public class Level1 {

	public static void main(String[] args) {
		/***************************************************************
		 * Comments: Statements that are not executed by the compiler. *
		 ***************************************************************/
		// Single line.
		/*
		 * Multiline.
		 */

		/*****************************************
		 * Variables: Containers that hold data. *
		 *****************************************/
		int num1; // Declaration: Process of defining a variable's type + name.
		num1 = 2; // Initialization: Process of assigning a value to a variable.
		
		// Declaration + Initialization (on the same line)
		int num2 = 80_000_000;

		/**********************************
		 * Operators:					  *
		 * - Assignment (=, +=, -=, etc.) *
		 * - Arithmetic (+, -, *, /, %)   *
		 * - Unary      (+, -, ++, --, !) *
		 **********************************/
		int num3 = 1 + 1; // 1 + 1 = 2
		num3 -= 2;        // 2 - 2 = 0
		num3++;           // 0 + 1 = 1
		num3 = -num3;     // -1
		num3 *= -1;       // -1 * -1 = 1

		int num4 = 8 / 4; // 8 / 4 = 2
		num4 += 7;        // 2 + 7 = 9
		num4 = num4 % 4;  // 9 % 4 = remainder of (9 / 4) = 1

		/**************************************************
		 * Console output: Writing output to the console. *
		 **************************************************/
		System.out.println(num3);
		System.out.println(num4);
		System.out.println("Hello World");
		System.out.println(5 + 5);
		System.out.println();

		/*******************************************************************************************
		 * Data type: Specifies the type of data.                                                  *
		 * - Primitive types: The basic data types that are predefined by Java (they are keywords) *
		 * - Reference types: Contains the address (or reference) of dynamically created objects.  *
		 ******************************************************************************************/
		// Common primitives:
		int wholeNumber = 8;			  // Holds whole numbers.
		double decimal = 5.5;             // Holds floating point numbers.
		long bigNumber = 10_000_000_000L; // Holds large numbers.
		boolean conditional = true;       // Holds either "true" or "false".
		char character = 'H';             // Holds single characters.

		// Common reference types:
		String word = "Hello World";      // Holds sequences of characters.
		int[] arr = {1, 2, 3};            // Holds a fixed number of values of a single data type (in this case, integers).

		// Other primitives:
		short smallNumber = 10_000;
		byte evenSmallerNumber = 100;
		float inaccurateDecimal = 5.5f;

		/*********************************************************************************
		 * Casting: Converting data from one data type to another.                       *
		 * - Narrowing conversion: When you convert a larger data type to a smaller one. *
		 * - Widening conversion: When you convert a smaller data type to a larger one.  *
		 *********************************************************************************/
		int doubleToInt = (int) 8.8; // Narrowing casting is explicit (programmer must deal with it).
		double intToDouble = doubleToInt; // Widening casting is implicit (the cast is done automatically).

		/*
		 * Clarity note:
		 * 
		 * Narrowing conversion is when you convert a larger data type to a smaller one.
		 * Because the smaller data type cannot carry all of the data of the larger one,
		 * it results in a loss of data (this is why it must be explicitly casted).
		 * 
		 * Widening conversion is when you convert a smaller data type to a larger one.
		 * Since the larger data type can always carry all of the data of the smaller one,
		 * no data is lost (because of this, the cast can be done automatically).
		 */

		/********************************************************************************************
		 * Overflow: Occurs when we assign a value to a variable outside of its declared data type. *
		 ********************************************************************************************/
		int number = Integer.MAX_VALUE; // 2_147_483_647
		System.out.println(number);
		System.out.println(number + 1); // OVERFLOW!

		// To fix overflow, go to the next largest data type:
		long large = Integer.MAX_VALUE;
		System.out.println(large);
		System.out.println(large + 1);
		System.out.println();

		// Important note:
		long largeAgain = Integer.MAX_VALUE + 1; // Adding two integers -- OVERFLOW!
		long largeAgainFixed = (long) Integer.MAX_VALUE + 1; // Adding one long + one int -- acceptable.

		/*
		 * Clarity note:
		 * 
		 * When you add two integers, the result is always going to be an integer.
		 * When you add data of two different types, the result is always going to be the larger data type.
		 * 
		 * Example: (3 / 2) = (1)
		 * 
		 * In the example above, both numbers are integers, so the result must be an integer.
		 * If you wanted the answer "1.5" above, you must convert one of the integers to a floating point number.
		 * 
		 * Possibility #1: (3.0 / 2) = (1.5)
		 * Possibility #2: ((double) 3 / 2) = (1.5)
		 */

		/***********************************************
		 * Console input: Read input from the console. *
		 ***********************************************/
		Scanner input = new Scanner(System.in);

		System.out.print("Type something: ");
		input.next();

		/*
		 * PROBLEM: Everything except nextLine() leaves the newline ('\n') character from hitting enter.
		 */
		System.out.print("Type your age: ");
		input.nextInt();

		System.out.print("Type your name: ");
		input.nextLine(); // Reads in the newline ('\n') character and ignores all other input.

		/*
		 * SOLUTION: To fix this, you can read in another line to remove the newline ('\n') character.
		 */
		System.out.print("Type your age: ");
		int age = input.nextInt(); // Reads in an integer and leaves a newline ('\n') character.
		input.nextLine(); // Reads in the newline ('\n') character.

		System.out.print("Type your name: ");
		String name = input.nextLine(); // Reads in the input you want.

		System.out.println(name + " is " + age + " years old!\n");

		/********************************************************************
		 * Common Math methods (look up "Java Math Javadocs" to learn more) *
		 ********************************************************************/
		System.out.println("Round 5.3: "          + Math.round(5.3));
		System.out.println("Round 5.5: "          + Math.round(5.5));
		System.out.println("Ceil 1.1: "           + Math.ceil(1.1));
		System.out.println("Floor 1.9: "          + Math.floor(1.9));
		System.out.println("Absolute value -10: " + Math.abs(-10));
		System.out.println("2^4: "                + Math.pow(2, 4));
		System.out.println("√9: "                 + Math.sqrt(9));
		System.out.println("max(3, 8): "          + Math.max(3, 8));
		System.out.println("min(3, 8): "          + Math.min(3, 8));
		System.out.println();

		/************************************************************************
		 * Common String methods (look up "Java String Javadocs" to learn more) *
		 ************************************************************************/
		String example = "Hello World";
		System.out.println("Lowercase: "                             + example.toLowerCase());
		System.out.println("Uppercase: "                             + example.toUpperCase());
		System.out.println("Length: "                                + example.length());
		System.out.println("Character at position 0: "               + example.charAt(0));
		System.out.println("Index of the first occurrence of 'l': "  + example.indexOf('l'));
		System.out.println("Characters between positions 6 and 10: " + example.substring(6, 11));
		System.out.println("Replace \"Hello\" with \"Bye\": "        + example.replace("Hello", "Bye"));
		System.out.println("Contains \"World\"?: "                   + example.contains("World"));
		System.out.println();

		/********************************************
		 * Random class: Generating random numbers. *
		 ********************************************/
		Random rand = new Random();
		System.out.println("Random number between 0 and 9: " + rand.nextInt(10));
		System.out.println("Random number between 5 and 15: " + (rand.nextInt((15 - 5) + 1) + 5));
	}
}
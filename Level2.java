/***************************************************************
 * Level 2 Topics:    										   *
 * - If statements     (if...else-if...else ladder)			   *
 * - Operators         (relational, logical)				   *
 * - Short circuiting  (concept)							   *
 * - == vs. equals()   (equality of primitives vs. references) *
 * - Tenary operators  (single line if statements)			   *
 * - Switch statements (+ break keyword)					   *
 ***************************************************************/
public class Level2 {

	public static void main(String[] args) {
		/***************************************************************************************
		 * If statements: Allow you to run a block of code if the condition evaluates to true. *
		 ***************************************************************************************/
		int age = 10;
		if (age < 18) { // Read like: "If age is less than 18, run the code block below."
			System.out.println("You need to be 18 to enter.");
		} else { // Read like: "Else (if age is not less than 18), run the code block below."
			System.out.println("You can enter!");
		}

		/*
		 * Clarity note:
		 * 
		 * The "if...else-if...else" ladder is used to decide which block of code will run based off multiple options.
		 * These ladders begin with "if", can contain zero or more "else if" statements, and can optionally end with an "else" statement.
		 * 
		 * These statements are evaulated from top to bottom.
		 * Once one of them evaluates to true, that statement's block of code is ran -- and the ladder stops evaulating statements.
		 * If none of them evaluate to true, the "else" statement's block of code is ran if one exists.
		 */

		/************************************************************************************************************************
		 * Operators:					  		  		  		  		  		  		  		  		  		  		  	    *
		 * - Relational: Used to check the relationship between two operands (==, !=, >=, >, <=, <). 		  		  		    *
		 * - Logical: Returns a Boolean (T/F) result based on the Boolean result of 1 expression (!) or 2 expressions (&&, ||). *
		 ************************************************************************************************************************/
		if (age >= 16 && age <= 18) { // Read like: "If age is greater than or equal to 16 AND age is less than or equal to 18..."
			System.out.println("Between 16 and 18.");
		} else if (age <= 10 || age > 100) { // Read like: "Else if age is less than or equal to 10 OR age is greater than 100..."
			System.out.println("<=10 or >100");
		} else if (!(age > 50 && age < 60)) { // Here, the not operator (!) inverts the expression within the parentheses.
			System.out.println("You are not 50.");
		}

		/*********************************************************************************
		 * Short circuiting: Occurs when the first expression decides the final outcome. *
		 *********************************************************************************/
		if (false && true) { // FALSE && TRUE -> Since first expression is FALSE, the condition cannot be TRUE (AND = both of them TRUE).
			System.out.println("Short circuiting has occurred (1).");
		}

		if (true || false) { // TRUE || FALSE -> Since first expression is TRUE, the condition is already TRUE (OR = one of them TRUE).
			System.out.println("Short circuiting has occurred (2).\n");
		}

		/**********************************************************************************
		 * == vs. equals() for Strings (will circle back once Objects are introduced)     *
		 *                                                                                *
		 * == is used to check if both variables point to the same address in memory.     *
		 * equals() checks for functional equality, that is, the value inside the String. *
		 **********************************************************************************/
		String word1 = "hello";
		String word2 = word1;
		if (word1 == word2) {
			System.out.println("Both strings refer to the same memory address.");
		}

		String word3 = new String(word1);
		if (word1 != word3) {
			System.out.println("While these strings are functionally equivalent, they refer to different memory locations.");
		}
		if (word1.equals(word3)) {
			System.out.println("As a result, you must use the .equals() method instead.\n");
		}

		/*****************************************************************************************
		 * Ternary operators: Condensed form of the if-else statement that also returns a value. *
		 *****************************************************************************************/
		String name = "Bob";
		age = name.equals("Bob") ? 18 : -1;

		/***********************************************************************
		 * Switch statements: Multi-way branch statements where a variable     *
		 * 					  is tested for equality against a list of values. *
		 ***********************************************************************/
		int value = 10;
		switch (value) {
			case 1:
				System.out.println("Value is 1.");
				break; // Breaks out of the switch statement (prevents below code blocks from running).
			case 2:
				System.out.println("Value is 2.");
				break;
			case 3:
				System.out.println("Value is 3.");
				break;
			case 4:
			case 5:
			case 6:
			case 7: // Without the break keyword, if any of the case statements evaluate to true, all code below it will run.
			case 8:
			case 9:
			case 10:
				System.out.println("Value is 4, 5, 6, 7, 8, 9, or 10.");
				break;
			case 11, 12, 13, 14, 15: // Multiple cases can run the same code.
				System.out.println("Value is 11, 12, 13, 14, or 15.");
				break;
			default: // Identical to the else statement -- this will run if no other case statements evaulate to true.
				System.out.println("Value does not exist.");
		}
	}
}

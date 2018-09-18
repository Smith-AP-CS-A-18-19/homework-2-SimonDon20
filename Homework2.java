// SimonDon20
/*
 * Donovan Simonton
 */

import java.awt.Rectangle;

public class Homework2 {

	/* Write the constructor for Homework2.
	 * It takes in one parameter: a String
	 * Save the string as a private instance variable
	 */
	 private String input_String;
	 	public Homework2(String input) {
			input_String = input;
		}

	/* Write the method uppercase
	 * It does not take in any parameters
	 * It returns a String
	 * Use String methods to turn the instance variable String into all
	 * uppercase letters and return the result
	 * Hint: Search the String class for 'uppercase'
	 */
	 public String uppercase(){
		 input_String = input_String.toUpperCase();
		 return input_String;
	 }

	/* Write the method strip
	 * It takes in one paramter: a String
	 * It returns a String
	 * Use String methods to remove punctuation from the parameter String
	 * It should remove spaces, commas, periods, and exclamation points.
	 * Hint: Search the String class for 'replace'
	 */
	 public String strip(String input_String){
		 input_String = input_String.replace(" ", "");
		 input_String = input_String.replace(",", "");
		 input_String = input_String.replace(".", "");
		 input_String = input_String.replace("!", "");
		 return input_String;
	 }

	/* Fix the errors in the method problem4
	 */
	public Rectangle problems() {
		Rectangle r1 = new Rectangle(5, 10, 15, 20);
		double width = r1.getWidth();
		Rectangle r2 = new Rectangle(0, 0, 1, 1);
		r2.translate(15, 25);
		Rectangle r3 = new Rectangle(0, 0, 1, 1);
		r3.translate(3000, 5000);
		return r3;
	}


	/* Use Rectangle methods to calculate and return the perimeter of the
	 * parameter Rectangle
	 */
	public double getPerimeter(Rectangle rect) {
		double width = rect.getWidth();
		double height = rect.getHeight();
		double perimeter = (2 * width) + (2 * height);
		return perimeter;

	}

}

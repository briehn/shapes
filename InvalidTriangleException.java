package Shapes;

import java.lang.Exception;

public class InvalidTriangleException extends Exception {
	/**
	 * Sets up the exception object with a particular message.
	 * @param message A string literal specifying the exception
	 */
	 public InvalidTriangleException(String message) {
	 	super(message);
	 }
	 
	 public static void main(String[] args){
			InvalidTriangleException tr = new InvalidTriangleException("You cannot make a triangle with the given sides.");
			tr.printStackTrace();
		}

}
/**
 * 
 * @author Tanya Kalianda
 * Rectangle Test
 */
import java.awt.Rectangle;

public class RectangleTest 
{

	public static void main(String[] args)
	{
		//look in Rectangle API under constructors to find what Rectangle(5,10,20,30) does
		Rectangle box = new Rectangle(5, 10, 20, 30);
		//this creates a Rectangle object with numbers that describe the rectangle
		//the upper-left corner of the rectangle is specified as (5,10), so x=5 and y=10
		//the width of this rectangle is 20, and the height is 30
		//the constructor is Rectangle(int x, int y, int width, int height)
		
		//TODO Move the rectangle (use a method from the API to move the rectangle
		//                          by changing both the x and y coordinates)
		
		//The translate method translates the Rectangle along the X and Y coordinate axis
		//translate(int dx, int dy)
		box.translate(3, 8);
		
		//TODO Print the following information in the following format
		/*
		 * Expected new x value: ... (print what you expect the x value to be)
		 * Actual x value: ...  (use a method from the API to print the actual x value)
		 * Expected new y value: ... (print what you expect the new y value to be)
		 * Actual y value: ...  (use a method from the API to print the actual y value)
		 */

		System.out.println("Expected new x value: 8");
		System.out.println("Actual x value: " + box.getX());
		
		System.out.println("Expected new y value: 18");
		System.out.println("Actual x value " + box.getY());
		
		
	}

}

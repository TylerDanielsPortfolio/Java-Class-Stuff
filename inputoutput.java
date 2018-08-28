/*Filename: inputoutput.java
 * Name: Michelle Levine
 * Date: May 17, 2017
 * Description: This program demonstrates some simple console input and output.
 */

//import statements - tell the compiler which classes in Java are needed for this program
import java.util.Scanner; //needed for the Scanner class for console input

public class inputoutput {

	public static void main(String[] args) {
		//declare and initialize variables
		String name, favoriteColor;
		
		int age = 0;
		
		//declare a Scanner object - ONLY one is needed per program
		Scanner userInput = new Scanner(System.in); 
		
		//display an intro to the user
		System.out.println("WELCOME TO MY JAVA PROGRAM!!\n\n");
		
		//prompt the user for name
		System.out.print("Enter your name: ");
		name = userInput.nextLine();
		
		//prompt for age
		System.out.print("Enter your age: ");
		age = userInput.nextInt();
		
		//prompt for favorite color
		System.out.print("Enter your favorite color: ");
		favoriteColor = userInput.next();
		
		
		
	}

}

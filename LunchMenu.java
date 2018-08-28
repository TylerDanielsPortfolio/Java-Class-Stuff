/*LunchMenu.java
 * Tyler Daniels
 * May 31, 2017
 * 
 * This programm demonstrates prompts to the user to calculate the total cost of their lunch
 * with tax included
 * 
 */



gibber
package lunchMenu;
import java.util.Scanner; //
import java.text.DecimalFormat;
import java.text.NumberFormat;
public class LunchMenu {

	public static void main(String[] args) {
		//Declare Variables and Constants
		
		double endTax;
		double costOfSandwich = 0.00;
		double costOfChips = 0.00;
		double costOfDrink = 0.00;
		double totalCost = 0.00;
		final double tax = 0.07;
		Scanner userInput = new Scanner (System.in);
		String sandwich;
		
		//Intro to User
		System.out.println("Welcome to Broward Bistro!");
		
		//Prompt User for choice of Sandwich
		System.out.print("Please Enter Your choice of Sandwhich:  ");
		  sandwich = userInput.nextLine();
		
		//Prompt user for costOfSandwhich
		System.out.print("Please Enter Cost of Sandwich:\t\t");
		costOfSandwich = userInput.nextDouble();
		
		//Prompt user for costOfChips
		System.out.print("Please Enter cost of Chips:\t\t");
		costOfChips = userInput.nextDouble();
		
		//Prompt user for costOfDrink
		System.out.print("Please Enter Cost of Drink: \t\t");
		costOfDrink = userInput.nextDouble();
		
		
		//Calculate total cost
	 
		totalCost = costOfSandwich + costOfChips + costOfDrink;
		endTax = totalCost * tax;
	
		
		System.out.println("*************");
			
		
		//Display Results
		//Create a Decimal Format objeckt
		DecimalFormat moneyFormat = new
				DecimalFormat("###.00");
		
		System.out.println("Total Cost of SandWich:\t\t$" + moneyFormat.format (costOfSandwich));
		System.out.println("Total Cost Of Chips:\t\t$" + moneyFormat.format(costOfChips));
		System.out.println("Total Cost Of Drink:\t\t$" + moneyFormat.format(costOfDrink));
		System.out.println("Total Tax:\t\t$"+ moneyFormat.format(endTax));
		System.out.println("Total Cost:\t\t$" + moneyFormat.format(totalCost));
	}

}

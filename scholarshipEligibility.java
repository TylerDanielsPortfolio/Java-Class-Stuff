/* Tyler Daniels
 * May 30, 2017
 * 
 * This program is designed to calculate eligibility for a scholarship.
 */


package scholarshipEligibility;
 import javax.swing.JOptionPane;
 import java.util.Scanner;
public class scholarshipEligibility {

	public static void main(String[] args) {
		//Declare and initialize variables and constats
		
		double gpa = 0.0;
		boolean isCurrent = true;
		int fallCredits = 0, springCredits = 0 , numComputerCourses = 0, currentMenuChoice = 0;
		boolean isEligible = true;
		Scanner userInput = new Scanner (System.in); 
		
	//currentMenuChoice = 1; 
		
		
	//Intro to Students
		//Display menu for Current status
	currentMenuChoice = Integer.parseInt(JOptionPane.showInputDialog(null,"Choose current stauts \n1.Current Student\n2.Non-current student"));
		
		
		if(currentMenuChoice == 1)
		isCurrent = true;
		
		else
			isCurrent = false;
		
		
		//Prompt for gpa
gpa = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter your Gpa:  "));
		
		//Prompt for fallCredits
fallCredits = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Number of Fall Credits:   "));
		
		//Prompt for springCredits
springCredits = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Number of Spring Credits:  "));
		
		//Prompt for numComputerCourses
numComputerCourses = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Number of Computer Courses:  "));
		
		
		//Selection Struction to determine isEligible
	if(isCurrent && fallCredits >= 9 && springCredits >= 9 && gpa >= 2.5 && numComputerCourses >= 3)
	{
	isEligible = true;
	}
	else
	{
	isEligible = false;
	}		

	
		//Display Eligibility
	if(isEligible)
	{
		JOptionPane.showMessageDialog(null,"Congrats!!! You are Eligbible!!");
	}	
		
	else
		
		//Display you are not Eligibe
	{JOptionPane.showMessageDialog(null,"You are not eligible");
	}
	
	}

}

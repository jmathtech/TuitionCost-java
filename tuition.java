package tuitionCost;

import java.util.*;

public class tuition {
	
	// Declarations		
	double tuitionInitial;
	double tuitionCurrentYear;
	double tuitionNextYear;
	int counter;
	
	// Main Function
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double tuitionInitial = 12000;
		double tuitionCurrentYear = tuitionInitial;
		int counter = 0;
		
		// Title of the program
		System.out.println("========= Cost of Tuition in 5 Years =========");
		System.out.println("");
		
		// For loop to calculate and output the counter & annual tuition cost for the current year to next year. 
		for(counter = 1; counter < 6; counter++) {
			
			System.out.println("Year: " + counter + " | The tuition cost will be: " + tuitionCurrentYear);
			
			double tuitionNextYear = tuitionCurrentYear*1.05;
			
			tuitionCurrentYear = tuitionNextYear;
			
		}
		
		// Message at the end of the program
		System.out.println("");
		System.out.println("Thank you for using this program... ");
		System.out.println("© Jamil Matheny");
		
	}

}

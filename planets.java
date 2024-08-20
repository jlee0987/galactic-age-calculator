package project1;
/*
Description: This program calculates a user's age on several planets.
 */

	import java.util.*;

import javax.swing.JOptionPane;

	public class planets {
		
		//create a console area so that the user can type the input in
		static Scanner console = new Scanner(System.in);
		
		public static void main(String[] args) {
			
		final double noDays = 365; //number of days in a year on Earth not changed
		final double noDaysMercury = 88; //number of Earth days that Mercury takes to travel around the sun not changed
		final double noDaysVenus = 225; //number of Earth days that Venus takes to travel around the sun not changed
		final double noDaysJupiter = 4380; //number of Earth days that Jupiter takes to travel around the sun not changed
		final double noDaysSaturn = 10767; //number of Earth days that Saturn takes to travel around the sun not changed

		//output variables
		double mercuryAge; //output variable to store the user's age on Mercury
		double venusAge; //output variable to store the user's age on Venus
		double jupiterAge; //output variable to store the user's age on Jupiter
		double saturnAge; //output variable to store the user's age on Saturn
		String myName; 
		
	//ask the user for input
	String myName = JOptionPane.showInputDialog("Enter Your Full Name: ");
	String myAge = JOptionPane.showInputDialog("Enter your Age: ");
	
	//convert/parse the user input from string to integer 
	int age = Integer.parseInt(myAge);
	
	//do the calculations
		mercuryAge = (age * noDays)/(noDaysMercury);
		venusAge = (age * noDays)/(noDaysVenus);
		jupiterAge = (age * noDays)/(noDaysJupiter);
		saturnAge = (age * noDays)/(noDaysSaturn);
	
	//format using the String.format method
		String fMercuryAge= String.format("%.2f",mercuryAge);
		String fVenusAge= String.format("%.2f", venusAge);
		String fJupiterAge= String.format("%.2f",jupiterAge);
		String fSaturnAge= String.format("%.2f",saturnAge);
		
	//store the output in a string	 
	String outputStr = "My name is + myName + I am " + myAge + "years old on earth but I would be" + fMercuryAge + "\n" +
	" years old on Mercury," + fVenusAge + " years old on Venus and" + "\n" +
	fJupiterAge + " years old on Jupiter, and" +fSaturnAge + " years old on Saturn.";
									          
	//output the result
	JOptionPane.showMessageDialog(null, outputStr,"My Age on Other Planets", JOptionPane.INFORMATION_MESSAGE); 
	System.exit(0);
									      
		}//end main

	} //end of class

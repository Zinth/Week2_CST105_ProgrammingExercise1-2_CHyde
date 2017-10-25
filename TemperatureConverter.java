import java.util.Scanner;

/** Program: Temperature Converter
* File: TemperatureConverter.java
* Summary: Ask user to enter a temperature in Fahrenheit and convert it to Celsius. Than ask the user
*          to enter a temperature in Celsius and convert it to Fahrenheit. Display both result to user. 
* Author: Chris Hyde
* Date: October 25, 2017 
**/
public class TemperatureConverter {

	public static void main(String[] args) {
		// Import the scanner class for user input.
		Scanner input = new Scanner(System.in);
		
		//Variables
		double fahrenheit, celsius;
		
		//Output a request for user to enter temperature Fahrenheit.
		System.out.println("Please enter a Fahrenheit Temperature:");
		
		//Set Temperature variable to that of the user input. 
		fahrenheit = input.nextDouble();
		
		//Convert fahrenheit to celsius.
		celsius = (fahrenheit - 32) * 5/9;
		
		//Output the temperature converted to celsius to user.
		System.out.println(fahrenheit + "F is equivalent to " + celsius + "C");
		
		//Output a request for the user to enter temperature celsius.
		System.out.println("Please enter a Celsius Temperature:");
		
		//Set celsius variable to that of the user input.
		celsius = input.nextDouble();
		
		//Convert celsius to fahrenheit.
		fahrenheit = celsius * 9/5 + 32;
		
		//Output the temperature converted to fahrenheit to user.
		System.out.println(celsius + "C is equivalent to " + fahrenheit + "F");
		
	}

}

package co.grandcircus.lab_04;

import java.util.Scanner;

// Task: Lab 04 - Pair program and display a table of powers.

public class TableOfPowers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String yeaNay;
		double squareNum = 0.0;
		double cubeNum = 0.0;
		
		// do runs the the sysout's at least once before the loop starts.
		do {
		
		System.out.println("Enter a whole number that is greater than 1 and less than 1,000. :");
		int userInt = input.nextInt();
		
		System.out.println("Number\t\tSquared\t\tCubed");
		System.out.println("======\t\t======\t\t======");
		
		for (int i = 1; i <= userInt; i++)  {

			squareNum = (userInt * userInt);
			cubeNum = Math.pow(userInt, 3);
		
		System.out.println(i + "\t\t" + (i * i) + "\t\t" + Math.pow(i, 3));
		System.out.print("");
		
		}
		
		System.out.println("");
		System.out.print("Do you want to continue (y/n)? ");
		yeaNay = input.next();
		
		} while (yeaNay.equals("y"));	
			
		System.out.println("Goodbye.");
		
		input.close();
	}

}

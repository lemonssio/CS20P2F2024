package mastery;

import java.util.Scanner;

public class masterydigits {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.print ("Please enter your three digit number: ");
		int user = userInput.nextInt();
		int hund = user /100;
		System.out.println("your hundreds place is " + hund );
		int tens = ((hund * 100 ) - user) / 10;
		System.out.println("your tens place is: " + Math.abs(tens));
		System.out.println("your ones place is:" + (Math.abs(((hund * 100) + (Math.abs(tens) * 10)) - user)));

	
}}

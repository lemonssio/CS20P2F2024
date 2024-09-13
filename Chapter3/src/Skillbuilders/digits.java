package Skillbuilders;

import java.util.*;

public class digits {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.print ("Please enter your two digit number: ");
		int user = userInput.nextInt();
		  	int tens = user / 10;
		System.out.println( "your tens place is: "+ tens);
			int ones = user - tens * 10;
		System.out.println( "your ones place is: "+ ones);

		
		

		
	}

}

package Skillbuilders;

import java.util.Scanner;

public class gradeaverage1n2 {

	public static void main(String[] args) {
	Scanner userinput = new Scanner(System.in);
		//
	System.out.println("hello please enter your five grades and i'll give you the average!!");
	
	System.out.print("please enter your first grade: ");
	int grade1 = userinput.nextInt();
	System.out.print("please enter your second grade: ");
	int grade2 = userinput.nextInt();
	System.out.print("please enter your third grade: ");
	int grade3 = userinput.nextInt();
	System.out.print("please enter your fourth grade: ");
	int grade4 = userinput.nextInt();
	System.out.print("please enter your fifth grade: ");
	int grade5 = userinput.nextInt();
	
	int wholegrade = ((grade1 + grade2 + grade3 + grade4 + grade5) / 5 );

	System.out.print("your average grade is %" + wholegrade);
	
	
	
	}

}

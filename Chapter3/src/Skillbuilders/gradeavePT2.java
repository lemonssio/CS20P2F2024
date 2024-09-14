package Skillbuilders;

import java.util.Scanner;

public class gradeavePT2 {

	public static void main(String[] args) {
	Scanner userinput = new Scanner(System.in);
		//
	System.out.println("hello please enter your five grades and i'll give you the average!!");
	System.out.print("please enter your first grade: ");
	int grade1 = userinput.nextInt();
	System.out.print("please enter your second grade: ");
	int grade2 = userinput.nextInt(); 
	int grade1n2 = (grade1 += grade2);
	System.out.print("please enter your third grade: ");
	int grade3 = userinput.nextInt();
	System.out.print("please enter your fourth grade: ");
	int grade4 = userinput.nextInt();
	int grade3n4 = (grade3 += grade4);
	System.out.print("please enter your fifth grade: ");
	int grade5 = userinput.nextInt();
	System.out.println("Your average is: %" + (grade5 + grade3n4 + grade1n2) / 5 );
}}

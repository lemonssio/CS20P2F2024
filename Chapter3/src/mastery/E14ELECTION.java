package mastery;

import java.util.Scanner;

public class E14ELECTION {
	
	
	public static void main(String[] args) {
	Scanner userInput = new Scanner(System.in);
		
	System.out.println("Election results for New York:");
	System.out.print("Candiate Awbrey:");
	int NYCawb = userInput.nextInt();
	System.out.print("Candiate Martinez:");
	int NYCmart = userInput.nextInt();
	
	
	
	System.out.println("Election results for New Jersey:");
	System.out.print("Candiate Awbrey:");
	int NJawb = userInput.nextInt();
	System.out.print("Candiate Martinez:");
	int NJmart = userInput.nextInt();
	
	
	
	
	System.out.println("Election results for Connecticut:");
	System.out.print("Candiate Awbrey:");
	int Cawb = userInput.nextInt();
	System.out.print("Candiate Martinez:");
	int Cmart = userInput.nextInt();
	
	double MartAll = Cmart + NJmart + NYCmart;
	double AwbAll = NYCawb + NJawb + Cawb;
	double together =  MartAll + AwbAll;
	
	
	
	System.out.println("Candiates:");
	System.out.println("Awbrey:");
	System.out.println("  Votes:" + AwbAll);
	System.out.println("  Percentage:" + ( AwbAll /together) * 100);
	
	System.out.println("Martinez:");
	System.out.println("  Votes:" + MartAll);
	System.out.println("  Percentage:" + (MartAll/together) * 100);
	System.out.println("Total Votes:" + together);
	
	
}}

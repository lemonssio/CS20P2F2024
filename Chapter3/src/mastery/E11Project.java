package mastery;

import java.util.Scanner;

public class E11Project {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("This program will tell you how much time you spent on coding on a Java assignment as a percentage!");
		System.out.print("How much time did you spend Designing (minutes)? ");
		Double design = userInput.nextDouble();
		System.out.print("How much time did you spend coding (minutes)? ");
		Double code = userInput.nextDouble();
		Double designcode = design += code;
		System.out.print("How much time did you spend debugging (minutes)? ");
		Double debug = userInput.nextDouble();
		System.out.print("How much time did you spend testing (minutes)? ");
		Double test = userInput.nextDouble();
		Double debugtest = design += code;
		
		Double together = designcode + debugtest;
		
		System.out.print("Designing " + (design / together) * 100);
		System.out.print("Coding " + (code / together) * 100);
		System.out.print("Debugging " + (debug / together) * 100);
		System.out.print("Testing " + (test / together) * 100);
		
}}
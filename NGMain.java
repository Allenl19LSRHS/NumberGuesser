/* Lucas Allen Number Guesser Exercise
 * I created:
 *  -random guesser with error checking
 *  -binary guesser with error checking
 *  -running loop so you can play again
 *  -the ability to select which type of guesser per game
*/ 

import java.util.Scanner;

public class NGMain {

	public static void main(String[] args) {
		boolean run = true;
		
		Scanner myScanner = new Scanner(System.in);
		
		while (run) {
			System.out.println("Welcome to Number Guesser! Think of a number from 1 to 100");
			System.out.println("Enter + if I need to guess higher, - if I need to guess lower, or = if I guessed your number");
			System.out.println("");
			String answer = "";
			
			//options are NGSimpleGuesser, NGRandomGuesser, and NGGuesserBinary
			
			String mode = "";
			NGGuesser guesser;
			System.out.println("Which mode of guessing do you want, simple, random, or binary? (sim, ran, or bin?)");
			mode = myScanner.next();
			if (mode.equals("sim")) {
				System.out.println("Simple Guesser");
				guesser = new NGSimpleGuesser();
			} else if (mode.equals("ran")) {
				System.out.println("Random Guesser");
				guesser = new NGRandomGuesser();
			} else {
				System.out.println("Binary Guesser");
				guesser = new NGGuesserBinary();
			}
			
			do {
				int guess = guesser.nextGuess(answer);
				if (guess == -1) {
					System.out.println("This is the only possibility given the answers you returned!");
					break;
				} else {
					System.out.println("My guess is " + guess);
					answer = myScanner.next();
				}	
				
			} while (! answer.equals("="));
			System.out.println("I guessed it!");
			
			System.out.println("Do you want to play again? (Y/N)");
			String replay = myScanner.next();
			
			if (replay.equals("N") || replay.equals("n")) {
				run = false;
			} else {
				replay = null;
			}
		}
		
		myScanner.close();
	}

}

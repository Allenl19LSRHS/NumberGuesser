
public class NGGuesserBinary extends NGGuesser {

	int guess = 50;
	int prevGuess = 51;
	int highestGuess = 101;
	int lowestGuess = 1;
	
	public int nextGuess(String answer) {
		if (answer.equals("-")) {
			highestGuess = guess;
			guess = (highestGuess+lowestGuess)/2;
		} else if (answer.equals("+")) {
			lowestGuess = guess;
			guess = (highestGuess+lowestGuess)/2;
		} else {
			return guess;
		}
		
		if (guess == prevGuess) {
			return (-1);
		} else {
			prevGuess = guess;
			return guess;
		}
	}
}
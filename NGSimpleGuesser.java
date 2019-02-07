
public class NGSimpleGuesser extends NGGuesser {

	int lastGuess = 50;
	
	public int nextGuess(String answer) {
		if (answer.equals("-")) {
			lastGuess -= 1;
			return lastGuess;
		} else if (answer.equals("+")) {
			lastGuess += 1;
			return lastGuess;
		} else {
			return lastGuess;
		}
	}
	
}

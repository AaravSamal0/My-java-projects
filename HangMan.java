package HangMan;

import java.util.Scanner;

/**
 * @author Aarav Samal
 */
public class HangMan {

	
	static Scanner scan = new Scanner(System.in);
	static String phrase;
	static String[] words = {"car", "symphony", "computer", "elephant", "happy", 
							 "sand", "eleven", "time", "hard" , "impatient", 
							 "control", "salted", "temporary", "information", "read"};
	static String word = words[(int) (Math.random() * words.length)];
	static String show;
	static int guesses = 20;
	static String letters = "";
	static boolean playAgain = true;

	public static void main(String[] args) {
		
		while(playAgain){
		System.out.print("How many players are playing? 1 or 2?");
		int players = scan.nextInt();
		
		if(players == 2){
			enterPhrase();
		}
		print();
		hangmanImage();
        
		
			while (!finished()) {
			
				if (guess()) {
					hangmanImage();
					System.out.println("Correct!");
					
				} else {
					guesses--;
					hangmanImage();
					System.out.println("Incorrect. Remaining guesses: " + guesses);
				}	
				print();
			}
			
			System.out.print("\nHad fun? Want to play again? y or n");
			String answer = scan.next();
			
			if(answer.equals("y")){
				playAgain = true;
				guesses = 5; 
				word = words[(int) (Math.random() * words.length)];
				letters = "";
			}
			else{
				playAgain = false;
			}
		}

	}
	
	public static void enterPhrase() {
		
		System.out.println("Please enter the word or phrase that we'll hide and play \"Hangman\" with: ");
		word = scan.next().toLowerCase();
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");//To hide the word inputed by the first player
		
	}
	
	public static void print() {

		show = "";

		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == ' ') {
				show += " ";
			} else if (letters.contains(word.substring(i, i + 1))) {
				show += word.charAt(i);
			} else {
				show += "_ ";
			}
		}

		System.out.print(show);

		lengths();

	}
	
	public static void lengths() {
		String[] words = word.split(" ");

		System.out.print("(");

		for (int i = 0; i < words.length - 1; i++) {
			System.out.print(words[i].length());
		}

		System.out.println(words[words.length - 1].length() + ")");
	}
	
	public static boolean guess() {

		String guess = "";

		while (guess.length() != 1 || letters.contains(guess)) {

			System.out.print("Please guess a letter: ");
			guess = scan.next().toLowerCase();
			
			if(letters.contains(guess)) {
				System.out.println("You already guessed that letter. Guess again.");
			}
		}

		letters += guess;

		if (word.contains(guess)) {
			return true;
		}
		return false;
		
		

	}
	
	public static void hangmanImage() {
		if (guesses == 5) {
			System.out.println("   ____________");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   | ");
			System.out.println("___|___");
		}
		if (guesses == 4) {
			System.out.println("   ____________");
			System.out.println("   |           |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   | ");
			System.out.println("___|___");
		}
		if (guesses == 3) {
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("___|___");
		}
		if (guesses == 2) {
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |");
			System.out.println("___|___");
		}
		if (guesses == 1) {
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |          / \\ ");
			System.out.println("___|___      /   \\");
		}
		if (guesses == 0) {
			System.out.println("GAME OVER!");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |          _|_");
			System.out.println("   |         / | \\");
			System.out.println("   |          / \\ ");
			System.out.println("___|___      /   \\");
			System.out.println("The word was: " + word);
		}
	}
	
	public static boolean finished() {
		if(guesses > 0 && !word.equals(show)) {
			return false;
		}
		return true;
	}
	

	


}

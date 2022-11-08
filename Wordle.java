package Wordle; 
import java.util.Scanner;
 
public class Wordle{
  
	
	public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    //Array of Words
    String [] words = {"knows", "tints", "freak", "sense",  
                       "ready", "loves", "rents", "cults",
                       "storm", "pound", "limit", "state",
                       "blunt", "vivid", "games", "mourn",
                       "poise", "ponds", "later", "spelt",
                       "words", "pilot", "bread", "pleat",
                       "flame", "guess", "shake", "spark" };

    //Variables
    String answer = words[(int)(Math.random()*words.length)];
    String guess = "";
    int guessNumber = 6;
    

    while(guessNumber > 0){
    	
        for(int i = 0; i < guessNumber; i++){
            System.out.println("You have " + guessNumber +  " guess remaining");
            
      
            do{
              System.out.print("Guess a 5 letter word: ");
              guess = reader.nextLine();
            } while (guess.length() != 5);
            
            setDisplay(guess, answer);
            
            if (guess.equals(answer)){
              GameWon(guess, answer);
              guessNumber = 0;
              break;
            }
            else{ 
              guessNumber--;
            }
          
            
            
        }
      }
    if(!guess.equals(answer) && guessNumber == 0){
      System.out.println("\n***GAME OVER***\nTry again tomorrow! The word was \"" + answer + "\"");
    
    } 
	  }
	
	  public static void GameWon(String guess, String answer){
		  if(guess.equals(answer)){
	      System.out.println("\n***GAME OVER***\nCongrats! You guessed the word! The word was \"" + answer + "\"");
	    }
	  }
	  
	  public static int count(String str, String c){
	    int count = 0;
	    for(int i = 0; i < str.length(); i++){
	        if(str.substring(i,i+1).equals(c)) {
	          count++;
	        }
	      }
	    return count;
	  }
	
	  
	  public static void setDisplay (String guess, String answer){
	    String display = "";
		  
	    for(int i = 0; i < answer.length(); i++){
	      String correctLetter = answer.substring(i,i+1);
	      String guessedLetter = guess.substring(i,i+1);
	      
	      if(guessedLetter.equalsIgnoreCase(correctLetter)) {
	          display += (guessedLetter.toUpperCase()) + " ";
	      }
	      
	      else if (answer.indexOf(guessedLetter) > 0 && count  (display, guessedLetter) < count(answer, guessedLetter)) {
	          display += (guessedLetter.toLowerCase()) + " ";
	      }
	      
	      else {
	        display += "_ ";
	      }
	    }
	    System.out.println(display);
	    
	  }
	
	  
}
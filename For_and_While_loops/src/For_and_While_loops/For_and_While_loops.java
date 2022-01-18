package For_and_While_loops;
import java.util.Random;
import java.util.Scanner;
/**
 * @author Aarav Samal
 *
 */
public class For_and_While_loops {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner ask = new Scanner(System.in); 
		Random generator = new Random(); 
		
		/*
		// Output: 1 2 3 4 5 6 7 8 9
		for(int x = 1; x < 10; x++) {
			System.out.print(x + " ");
		}
		
		System.out.println("");
		
		// Output: 6 7 8 9
		for(int a = 6; a < 10; a++) {
			System.out.print(a + " ");
		}
		
		System.out.println("");
		
		// Output: 10 9 8 7 6 5 4 3 2 1
		for(int b = 10; b > 0; b--) {
			System.out.print(b + " ");
		}
		
		System.out.println("");
		
		// Output: 0 1
		for(int c = 0; c < 2; c++) {
			System.out.print(c + " ");
		}
		
		System.out.println("");
		
		// Output: 5 10 15 20 25 30
		for(int d = 5; d < 31; d+=5) {
			System.out.print(d + " ");
		}
		*/
		
		
		// Problem 1
		
		/*
		System.out.println("How many exam scores are you going to input?  ");
		int x = ask.nextInt();
		int o = 0;
		int s = 0;
		int u = 0;
		
	
		for(int a = 1; a <= x; a++){
			System.out.println("Please enter exam score number " + a + ": ");
			int score = ask.nextInt();
			
			if (score > 69){
				if (score > 89) {
					System.out.println(score + " That is an Outstanding score!" + "\n");
					o++;  
				}
				else {
					System.out.println(score + " That is an Satisfactory score" + "\n");
					s++; 
				}
			}
			else {
				System.out.println(score + " That is an Unsatisfactory score" + "\n");
				u++; 
			}
		}
		
		System.out.println(" ");
		System.out.println("The number of outstanding scores are: " + o);
		System.out.println("The number of satisfactory scores are: " + s);
		System.out.println("The number of unsatisfactory scores are: " + u);
		*/
		
		
		//Problem 2
		
		/*
		System.out.println("How many exam scores are you going to input?  ");
		int x = ask.nextInt();
		int o = 0;
		int s = 0;
		int u = 0;
		
		for(int a = 1; a <= x; a++){
			//System.out.println("Please enter exam score number " + a + ": ");
			int low = 60;
			int high = 100;
			int score = generator.nextInt(high-low) + low;
			
			//System.out.println(score);
			//System.out.println(score+low);
			
			if (score > 69){
				if (score > 89) {
					System.out.println(score + " That is an Outstanding score!");
					o++; 
				}
				else {
					System.out.println(score + " That is an Satisfactory score");
					s++; 
				}
			}
			else { 
				System.out.println(score + " That is an unsatisfactory score");
				u++; 
			}
			
		}
		
		System.out.println("\nThe number of outstanding scores are: " + o);
		System.out.println("The number of satisfactory scores are: " + s);
		System.out.println("The number of unsatisfactory scores are: " + u);
		*/
		
		
		// Problem 1
		
		/*
		for(int x=4;x>0;x--){
			   for(int y=x;y<5;y++){
			    	System.out.print("*");
			    	}
			   System.out.println();
			}
	
		 */
		
		// Problem 2
	/*
		for(int x=0;x<5;x++){
			   for(int y=x;y<4;y++){
			    	System.out.print("*");
			    	}
			   System.out.println();
			}
	*/


		// Problem 3
		
		/*
		for(int x=0;x<6;x+=2){
			   for(int y=x;y<6;y++){
			    	System.out.print("*");
			    	}
			  System.out.println();
			}
		 */
		
		
		// Problem 4
		
		/*
		for(int x=0;x<10;x++){
			int i = 0;
			int a = 10;
			   for(int y=x;i<a;y++){
				   //for(int z=y; z<1; z++)
			    	System.out.println(x + " x " + i + " = " + x*i);
			    	i++;
			    	}
			   System.out.println();
			}
		*/
	}
	
	

}

package FIrst_Day_Code;
import java.util.Random;
import java.util.ArrayList;

/**
 * @author Aarav Damal
 */
public class Problem_4 {

	public Problem_4() {
		Random rand = new Random();
		
		for(int x = 0; x < 15; x++) {
			int num = rand.nextInt(10) + 10;//creating a random number between 10 and 20
			for(int i = 0; i < num; i++) {
				System.out.print("*");//Printing asterisk that many times
			}
			System.out.print("\n");
		}
	
	}//End of constructor

}//End of class

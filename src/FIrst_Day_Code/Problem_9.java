package FIrst_Day_Code;

import java.util.Random;

/**
 * @author Aarav Samal
 */
public class Problem_9 {

	public Problem_9() {
		int num1 = 2, num2 = 3;
		  
        int counter = 0;
  
        while (counter < 9) {
  
            // Print the number
            if(counter == 8) {
            	System.out.print(num1 + " ");
            }
            else {
            	System.out.print(num1 + ", ");
            }
        	
            // Swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter++;
        }
	}//End of constructor

}//End of class

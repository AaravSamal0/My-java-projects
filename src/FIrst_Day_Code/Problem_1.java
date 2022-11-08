package FIrst_Day_Code;
import java.util.ArrayList;
/**
 * @author Aarav Samal
 */
public class Problem_1 {
	
	public Problem_1() {
		
		//Creating Array List
		ArrayList<Integer> average = new ArrayList<>();		
		
	    //For Loop to find numbers with reminder of 3 after dividing by 5
	    for(int x = 1; x < 1001; x++) {//Iterating through numbers
			
	    	if(x%5 == 3) {//checking if when divided by 5 reminder is 3
				
				average.add(x);//Adding to aaray list

			}
		}
	
		int sum = 0;
		int length = average.size();
		for(int i = 0; i < length; i++) {//Finding the Average
			
			int element = average.get(i);//Getting the next number to be added to find the average
			sum += element;	//adding the number	
		}
		
		//Printing average
		double avg = (double)sum/(double)length;
		System.out.println("The average is: " + avg);
	
	}//End of constructor

}//End of class

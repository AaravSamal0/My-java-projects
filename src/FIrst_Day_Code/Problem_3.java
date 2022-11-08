package FIrst_Day_Code;

/**
 * @author Aarav Samal
 */
public class Problem_3 {
	
public Problem_3() {
		
	
	for (int i = 5; i >= 2; i--) {
		for (int k = 5; k >= i; k--) {
	    	System.out.print(k);//Printing the numbers
	    }
	    if(i%2 == 0) {
	        System.out.print("*");//Printing the asterisk for every other line
	    }
	    System.out.println();
	 }
		
	}//End of constructor

}//End of class



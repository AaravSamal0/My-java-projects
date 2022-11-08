package FIrst_Day_Code;

/**
 * @author jajatisamal
 */
public class Problem_5 {	
	
	public Problem_5() {
	
		int rows = 4;
		int x = 1;
		int j;
		
		System.out.println(1);//Printing out the first number
		
	    for (int i = 1; i <= rows; i++) {
	      for (j = 1; j <= x; j*=2) {
	        System.out.print(j + " ");//Printing the numbers going up
	      }
	      for (int y = j; y >= 1; y/=2) {
		        System.out.print(y + " ");//Printing the numbers going down
		  }
	      System.out.println();
	      x*=2;
	    }
				

	}//End of constructor

}//End of class


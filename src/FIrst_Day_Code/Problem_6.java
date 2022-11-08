package FIrst_Day_Code;

/**
 * @author Aarav Samal
 */
public class Problem_6 {
	public Problem_6() {
		
		int y = 0;
		
		
		for(int x = 0; x<10; x++) {
			if(x>1) {
				for(int i = 0; i<x-1; i+=2) {
					System.out.print("*");
				}
			}
				
			if(x%2 == 1) {
				y++;
				System.out.print(y);
			}
			else {
				System.out.print(y);
			}
			System.out.print("\n");

		}

	}//End of constructor

}//End of class
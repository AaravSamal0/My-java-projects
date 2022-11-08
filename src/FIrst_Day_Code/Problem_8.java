package FIrst_Day_Code;
import java.util.Random;
/**
 * @author jajatisamal
 */
public class Problem_8 {
	public Problem_8() {
		Random rand = new Random();

		int num = rand.nextInt(10);
		int add = 0;
		
		for(int x = 0; x<20; x++) {
			System.out.print(num + ", ");
			add = rand.nextInt(5)+1;
			num = num+add;

		}
		
	}//End of constructor

}//End of class

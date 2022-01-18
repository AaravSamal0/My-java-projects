package ArrayList_Task_Problems;
import java.util.ArrayList;
import java.util.Random;


public class ArrayList_Task_Problems {
	
	public static void main(String[] args) {
		Random rand = new Random();
		
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		
		// Create array List
		for(int x = 0; x < 15 ; x++){
			int y  = rand.nextInt(1000);
			arrList.add(y);
		}
		
		System.out.println(arrList);

		// Change all odd numbers to the remainder when divided by 27
		for (int x = 0; x < arrList.size(); x++) {
			if(arrList.get(x) % 2 != 0) {
				 int y = arrList.get(x);
				 arrList.set(x, y%27);
			}
		}
		
		System.out.println(arrList);
		
		//Remove all odd numbers
		for(int z = arrList.size()-1; z >= 0 ; z--) {
			if(arrList.get(z) % 2 != 0) {
				arrList.remove(z);
			}
		}
		
		System.out.println(arrList);
		
		//Find average and sum
		double sum = 0;
		double average = 0;
		
		for(int x = 0; x < arrList.size(); x++){
			sum = sum+=arrList.get(x);
		}
		
		System.out.println("Sum: " + sum + " \nAverage: " +sum/arrList.size());
		
	}

}

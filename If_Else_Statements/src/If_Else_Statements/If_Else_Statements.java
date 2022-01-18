package If_Else_Statements;
import java.util.Scanner;
/**
 * @author aaravsamal
 *
 */
public class If_Else_Statements {
	public static void main(String[] args) {
		Scanner ask = new Scanner(System.in); 
		
		/*
		
		//Problem 1
		System.out.println("Problem 1: \n \n");
		System.out.println("Pick a number...");
		int x = ask.nextInt();
		//System.out.println(x);
		
		if(x > 10) {
			if(x%2 == 0) {
				System.out.println("The number "+x+" is greater than 10 and is even");
			}
			else {
				System.out.println("The number "+x+" is greater than 10 and is odd");
			}
			
		}
		else {
			if(x%2 == 0) {
				System.out.println("The number "+x+" is less than 10 and is even");
			}
			else {
				System.out.println("The number "+x+" is less than 10 and is odd");
			}
		}
		
		
		//Problem 2
		System.out.println("\n \n Problem 2: \n \n");
		System.out.println("Pick a number...");
		int a = ask.nextInt();
		//System.out.println(a);
		
		if(a%11 == 0) {
			if(a%2 == 0) {
				System.out.println("The number "+a+" is divisible by 11 and is even");
			}
			else {
				System.out.println("The number "+a+" is either even or divisible by 11.");
			}
			
		}
		else {
			if(a%2 == 0) {
				System.out.println("The number "+a+" is either even or divisible by 11.");
			}
			else {
				System.out.println("The number "+a+" is neither even nor divisible by 11.");
			}
		}
		
		//Problem 3
		System.out.println("\n \n Problem 3: \n \n");
		System.out.println("Pick a 4 digit number...");
		int b = ask.nextInt();
		//System.out.println(b);
		
		if(b-1000 <= 0) {
			System.out.println("Your number is not 4 digits");
			
		}
		else if(b%11 == 0) {
			if(b%2 == 0) {
				System.out.println("The number "+b+" is divisible by 11 and is even");
			}
			else {
				System.out.println("The number "+b+" is either even or divisible by 11.");
			}
			
		}
		else if(b%11 != 0) {
			if(b%2 == 0) {
				System.out.println("The number "+b+" is either even or divisible by 11.");
			}
			else {
				System.out.println("The number "+b+" is neither even nor divisible by 11.");
			}	
		}
		else {
			System.out.println("Congrats you broke the code. ");
		}
		
		//Problem 4
		System.out.println("\n \n Problem 4: \n \n");
		System.out.println("Pick a number...");
		int c = ask.nextInt();
		//System.out.println(c);
		
		if(c-10 <= 0) {
			System.out.println("You loose");
		}
		
		else if(c-100 >= 0) {
			System.out.println("You're close");
		}
		
		else if(c - 99 <=0) {
			if(c%2 == 0) {
				System.out.println("You're close");
			}
			else {
				System.out.println("You're correct");
			}
			
		}
		
		*/

		
		
		
		/*
		System.out.print("Pick a whole number between 1-5. ");
		int num = ask.nextInt();
		//String num = ask.next();
		
		
		if(num == 1) {
			System.out.print("you selected 1 ");
		}
		
		else if(num == 2) {
			System.out.print("you selected 2 ");
		}
		
		else if(num == 3) {
			System.out.print("you selected 3 ");
		}
		
		else if(num == 4) {
			System.out.print("you selected 4 ");
		}
		
		else if(num == 5) {
			System.out.print("you selected 5 ");
		}
		
		else {
			System.out.print("you did not select a whole number between 1 and 5 ");
		}
		*/
		
		/*
		switch (num) {
			case 1:  System.out.print("you selected 1 ");
			break;
		
			case 2: System.out.print("you selected 2 ");
			break;
		
			case 3: System.out.print("you selected 3 ");
			break;
		
			case 4: System.out.print("you selected 4 ");
			break;
			
			case 5: System.out.print("you selected 5 ");
			break;
			
			default : System.out.print("you did not select a whole number between 1 and 5 ");
		    break;
		}
		
		*/
		
		
		/*
		System.out.print("Weight on Earth in pounds:");
		double W = ask.nextDouble();
		
		System.out.println("Planet to calculate weight:");
		System.out.println("");
		System.out.println("Murcury");
		System.out.println("Earth");
		System.out.println("Mars");
		System.out.println("Venus");
		System.out.println("Jupiter");
		System.out.println("Saturn");
		System.out.println("Uranus");
		System.out.println("Neptune");
		System.out.println("Pluto");
		String planet = ask.next();
		
		switch (planet) {
			case "Murcury": 
				double wM = (W*.38);
				System.out.println("You're weight on Murcury would be: " + wM + " pounds");
				break;
		
			case "Mars": 
				double wm = (W*.39);
				System.out.println("You're weight on Mars would be: " + wm + " pounds");
				break;
		
			case "Earth": 
				double wE =(W*1.00);
				System.out.println("You're weight on Earth would be: " + wE + " pounds");
				break;
		
			case "Venus":
				double wV = (W*.78);
				System.out.println("You're weight on Venus would be: " + wV + " pounds");
				break;
			
			case "Jupiter": 
				double wJ = (W*2.65);
				System.out.println("You're weight on Jupiter would be: " + wJ + " pounds");
				break;
			
			case "Saturn": 
				double wS = (W*1.17);
				System.out.println("You're weight on Saturn would be: " + wS + " pounds");
				break;
				
			case "Uranus": 
				double wU = (W*1.05);
				System.out.println("You're weight on Uranus would be: " + wU + " pounds");
				break;
			
			case "Neptune": 
				double wN = (W*1.23);
				System.out.println("You're weight on Neptune would be: " + wN + " pounds");
				break;
				
			case "Pluto": 
				double wP = (W*.05);
				System.out.println("You're weight on Pluto would be: " + wP + " pounds");
				break;
			
			
			default : System.out.print("Please use the exact capitilization and spelling in the example");
		    break;
		    */
		
		System.out.println("Please enter the first number...");
		double first = ask.nextDouble();
		
		System.out.println("Please enter the second number that is different from the first number...");
		double second = ask.nextDouble();
		
		System.out.println("Please enter the third number that is different from both the first and second numbers...");
		double third = ask.nextDouble();
		
		System.out.println("Now what opperation would you like to do on these numbers? ");
		System.out.println(" Add \n Subtract \n Average \n Product ");
		String operation = ask.next();
		
		
		switch (operation) {
			case "Add":
				double sum = first + second + third;
				System.out.println("The sum of these 3 numbers is " + sum);
				break;
			
			case "Average":
				double total = first + second + third;
				double avg = total/3;
				System.out.println("The average of these 3 numbers is " + avg);
				break;
			
			case "Product":
				double product = first*second*third;
				System.out.println("The product of these 3 numbers is " + product);
				break;
			
			case "Subtract": 
				double d = Difference(first, second, third);
				System.out.println("The difference of the greatest and least greatest numbers are " + d);
				break;
			
			default : System.out.print("Please use the exact capitilization and spelling in the example");
		    	break;

			
		
		
		}
		

	}

	public static double Difference(double first, double second, double third) {
		double f = first;
		double s = second;
		double t = third;
		double diff = 0;
		
		if(f > s) {
			if(f > t) {
				//System.out.println("First is greatest");
				if(s>t) {
					//System.out.println("Third is least");
					diff = f-t;
				}
				
				else {
					//System.out.println("Second is least");
					diff = f-s;
					
				}	
				
			}
			
			else {
				//System.out.println("Third is greatest"); 
				diff = t-s;
				
			}
		}
		
		else {
			if(f > t) {
				//System.out.println("Third is least");
				diff = s-t;
			}
			else {
				if(s > t) {
					//System.out.println("Second is greatest");
					diff = s-f;
				}
				
				else {
					diff = t-f;
				}
			}
		}
		return diff;
		
		
		
	}
	
	
}

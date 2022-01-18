package Arrays;
import java.util.Random;
import java.util.Scanner;;
public class Arrays {
	
	static int max = Integer.MIN_VALUE;
	static int min = Integer.MAX_VALUE;
	
	static int QueenPosR = 0, QueenPosC = 0;
	static int Ar = 0, Ac = 0;
	static int Br = 0, Bc = 0;
	static int Cr = 0, Cc = 0;
	
	static int PosOf_0_Row =  0;// The row of the 0 position
	static int PosOf_0_Col =  0;// The column of the 0 position
	static int RowOfMax = 0;// The row of the max number's position
	static int ColOfMax = 0;// The column of the max number's position
	
	static boolean CantReach = true;
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		
		
		/*************************************************************************************************/
		/**DUE FEB 26, 2021			DUE FEB 26, 2021			DUE FEB 26, 2021		DUE FEB 26, 2021**/
		/*************************************************************************************************/

		/*
		// Problem 1
		int[] array = new int[6];
		
		System.out.print("Original: ");
		
		for (int i = 0; i < 6; i++) {
			array[i] = rand.nextInt(21);
			System.out.print(array[i] + ", ");
		}
		
		int constant = array[3];
		array[3] = array[4];
		array[4] = constant;
		

		System.out.print("\nNew: ");
		for (int i = 0; i < 6; i++) {
			System.out.print(array[i] + ", ");
		}
		*/
		
		
		// Problem 2
		
		/*
		int total = 0;
		int[] array2 = new int[10];
		
		for (int i = 0; i < 10; i++) {
			array2[i] = i + 4;
			System.out.print(array2[i] + " ");
			//total = total + i + 4;
			total = total + array2[i];
		}
		
		int avg = total/10;
		System.out.print("\nAverage: " + avg);
		*/
		
		// Problem 3 Challenge
		
		/*
		int[] array3 = {1, 2, 3, 4, 5, 6, 7, 8};
		
		for(int i = 0; i < 8; i++){
			System.out.print(array3[i] + " ");

		}
		
		System.out.print("\n");
		
		for(int i = 0; i < 4; i++){
			int constant = array3[i];
			array3[i] = array3[7-i];
			array3[7-i] = constant;
			
			System.out.print( array3[i] + " ");

		}
		
		for(int i = 4; i < 8; i++){
			System.out.print(array3[i] + " ");

		}
		*/
		
		/******************************************************************************************************/
		/** DUE MARCH 2, 2021			DUE MARCH 2, 2021			DUE MARCH 2, 2021		DUE MARCH 2, 2021**/
		/******************************************************************************************************/

		// Problem 1
		
		/*
		System.out.println("Original:");
		int[] array = new int[30];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(31) + 5;
			System.out.print(array[i] + ", ");
		}
		*/
		
		//Problem 2
		
	    /*
		System.out.println("\nProblem 2:");

		System.out.println("\nNew: ");
		
		for (int i = 0; i < array.length; i++) {
			if(array[i]%2 == 0){
				array[i] = array[i]*3;
				System.out.print(array[i] + ", ");
			}
			else {
				System.out.print(array[i] + ", ");
			}
			
		}
		*/
		
		//Problem 3
		
		/*
		System.out.println("\nProblem 3:");
		System.out.println("Original: ");

		
		for (int i = 0; i < array.length; i++) {
			if(i%2 != 0){
				int temp = array[i];
				array[i] = array[i-1];
				array[i-1] = temp;
			}
		
		}
		
		System.out.println("\nNew: ");
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
		*/
		
		
		//Problem 4
		
		/*
	    System.out.println("\nProblem 4:");

		
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("Greatest value in the array: " + max);
		*/
		
		
		//Problem 5
		
		/*
		System.out.println("\nProblem 5:");

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if(array[i]%2 == 0) {
				if (array[i] > max) {
					max = array[i];
				}
			}
		}
		System.out.println("Greatest even value in the array:" + max);
		*/
		
		
		//Problem 6
		
		/*
	    System.out.println("\nProblem 6:");
		
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
			if(array[i]%2 == 0) {
				if (array[i] < min) {
					min = array[i];
				}
			}
		}
		System.out.println("Lowest even value in the array:" + min);
		*/
		
		//Problem 7
		
		/*
	    System.out.println("\nProblem 7:");
		
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if(array[i]%2 != 0) {
				if (array[i] > max) {
					max = array[i];
				}
			}
		}
		System.out.println("Greatest odd value in the array:" + max);
		*/
		
		
		//Problem 8
		
		/*
	    System.out.println("\nProblem 8:");
		
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
			if(array[i]%2 != 0) {
				if (array[i] < min) {
					min = array[i];
				}
			}
		}
		System.out.println("Lowest odd value in the array:" + min);
		*/
		
		//Problem 9
		
		/*
		System.out.println("\nProblem 9:");
		
		System.out.println("New:");

		for(int i = 0; i < 1 ; i++){    
	       int j, last;       
	       last = array[array.length-1];    
	            
	           for(j = array.length-1; j > 0; j--){  
	        	   array[j] = array[j-1];    
	           }
	       array[0] = last;    
	    }  
		
		for(int i = 0; i< array.length; i++){    
            System.out.print(array[i] + ", ");    
        }  
		*/
		
		// Problem 10
		
		/*
		System.out.println("\nProblem 10:");
		
		System.out.println("New:");
		int[] newArray = new int[array.length]; 
        int j = array.length; 
        for (int i = 0; i < array.length; i++) { 
        	newArray[j - 1] = array[i]; 
            j = j - 1; 
        } 
  
        for (int k = 0; k < array.length; k++) { 
            System.out.print(newArray[k] + ", "); 
        }
		*/
		
		/******************************************************************************************************/
		/** DUE MARCH 8, 2021			DUE MARCH 8, 2021			DUE MARCH 8, 2021		DUE MARCH 8, 2021**/
		/******************************************************************************************************/

		/*
		String[] names = {"Oliver", "Melissa", "Matt", "Ryan", "Kate", "Simon", "Will", "Caleb", "Shelby", "Alex"};
		
		String[] club = {"Chess", "X-Stem", "Robotics", "Model-UN", "Martial-Arts", "Debate", "Robotics", "Robotics", "Model-UN", "X-Stem"};
		
		int[] ages = {14, 15, 16, 17, 18, 19, 20, 21, 15, 17};
		
		System.out.println("Which club is going on a trip? "
				+ "\nChess, X-Stem, Robotics, Model-UN, Martial-Arts, Debate, Robotics, Robotics, Model-UN, X-Stem");
		String search = input.next();
		
		for(int i = 0; i < club.length; i++){
			if(club[i].equals(search)) {
				if(ages[i] >= 16) {
					System.out.println("Name: " + names[i] + "\nAge: " + ages[i] + "\nClub: " + club[i] + "\n");
				}
			}	
		}
		*/
		
		
		/******************************************************************************************************/
		/** DUE MARCH 10, 2021			DUE MARCH 10, 2021			DUE MARCH 10, 2021	   DUE MARCH 10, 2021**/
		/******************************************************************************************************/

		
		//Project 1
		
		/*
		int[][]array2D = new int[4][5];
		int value  = 1;
		for(int i = 0; i < array2D.length; i++) {// For rows
			for(int j = 0; j < array2D[i].length; j++) {//For Columns
				array2D[i][j] = value;
				System.out.print(array2D[i][j] + "\t");
				value++;
			}
			
			System.out.println();
		}
		*/
		
		
		//Problem 2
		
		/*
		int[][]array2D = new int[3][5];
		int total = 0;
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < array2D.length; i++) {//For Rows
			for(int j = 0; j < array2D[i].length; j++) {//For Columns
				
				array2D[i][j] =  rand.nextInt(50) + 1;
				System.out.print(array2D[i][j] + "\t");
				
				total = total + array2D[i][j];//Finding total value
				
				if (array2D[i][j] > max) { // Findind Max value
					max = array2D[i][j];
				}
				
					
			}
			
			System.out.println();
		}
		
		System.out.println("\nThe total is:  " + total);
		System.out.println("Maximum value in the array: " + max);
		*/
		
		
		/******************************************************************************************************/
		/** DUE MARCH 12, 2021			DUE MARCH 12, 2021			DUE MARCH 12, 2021	   DUE MARCH 12, 2021**/
		/******************************************************************************************************/

		/*
		String[][]chess = new String[8][8]; // Change to 2 to quickly check that it works
		

		
		placeQ(chess);
		placeA(chess);
		placeB(chess);
		placeC(chess);
		
		printArray(chess);
		System.out.println();
		reach(chess);
		*/
		
		
		/******************************************************************************************************/
		/** DUE MARCH 18, 2021			DUE MARCH 18, 2021			DUE MARCH 18, 2021	   DUE MARCH 18, 2021**/
		/******************************************************************************************************/
		
		//Problem 1
		
		/*
		int[][]array2D = new int[6][4];
		int total = 0;
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
				
		for(int i = 0; i < array2D.length; i++) {//For Rows
			for(int j = 0; j < array2D[i].length; j++) {//For Columns
				
				array2D[i][j] = rand.nextInt(70) + 7;
				System.out.print(array2D[i][j] + "\t");
				total = total + array2D[i][j];
				
				if(array2D[i][j] > max) {
					max = array2D[i][j];
				}
				else if(array2D[i][j] < min){
					min = array2D[i][j];
				}
				
				
				
			}

			System.out.println();
		}
		
		System.out.println("\nThe total is:  " + total);
		System.out.println("The maximum value is:  " + max);
		System.out.println("The minimum value is:  " + min);
		*/
		
		
		//Problem 2
		
		/*
		int[][] array2D = new int[5][4];
		
		for(int i = 0; i < array2D.length; i++) {//For Rows
			for(int j = 0; j < array2D[i].length; j++) {//For Columns
				
				//System.out.print("- ");
				
				if(i == 0 && j == 0) {
					array2D[i][j] = 4;
				}
				else if(i == 0 && j == 1) {
					array2D[i][j] = 9;
				}
				else if(i == 0 && j == 2) {
					array2D[i][j] = 16;
				}
				else if(i == 0 && j == 3) {
					array2D[i][j] = 25;
				}
				
				if(i > 0) {
					array2D[i][j] = array2D[i-1][j]*(j+2);
					
				}
				
				
				System.out.print(array2D[i][j] + "\t");
				
			}

			System.out.println();
		}
		*/
		
		//Problem 3
		
		/*
		String[][]array2D = new String[3][3];
		int a = 0;
		
		
		for(int i = 0; i < array2D.length; i++) {//For Rows
			for(int j = 0; j < array2D[i].length; j++) {//For Columns
				
				if(j == 0){
					array2D[i][j] = "*";
					a = j+1;
					System.out.print(array2D[i][j] + a +"\t");
					
				}
				else if(j == 1) {
					array2D[i][j] = "**";
					a = j+1;
					System.out.print(array2D[i][j] + a +"\t");
				}
				else if(j == 2) {
					array2D[i][j] = "***";
					a = j+1;
					System.out.print(array2D[i][j] + a +"\t");
				}
				

			}

			System.out.println();
		}
		*/
		
		/******************************************************************************************************/
		/** DUE MARCH 21, 2021			DUE MARCH 21, 2021			DUE MARCH 21, 2021	   DUE MARCH 21, 2021**/
		/******************************************************************************************************/
		
		/*
		int[][] array2D = new int[10][5];
		
		makeArray(array2D);
		place0(array2D);
		print_array(array2D);
		checkPos(array2D);
		*/
		
		  
	}//End of main method
	
	
	public static void placeQ(String[][] chess) { //Placing the Queen
		Random rand = new Random();
		
		QueenPosR =  rand.nextInt(chess.length);// The row of the Queen's position
		QueenPosC =  rand.nextInt(chess.length);// The column of the Queen's position
		chess[QueenPosR][QueenPosC] = "Q";
		
	}//End of placeQ
	
	public static void placeA(String[][] chess) {//Placing A 
		Random rand = new Random();
		
		Ar =  rand.nextInt(chess.length);// The row of A position
		Ac =  rand.nextInt(chess.length);// The column A position
		
		while(Ar == QueenPosR && Ac == QueenPosC){ // Checking that the positions are not the same
			
			Ar =  rand.nextInt(chess.length);// The row of A position
		    Ac =  rand.nextInt(chess.length);// The column A position
	
		}
		chess[Ar][Ac] = "A";
		
	}//End of placeA
	
	public static void placeB(String[][] chess) {//Placing B
		Random rand = new Random();
		
		Br =  rand.nextInt(chess.length);// The row of B position
		Bc =  rand.nextInt(chess.length);// The column B position
		
		while((Br == QueenPosR && Bc == QueenPosC)
				|| (Br == Ar && Bc == Ac)){ // Checking that the positions are not the same
			
			Br =  rand.nextInt(chess.length);// The row of B position
			Bc =  rand.nextInt(chess.length);// The column B position
		}
		chess[Br][Bc] = "B";
		
	}//End of placeB
	
	public static void placeC(String[][] chess) {//Placing C 
		Random rand = new Random();
		
		Cr =  rand.nextInt(chess.length);// The row of C position
		Cc =  rand.nextInt(chess.length);// The column C position
		
		while((Cr == QueenPosR && Cc == QueenPosC) || 
				(Cr == Ar && Cc == Ac) || 
				(Cr == Br && Cc == Bc)){ // Checking that the positions are not the same
			
			Cr =  rand.nextInt(chess.length);// The row of C position
			Cc =  rand.nextInt(chess.length);// The column C position
			
		}
		chess[Cr][Cc] = "C";
		
	}//End of placeC
	
	public static void printArray(String[][] chess){//Printing the Array
		
		for(int i = 0; i < chess.length; i++) {//For Rows
			for(int j = 0; j < chess[i].length; j++) {//For Columns
				
				
				if(chess[i][j] !=  "Q" && chess[i][j] !=  "A" && chess[i][j] !=  "B" && chess[i][j] !=  "C") {
					chess[i][j] =  "-";
				}
				System.out.print(chess[i][j] + "  ");	
			}

			System.out.println();
		}
		
	}//End of printArray
	
	public static void reach(String[][] chess){//Checking if anything can be reached by the queen
			
		for(int i = 0; i < chess.length; i++) {//For Rows
			for(int j = 0; j < chess[i].length; j++) {//For Columns
				
				if(chess[i][j] !=  "-" && chess[i][j] !=  "Q"){//Checks that the element is a letter A,B,C
					
					if(i == QueenPosR) {//Checks the row(Horizontal)
						System.out.println("\"" + chess[i][j] + "\" can be reached by the Queen");
						CantReach = false;
					}
					
					if(j == QueenPosC) {//Checks the column(Vertical)
						System.out.println("\"" + chess[i][j] + "\" can be reached by the Queen");
						CantReach = false;
					}
					
					for(int x = 0; x < chess.length; x++){//Quadrant 1  (+,+) 
						//System.out.println(x + " " + i + " " + j);
						if(i + x < chess.length && j + x < chess.length) {
							if(chess[i + x][j + x] == chess[QueenPosR][QueenPosC]) {//Checks the diagonal
								System.out.println("\"" + chess[i][j] + "\" can be reached by the Queen");
								CantReach = false;
								break;
							}
						}	
					}
					
					for(int x = 0; x < chess.length; x++){ //Quandrant 2 (-,+)
						//System.out.println(x + " " + i + " " + j);
						if(i + x < chess.length && j - x > -1) {
							if(chess[i + x][j - x] == chess[QueenPosR][QueenPosC]) {//Checks the diagonal
								System.out.println("\"" + chess[i][j] + "\" can be reached by the Queen");
								CantReach = false;
								break;//To stop computer from running after it found that the letter can be reached by the queen
							}
						}	
					}
					
					for(int x = 0; x < chess.length; x++){// Quandrant 4 +,-)
						//System.out.println(x + " " + i + " " + j);
						if(i - x > -1 && j + x < chess.length) {
							if(chess[i - x][j + x] == chess[QueenPosR][QueenPosC]) {//Checks the diagonal
								System.out.println("\"" + chess[i][j] + "\" can be reached by the Queen");
								CantReach = false;
								break;//To stop computer from running after it found that the letter can be reached by the queen
							}
						}	
					}
					
					for(int x = 0; x < chess.length; x++){// Quandrant 3 (-,-)
						//System.out.println(x + " " + i + " " + j);
						if(i - x > -1 && j - x > -1) {
							if(chess[i - x][j - x] == chess[QueenPosR][QueenPosC]) {//Checks the diagonal
								System.out.println("\"" + chess[i][j] + "\" can be reached by the Queen");
								CantReach = false;
								break;
							}
						}	
					}
	
				}
				
			}
		}
		//Print "nothing can be reached" if needed to
		if(CantReach) {
			System.out.println("Nothing can be reached");
		}
			
	}//End of reach

	/******************************************************************************************************/
	/** DUE MARCH 21, 2021			DUE MARCH 21, 2021			DUE MARCH 21, 2021	   DUE MARCH 21, 2021**/
	/******************************************************************************************************/
	
	public static void makeArray(int[][] array2D){//Makes the array
		Random rand = new Random();

		for(int i = 0; i < array2D.length; i++) {
			for(int j = 0; j < array2D[i].length; j++) {
				
				array2D[i][j] = rand.nextInt(100) + 1;

				if(array2D[i][j] > max) {
					max = array2D[i][j];
					RowOfMax = i;
					ColOfMax = j;
				}
			}
		}
		

	}//End of makeArray

	public static void place0(int[][] array2D){//Places 0
		Random rand = new Random();

		PosOf_0_Row =  rand.nextInt(10);// The row of the 0 position
		PosOf_0_Col =  rand.nextInt(5);// The column of the 0 position
		array2D[PosOf_0_Row][PosOf_0_Col] = 0;
	}//End of Place0

	public static void print_array(int[][] array2D){//Printing the Array
		for(int i = 0; i < array2D.length; i++) {
			for(int j = 0; j < array2D[i].length; j++) {
				System.out.print(array2D[i][j] + "\t");
				
			}
			System.out.println();
		}
		
		System.out.println("The greatest value is: " + max + "\n");
	}//End of print0

	public static int checkPos(int[][] array2D){//Printing the Array
		
		System.out.println("\n0 Position: " + PosOf_0_Row + ", " + PosOf_0_Col + "\nMax Position:  " + RowOfMax + ", " + ColOfMax);
		
		if(RowOfMax == PosOf_0_Row) {//Checks the row(Horizontal)
			System.out.println("The max value is in the same row as 0");
			CantReach = false;
			
		}
		
		if(ColOfMax == PosOf_0_Col) {//Checks the column(Vertical)
			System.out.println("The max value is in the same column as 0");
			CantReach = false;
			
		}
		
		for(int x = 0; x < array2D.length; x++){//Quadrant 1  (+,+) 
			//System.out.println(x + " " + i + " " + j);
			if(RowOfMax + x < array2D.length && ColOfMax + x < 5) {
				if(array2D[RowOfMax + x][ColOfMax + x] == array2D[PosOf_0_Row][QueenPosC]) {//Checks the diagonal
					System.out.println("The max value is in the same diagonal as 0");
					CantReach = false;
					//break;
					return 0;//To stop computer from running after it found that the 0 and the max value are in the same diagonal
				}
			}	
		}
		
		for(int x = 0; x < array2D.length; x++){ //Quandrant 2 (-,+)
			//System.out.println(x + " " + i + " " + j);
			if(RowOfMax + x < array2D.length && ColOfMax - x > -1) {
				if(array2D[RowOfMax + x][ColOfMax - x] == array2D[PosOf_0_Row][PosOf_0_Col]) {//Checks the diagonal
					System.out.println("The max value is in the same diagonal as 0");
					CantReach = false;
					//break;
					return 0;//To stop computer from running after it found that the 0 and the max value are in the same diagonal
				}
			}	
		}
		
		for(int x = 0; x < array2D.length; x++){// Quandrant 4 +,-)
			//System.out.println(x + " " + i + " " + j);
			if(RowOfMax - x > -1 && ColOfMax + x < 5) {
				if(array2D[RowOfMax - x][ColOfMax + x] == array2D[PosOf_0_Row][PosOf_0_Col]) {//Checks the diagonal
					System.out.println("The max value is in the same diagonal as 0");
					CantReach = false;
					//break;
					return 0;//To stop computer from running after it found that the 0 and the max value are in the same diagonal
				}
			}	
		}
		
		for(int x = 0; x < array2D.length; x++){// Quandrant 3 (-,-)
			//System.out.println(x + " " + i + " " + j);
			if(RowOfMax - x > -1 && ColOfMax - x > -1) {
				if(array2D[RowOfMax - x][ColOfMax - x] == array2D[PosOf_0_Row][PosOf_0_Col]) {//Checks the diagonal
					System.out.println("The max value is in the same diagonal as 0");
					CantReach = false;
					//break;
					return 0;//To stop computer from running after it found that the 0 and the max value are in the same diagonal
				}
			}	
		}
	
		
		//Print "nothing can be reached" if needed to
		if(CantReach) {
		System.out.println("The max value doesn't share a row, column, or diagonal with 0");
		}
		
		return 1;
	}//End of checkPos
	
	
}// End of Public class Array

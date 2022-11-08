package Chess_Tester;

import java.util.Random;

/**
 * @author jajatisamal
 */
public class Chess_Tester {
	
	static int QueenPosR = 0, QueenPosC = 0;
	static int Ar = 0, Ac = 0;
	static int Br = 0, Bc = 0;
	static int Cr = 0, Cc = 0;
	static boolean CantReach = true;

	public static void main(String[] args) {

		String[][]chess = new String[8][8]; // Change to 2 to quickly check that it works
		
		
		placeQ(chess);
		placeA(chess);
		placeB(chess);
		placeC(chess);
		
		printArray(chess);
		System.out.println();
		reach(chess);

	}
	
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
				System.out.print(chess[i][j] + " ");	
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
	

}

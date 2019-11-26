import java.util.Arrays;

public class Board{
    private static char[][] board;

    public Board(){
	 board = new char[6][8];	
    }

    public Board(int x, int y){
	board = new char[x][y];
	System.out.println("Boardsize is now " + x + " x " + y);
    }

    
    public static char get(int i, int j) {
	return board[i][j];
    }

    public static int getLength() {
	return board[0].length;
    }

    public static int getHeight() {
	return board.length;
    }

    public static void set(int i, int j, char c) {
	board[i][j] = c;
    }

    public static void clear(int i, int j) {
	board[i][j] = ' ';
    }
    
    public static void fillArray(char c){
	for (int i = 0; i < board.length; i++){
	    Arrays.fill(board[i], c);
	}
    }

    public static void show(){
	System.out.print("\n");
	for (int k = 0; k < board[0].length; k++){
	    System.out.print("  " + (k + 1) + "  ");
	}
	System.out.print("\n");
	for (int l = 0; l < board[0].length; l++){
	    System.out.print("_____");
	}
	System.out.print("\n");
	    
	for (int i = 0; i < board.length; i++){
	    for (int j = 0; j < board[i].length; j++){
		System.out.print("[ " + board[i][j] + " ]");
	    }
	    System.out.print("\n");
	}

	for (int m = 0; m < board[0].length; m++){
	    System.out.print("-----");
	}
	System.out.print("\n");


    }

    public static void dropPiece(char piece, int column){
	int length = board[0].length;
	int columnArray = column - 1; // convert to Arrayspeak
	
	if (column > board[0].length || column < 1){
	    System.out.println("Your out of bounds!");
	} else if (board[0][columnArray] != ' '){
	    System.out.println("Column full!");
	} else{
	    for (int i = board.length -1 ; i >= 0; i-- ){
		if (board[i][columnArray] == ' '){
		    board[i][columnArray] = piece;
		    break;
		}
	    }
	}
    }
}

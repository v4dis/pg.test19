import java.util.Scanner;

public class FourGame{

    static Board board = new Board(8, 8);
    
    public static void main(String[] args){
	Checker checker = new Checker();
	boolean state = false;
	board.fillArray(' ');
	clearScreen();
	board.show();

	while (state == false){
	    Board.dropPiece('X', turn());
	    //	    checker.checkRows('X', board);
	    //checker.checkColumns('X', board);
	    //Board.dropPiece('O', turn());
	    //checker.checkRows('O', board);
	    //checker.checkColumns('O', board);
	    checker.checkDiagLeft('X', board);
	    //clearScreen();
	    board.show();
	    state = checker.getState();
	}
    }

    public static int turn(){
    	Scanner input = new Scanner(System.in);
	//	board.show();
	System.out.print("Choose shaft (1-" + board.getLength()  + "): ");
	return input.nextInt();
    }

    public static void clearScreen() {
	String osName = new String(System.getProperty("os.name"));
	if (osName.equals("Linux")){
	    System.out.print("\033[H\033[2J");  
	    System.out.flush();
	} 
    }  

}

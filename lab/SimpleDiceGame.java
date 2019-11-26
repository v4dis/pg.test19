import java.util.Scanner;
import java.util.ArrayList;

public class SimpleDiceGame{

    public static void main(String[] args){
	ArrayList<Player> listOfPlayers = new ArrayList<Player>(initialize());

	for (int i = 0; i < 5; i++){
	    System.out.print("\nRound " + (i + 1) + "\n");
	    takeTurn(listOfPlayers);
	}

	ArrayList<Player> listOfWinners = new ArrayList<Player>(getWinners(listOfPlayers));

	if (listOfWinners.size() > 0){
	    System.out.println("\n----\nAnd our winners are;");
	    for (int i = 0; i < listOfWinners.size(); i++ ){
		System.out.println(listOfWinners.get(i).getName());
	    } 
	} else {
	    System.out.println("\n----\nEverybody's a loser!");
	}
    }

    private static ArrayList<Player> initialize(){
	int nrOfPlayers;
	int nrOfDie;
	int nrOfDieSides;
	
	Scanner getNrOfPlayers = new Scanner(System.in);
	Scanner getNameOfPlayer = new Scanner(System.in);
	ArrayList<Player> players = new ArrayList<Player>();

	System.out.print("How many players?: ");
	nrOfPlayers = getNrOfPlayers.nextInt();
	System.out.print("How many die do you need?: ");
	nrOfDie = getNrOfPlayers.nextInt();
	System.out.print("How many sides per die do you want?: ");
	nrOfDieSides = getNrOfPlayers.nextInt();

	for (int i = 0; i < nrOfPlayers; i++){
	    System.out.print("Enter player nr" + (i+1) + "'s name: ");
	    players.add(new Player(getNameOfPlayer.nextLine(), nrOfDie, nrOfDieSides));
	}
	clearScreen();
	return players;
    }
    
    private static void takeTurn(ArrayList<Player> players){
    	int guess, result;
    	Scanner playerInput = new Scanner(System.in);

    	for (int i = 0; i < players.size(); i++){
    	    System.out.print("\t" + players.get(i).getName() + "'s turn, guess the combined value of your die: ");
    	    guess = playerInput.nextInt();
	    players.get(i).rollDice();
	    result = players.get(i).getDieValue();
	    System.out.print("\tResult: " + result);
	    if (guess == result) {
	    	players.get(i).increaseScore();
	    	System.out.print(" - success! ");
		System.out.print(players.get(i).getName() + "'s score: " + players.get(i).getScore() + "\n"); 
	    } else{
	    	System.out.print(" - failure! ");
		System.out.print(players.get(i).getName() + "'s score: " + players.get(i).getScore() + "\n"); 
	    }
		
    	}
    }
    
    private static ArrayList<Player> getWinners(ArrayList<Player> players){
	int largestValue = players.get(0).getScore() ;
	ArrayList<Player> listWinners = new ArrayList<Player>();
	
	for(int i = 1; i < players.size(); i++){
	    if(players.get(i).getScore() > largestValue){
		largestValue = players.get(i).getScore();
	    }
	}

	for (int i = 0; i < players.size(); i++){
	    if (largestValue > 0 && players.get(i).getScore() == largestValue){
		listWinners.add(players.get(i));
	    }
	}
    	return listWinners;
    }
    
    public static void clearScreen() {
	String osName = new String(System.getProperty("os.name"));
	if (osName.equals("Linux")){
	    System.out.print("\033[H\033[2J");  
	    System.out.flush();
	} 
    }  
}

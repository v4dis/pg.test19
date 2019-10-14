import java.util.ArrayList;
import java.util.Scanner;

public class Player{

    private String name = new String();
    private int score = 0;
    ArrayList<Die> playerDie = new ArrayList<Die>();
    
    public Player(String n, int nrOfDie, int sides){
	name = n;
	for (int i = 0; i < nrOfDie; i++){
	    addDie(sides);
	}
    }

    public Player(){
    }

    public void rollDice(){
	for (int i = 0; i < playerDie.size(); i++){
	    playerDie.get(i).roll();
	}
    }
    
    public int getDieValue(){
	int sum = 0;
	for (int i = 0; i < playerDie.size(); i++) {
	    sum += playerDie.get(i).getValue();
	}
    	return sum;
    }
    
    public void increaseScore(){
	score++;
    }
    
    public void addDie(int sides){
	    playerDie.add(new Die(sides));
    }

    public String getName(){
	return name;
    }

    public int getScore(){
	return score;
    }
}

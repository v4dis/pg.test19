import java.util.Random;

public class Die{

    private static int currentValue = 0;
    private static int dieSides = 12;
    
    public Die(int sides){
	dieSides = sides;
	roll();
    }

    public Die(){
    }

    public void roll(){
	Random random = new Random();
	int result = random.nextInt(dieSides) + 1;
	currentValue = result;
    }
    
    public int getValue(){
	return currentValue;
    }
    
    public void setSides (int input){
	dieSides = input;
    }

    public int getSides(){
	return dieSides;
    }
}

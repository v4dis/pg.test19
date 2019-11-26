public class Goblin implements Monster, Mortal{
    private int health;
    public void attack(){
	System.out.println("Waaaah");
    }

    public int getHealth(){
	return health;
    }

    public void damage(int dmg){
	health -= dmg;
    }
}

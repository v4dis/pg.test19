import java.util.Scanner;

public class Lion extends Animal{
    Scanner input = new Scanner(System.in);

    public Lion(String name){
	super(name);
    }

    public void roar(){
	System.out.println(" : roooar");
	//	System.out.println(name);
	eat("Rabbit");
    }
}

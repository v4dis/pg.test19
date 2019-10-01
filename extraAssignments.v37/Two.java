import java.util.Scanner;

public class Two{
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number larger or equal to zero and smaller than 10: ");
	if (inRange(input.nextInt()) == true) {
	    System.out.println("Congrats! you did it!");
	} else {
	    System.out.println("Epic fail :-(");
	}
    }

    public static boolean inRange(int input){
	if (input >= 0 && input < 10) {
	    return true;
	} else {
	    return false;
	}
    }
}

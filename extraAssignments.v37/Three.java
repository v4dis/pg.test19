import java.util.Scanner;
public class Three{
    public static void main(String[] args){

	String string1, string2;

	do {
	    string1 = getString();
	    string2 = getString();
	} while (!string1.equals(string2));


    }
    public static String getString(){
	System.out.print("Enter string: ");
	Scanner input = new Scanner(System.in);
	String inputString = input.nextLine();
	return inputString;
    }

}

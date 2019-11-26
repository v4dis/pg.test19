import java.util.*;
public class Repeat{
    public static void main(String[] args){

	Scanner myObj = new Scanner(System.in);
	String a = "a";
	String b = "b";
	
	while (!a.equals(b)) {

	    System.out.print("Enter first string: ");
	    a = myObj.nextLine();
	    System.out.print("\nEnter second string: ");
	    b = myObj.nextLine();
	}
    }
    
}

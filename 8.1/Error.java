import java.util.*;

public class Error {
    public static void main(String[] args){
	Scanner sc1 = new Scanner(System.in);
	System.out.println("Välj nämnare: ");
	int nominator = sc1.nextInt();
	try {
	    int dividend = 100/nominator;
	    System.out.println(dividend);
	    
	} catch(ArithmeticException e){
	    System.out.println("Fel inträffade " + e.getMessage());
	}
    }
}

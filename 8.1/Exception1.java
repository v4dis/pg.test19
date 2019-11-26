import java.util.Scanner;

public class Exception1 {

    static int input;
    public static void main(String[] args) {
	System.out.print("Enter your age: ");
	System.out.println("Your age is: " + getInput());
    }
    
    public static int getInput() throws AgeIncorrectException {
	Scanner scanner = new Scanner(System.in);
	
	try {
	    System.out.print("Enter age: ");
	    input = scanner.nextInt();
	    
	}catch (AgeIncorrectException a){
	    
	    if (input < 0){
		System.out.println("Too damn low!");
		throw new AgeIncorrectException();
	    } else if (input > 120){
		System.out.println("Too damn high!");
		throw new AgeIncorrectException();
	    }
	}
	catch(Exception e){
	    System.out.print("Wrong again monkeyboy! Try again!: ");
	    getInput();
	}
	
      	return input;
    }
    
} 



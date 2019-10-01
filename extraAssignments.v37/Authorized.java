import java.util.Scanner;

public class Authorized{
    public static void main(String[] args){
	
	for (int i = 0;i<5;i++){
	    if (isAuthorized() == true) {
		System.out.println("Congrats! You did it!");
		break;
	    }
	}
    }

    public static boolean isAuthorized(){
	Scanner askPassword = new Scanner(System.in);

	String token1 = "piggy";
	String token2 = "bark";
	String token3 = "snuff";

	System.out.print("Enter password nr1: ");
	String pass1 = askPassword.nextLine();

	System.out.print("Enter password nr2: ");
	String pass2 = askPassword.nextLine();

	System.out.print("Enter password nr3: ");
	String pass3 = askPassword.nextLine();

	boolean cond1 = false;
	boolean cond2 = false;
	boolean cond3 = false;

	if (pass1.equals(token1) || pass1.equals(token2) || pass1.equals(token3)) {
	    cond1 = true;
	}else {
	    cond1 = false;
	}
	
	if (pass2.equals(token1) || pass2.equals(token2) || pass2.equals(token3)) {
	    cond2 = true;
	} else {
	    cond2 = false;
	}

	if (pass3.equals(token1) || pass3.equals(token2) || pass3.equals(token3)) {
	    cond3 = true;
	} else {
	    cond3 = false;
	}

	if (cond1 == true && cond2 == true && cond3 == true) {
	    return true;
	}
	else {
	    System.out.println("Wrong again! Monkeyboy!");
	    return false;
	}
    }
}

import java.util.Scanner;

public class Five{
    public static void main(String[] args){
	
	for (int i = 0; i < 5; i++){
	    if (isAuthorized() == true){
		if (i < 4){
		    System.out.println("Congrats! You did it!");
		} else {
		    System.out.println("Don't worry! Be happy, fifths a charm!");
		}
		break;
	    }
	    
	}
	
    }
    
    public static boolean isAuthorized(){
	Scanner input = new Scanner(System.in);
	
	String pass1 = "piggy";
	String pass2 = "snuff";
	String pass3 = "bark";

	System.out.print("Enter password nr 1: ");
	String input1 = input.nextLine();
	System.out.print("Enter password nr 2: ");
	String input2 = input.nextLine();
	System.out.print("Enter password nr 3: ");
	String input3 = input.nextLine();

	boolean check1 = false;
	boolean check2 = false;
	boolean check3 = false;

	boolean authorized = false;
	
	if (input1.equals(pass1) || input1.equals(pass2) || input1.equals(pass3) ){
	    check1 = true;
	}
	
	if (input2.equals(pass1) || input2.equals(pass2) || input2.equals(pass3) ){
	    check2 = true;
	}

	if (input3.equals(pass1) || input3.equals(pass2) || input3.equals(pass3) ){
	    check3 = true;
	}

	if (check1 && check2 && check3 == true) {
	    authorized = true;
	}

	if (input1.equals(input2) || input1.equals(input3)) {
		System.out.print("Instant fail! Try again MonkeyBoy!\n");
		authorized = false;
	    }
	
	return authorized;
    }
}

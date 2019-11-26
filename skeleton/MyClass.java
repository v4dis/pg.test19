import java.util.Scanner;

public class MyClass {

    public static float calculateTax (float salary){
	float taxRate = 0f;

	System.out.println(salary);
	
	if (salary >= 100000.0f){
	    taxRate = 0.4f;
	} else if(salary > 0f){
	    taxRate = 0.3f;
	} else{
	    System.out.println("You are too poor to play this game, lol :-P");
	}
	
	float taxToPay = salary * taxRate;

	return taxToPay;
    }
    
    public static void main(String[] args){

	System.out.print("Please enter salary: ");
	Scanner userInput = new Scanner(System.in);
	float input = userInput.nextFloat();

	float amountOfTax = calculateTax(input);

	System.out.println("Tax to pay: " + amountOfTax);
    }
}

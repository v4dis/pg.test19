import java.util.Scanner;

public class Four{
    public static void main(String[] args){
	System.out.println(returnMean(inputNumber(), inputNumber()));
    }

    public static float inputNumber(){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter number: ");
	float myFloat = input.nextFloat();
	return myFloat;
    }

    public static float returnMean(float input1, float input2){
	float mean = (input1 + input2)/2;
	return mean;
    }
}

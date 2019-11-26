import java.util.Scanner;

public class Mean{
    
    public static void main(String[] args){
	
	System.out.println(calculateMean(2));
	int a = calculateMean(8);
    }
    
    public static int calculateMean(int input){
	return input;
    }
    
    public static int[] getInt(){
	int[] meanArray = new int[2];
	int intNr1, intNr2;
	Scanner myObj = new Scanner(System.in);
	
	for (int i = 0; i<2; i++){
	    System.out.print("Enter number: ");
	    meanArray[i] = myObj.nextInt();
	}
	return meanArray[]; 
    }
}

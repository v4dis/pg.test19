import java.util.Scanner;

public class Nine{

    public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	String textInput = input.nextString();
	String [] array = new String[2];
	String[] extSting; 
	do {
	    for (int i = 0; i < array.length; i++) {
		array[i] = input.nextLine;
		if (array[0].length < array[1].length){
		    String[] extString = new extString[array.length + 1]; 
		}
	    }
	} while ();
	


















	
    }

    public static String[] createArray(){
	    String[] array = {getString(), getString()};
	   
	    for (int i = 0; i < array.length; i++) {
		String[] extArray = new String[array.length + 1];
		extArray[i] = array[i];
	    }

	return extArray;
    }

    public static String[] extendArray(String[] array){
	if (array[0].length() < array[1].length()) {
	    String[] returnArray = new String[array.length + 1];
	    for (int i = 0; i > array.length;i++){
		returnArray[i] = array[i];
	    }
	    return returnArray;
	} else {
	    return array;
	}
    }

    public static String getString(){
	System.out.print("Enter string:");
	Scanner input = new Scanner(System.in);
	String string = input.nextLine();
	return string;
    }
}


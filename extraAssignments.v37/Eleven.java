public class Eleven{
    public static void main(String[] args){
	int[] array = {5,6,1,2,7,8,3,4,9,0};
	printArray(array);
        combSort(array);
    }

    public static int[] combSort(int[] array){
	int j = (array.length -1);
	int iterations = 0;

    	do {
	    System.out.println("int j is: " + j);	    
    	    for (int i = 0; i < (array.length - 1); i++){ 
    		if (array[i] > array[j]) {
    		    int tmp = array[i];
    		    array[i] = array[j];
    		    array[j] = tmp;
    		}
    	    }
    	    printArray(array);
    	    iterations++;
	    if (j == 0 || j < 10){
		j++;
	    }
	    j--;
    	} while (checkIfSorted(array) == false);
	
	return array;
    }
    
    public static void printArray(int[] array){
	for (int i = 0; i < array.length; i++){
	    System.out.print(array[i]);
	}
	System.out.print("\n");
    }


    public static int[] bubbleSort(int[] array){
    	int iterations = 0;
	
    	do {
    	    for (int i = 0; i < (array.length - 1); i++){
    		if (array[i] > array[i+1]) {
    		    int tmp = array[i];
    		    array[i] = array[i+1];
    		    array[i+1] = tmp;
    		}
    	    }
    	    printArray(array);
    	    iterations++;
    	} while (checkIfSorted(array) == false);
    	System.out.println("Number of iterations: " + iterations );
    	return array;
    }

    public static boolean checkIfSorted(int[] array){
	boolean result = false;
	int j = 1;
	for (int i = 0; i < (array.length -1); i++) {
	    if (array[i] <= array[j]){
		result = true;
	    } else {
		result = false;
		break;
	    }
	    j++;
	}
	return result;
    }

    
}


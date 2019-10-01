public class Ten{

    public static void main(String[] args){
	int[] array = {8,2,1,9,3,4,5,4,5,6,7,5,6,7,2,1,9,3,4,5,4,5,6,7,5,6,7,2,1,9,3,4,5,4,5,6,7,5,6,7,2,1,9,3,4,5,4,5,6,7,5,6,7,2,1,9,3,4,5,4,5,6,7,5,6,7,2,1,9,3,4,5,4,5,6,7,5,6,7,2,1,9,3,4,5,4,5,6,7,5,6,7,2,1,9,3,4,5,4,5,6,7,5,6,7,2,1,9,3,4,5,4,5,6,7,5,6,7,2,1,9,3,4,5,4,5,6,7,5,6,7,2,1,9,3,4,5,4,5,6,7,5,6,7,2,1,9,3,4,5,4,5,6,7,5,6,7,2,1,9,3,4,5,4,5,6,7,5,6,7};
	printArray(array);
	bubbleSort(array);
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

}

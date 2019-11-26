public class Array{
    public static void main(String[] args){
	printArray(doubleUpArray(createArray(10)));
    }
    
    public static int[] createArray(int x){
	int arr[] = new int[x]; 
	for (int i = 0;i<x;i++){
	    arr[i] = i + 1;
	}
	return arr;
    }
    
    public static void printArray(int[] arr){
	for (int i=0;i<arr.length;i++){
	    System.out.print(arr[i]);
	}
	System.out.println();
    }
    
    public static int[] doubleUpArray(int[] arr){
	int arrDouble[] = new int[arr.length * 2];
	for (int i=0;i<arr.length;i++){
	    arrDouble[i] = arr[i];
	}
	return arrDouble;
    }
}

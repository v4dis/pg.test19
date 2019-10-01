public class Eight{
    public static void main(String[] args){
	//double[] array = new double[5];
	double[] array = { 1,2,3,4,5,9 };
	System.out.println(meanArray(array));
    }
    public static double meanArray(double[] array){
	double sum = 0;
	for (int i = 0; i < array.length; i++) {
	sum = sum + array[i];
	}
	double mean = sum / array.length;
	return mean;
    }
}

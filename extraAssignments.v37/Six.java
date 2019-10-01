public class Six{
    public static void main(String[] args){
	System.out.println(anyIsTrue(false,false,false,false));
    }

    public static boolean anyIsTrue(boolean any1, boolean any2, boolean any3, boolean any4 ){
	if (any1 || any2 || any3 || any4 == true){
	    return true;
	} else {
	    return false;
	}
    }
}

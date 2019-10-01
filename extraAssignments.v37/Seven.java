public class Seven{
    public static void main(String[] args){
	System.out.println(anyIsTrue(false,false,false,false));
    }

    public static boolean anyIsTrue(boolean any1, boolean any2, boolean any3, boolean any4 ){
	if (any1 == false && any2 == false && any3 == false && any4 == false){
	    /* 
	       Shorthand; "any1 && any2 && any3 && any4 == false" fungerar 
	       ej i java 8 för And-statements men det fungerar för Or!!!
	       Why though?

	     */
	    return true;
	} else {
	    return false;
	}
    }
}

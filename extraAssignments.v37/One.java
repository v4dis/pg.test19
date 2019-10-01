public class One{
    public static void main(String[] args){
	
	for (int i = 0;i < 10; i++) {
	    System.out.println(isEven(i));	    
	}
    }

    public static boolean isEven(int x){
	if (x%2 == 0){
	    return true;
	} else{
	    return false;
	}
    }
}

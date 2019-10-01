import java.util.ArrayList;
public class ArrayListExample{
    public static void main(String[] args){
	
	ArrayList<Integer> list = new ArrayList<Integer>();
	
	list.add(0,1);
	list.add(0,1);
	list.add(0,1);
	list.add(0,1);

	for (int i=0; i<4; i++){
	    System.out.println(i);
	    System.out.println(list.get(i));
	}
	
    }
}

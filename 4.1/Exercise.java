public class Exercise{
    public static void main(String[] args){
	Person p1 = new Person("Harald");
	p1.hungry = true;
	Person p2 = new Person("Anders");
	p2.hungry = true;
	Korvmojj korv = new Korvmojj();
	for (int i = 0; i<10; i++) {
	    korv.feedSausageToPerson(p1);
	    korv.feedSausageToPerson(p2);
	}
    }
    
}

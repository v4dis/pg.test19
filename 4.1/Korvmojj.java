public class Korvmojj{
    int amountOfSausagesLeft = 100;

    public void feedSausageToPerson(Person p){
	if((p.hungry == true) && (amountOfSausagesLeft > 0)){
	    amountOfSausagesLeft--;
	    p.hungry = false;
	    System.out.println(amountOfSausagesLeft);
	} else {
	    System.out.println("Sorry");
	}
    }
}


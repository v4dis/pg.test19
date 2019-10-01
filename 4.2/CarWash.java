public class CarWash{
    public CarWash(Car input){

	if (input.isInsured == false){
	    System.out.println("The car cannot be washed as it lacks insurance!");
	} else if (input.isWashed == true){
	    System.out.println("The car has already been washed.");
	} else {
	    System.out.println("The car is dirty & has insurance. Starting the wash cycle.");
	    input.isWashed = true;
	}
	
    }

}

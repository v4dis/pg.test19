public class Car{
    public String modelName;
    public int modelYear;
    public boolean isWashed;
    public boolean isInsured;
    public Car(String m, int y, boolean w, boolean i) {
	modelName = m;
	modelYear = y;
	isWashed =  w;
	isInsured = i;
	System.out.println("Model\t\t:\t" + modelName);
	System.out.println("Model year\t:\t" + modelYear);
	System.out.println("Washed?\t\t:\t" + isWashed);
	System.out.println("Insured?\t:\t" + isInsured);
    }

    public Car(){
	if (isInsured == false){
	    System.out.println("The car cannot be washed as it lacks insurance!");
	} else if (isWashed == true){
	    System.out.println("The car has already been washed.");
	} else {
	    System.out.println("The car is dirty & has insurance. Starting the wash cycle.");
	    
	}
    }
}

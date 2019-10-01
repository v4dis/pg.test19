public class CarExcercise{
    public static void main(String[] args){

	Car car1 = new Car("Volvo", 2000, false, true);
	printCarInfo(car1);
	CarWash wash1 = new CarWash(car1);
	printCarInfo(car1);
    }
    public static void printCarInfo(Car input){
	System.out.println("Model\t\t:\t" + input.modelName);
	System.out.println("Model year\t:\t" + input.modelYear);
	System.out.println("Washed?\t\t:\t" + input.isWashed);
	System.out.println("Insured?\t:\t" + input.isInsured);
    }
}

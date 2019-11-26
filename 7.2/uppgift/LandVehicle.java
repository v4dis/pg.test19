public abstract class LandVehicle extends Vehicle {

    public void stopForFood(String food) {
	fuel = maxFuelCapacity;
	System.out.println("A nice stop for refueling and eating food");
	honk();
    }

    public void honk() {
	System.out.println("*** Sound of a honking horn ***");
    }
}

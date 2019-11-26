import java.util.Random;

public abstract class WaterVehicle extends Vehicle{
    int waterDepth;
    public void dock(){
	fuel = maxFuelCapacity;
    }
    public void checkDepth(){
	Random random = new Random();
	waterDepth = random.nextInt(3000);
	System.out.println("The depth of these waters is: " + waterDepth + " meters");
    }
}

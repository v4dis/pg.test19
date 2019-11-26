package lib;

public class Car{

    public void fullThrottle(){
	String output = "The car is going as fast as it can!";
	System.out.println(output);
    }

    public void speed(int maxSpeed){
	maxSpeed = ++maxSpeed;
	System.out.println("Max speed is: " + maxSpeed);
    }
}

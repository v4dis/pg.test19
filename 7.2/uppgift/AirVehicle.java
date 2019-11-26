public abstract AirVehicle extends Vehicle {
    private int height;
    public void land(){
	height = 0;
	fuel = maxFuelCapacity;
	
    }

    public void adjustHeight(int height){
	this.height = height;
    }

    public void move(){
	
    }
}

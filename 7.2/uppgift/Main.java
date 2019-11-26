public class Main{
    public static void main(String[] args){
	Jetski j = new Jetski();
	j.checkDepth();

	Car c = new Car();
	c.honk();

	Plane p = new Plane();
	p.adjustHeight(10000);
    }
}

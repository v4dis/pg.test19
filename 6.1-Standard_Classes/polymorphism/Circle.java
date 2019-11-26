public class Circle extends Shape {
    private double radius;
    
    public Circle(){
    }

    public Circle(double radius){
	this.radius = radius;
	this.area = Math.PI * Math.pow(radius, 2);
	this.perimeter = Math.PI * 2 * radius;
    }

    public Circle(double radius, String color, boolean filled){
	this.radius = radius;
	this.color = color;
	this.filled = filled;
	this.area = Math.PI * Math.pow(radius, 2);
	this.perimeter = 2 * Math.PI * radius;
    }

    public double getRadius(){
	return radius;
    }

    public void setRadius(double radius){
	this.radius = radius;
    }
    
    public String toString(){
	return color + filled + area + perimeter + radius;
    }

}

public class Rectangle extends Shape{
    private double width, length;

    public Rectangle(){
	
    }

    public Rectangle(double width, double length){
	this.width = width;
	this.length = length;
	this.area = this.width * this.length;
	this.perimeter = (this.width * 2) + (this.length * 2);
    }

    public Rectangle(double width, double length, String color, boolean filled){
	this.width = width;
	this.length = length;
	this.color = color;
	this.filled = filled;
	this.area = this.width * this.length;
	this.perimeter = (this.width * 2) + (this.length * 2);
    }

    public double getWidth(){
	return 1.1d;
    }

    public void setWidth(double width){
	this.width = width;
    }

    public double getLength(){
	return 1.1d;
    }

    public void setLength(double length){
	this.length = length;
    }

    public String toString(){
	return color + filled + area + perimeter + length + width;
    }

}

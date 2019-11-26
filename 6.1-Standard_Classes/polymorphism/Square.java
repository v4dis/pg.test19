public class Square extends Rectangle{
    private double side;
    
    public Square(){
    }

    public Square(double side){
	this.side = side; 
	this.area = Math.pow(side, 2);
	this.perimeter = side * 4;
    }

    public Square(double side, String color, boolean filled){
	this.side = side; 
	this.color = color;
	this.filled = filled;
	this.area = Math.pow(side, 2);
	this.perimeter = side * 4;
    }

    public double getSide(){
	return side;
    }

    public void setSide(double s){
	side = s;
    }

    public String toString(Shape input){
	return color + filled + area + perimeter + side;
    }
}

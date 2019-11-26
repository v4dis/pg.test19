public class Shape {
    String color = new String();
    boolean filled;
    double area;
    double perimeter;
    
    public Shape(){
	
    }
    public Shape(String color, boolean filled){
	
    }

    public String getColor(){
	return color;
    }

    public void setColor(String color){
	this.color = color;
    }

    public boolean isFilled(){
	return true;
    }

    public void setFilled(){
	this.filled = true;
    }

    public double getArea(){
	return area;
    }

    public double getPerimeter(){
	return perimeter;
    }

    public String toString(Shape input){
	return color + filled + area + perimeter;
    }
}

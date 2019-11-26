public class Main {
    public static void main(String[] args){
	Circle c = new Circle(14, "Red", true );
	Rectangle r = new Rectangle(12, 104, "Magenta", true);
	Square s = new Square(45, "Blue", false);

	System.out.println(c.toString());
	System.out.println(r.toString());
	System.out.println(s.toString());
	
    }
}

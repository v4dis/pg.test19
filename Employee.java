public class Employee{
    public String name;
    public int age;
    
    public Employee(String n) {
	name = n;
	System.out.println("Welcome "+ name + "!");
    }
    public Employee(String n, int a) {
	name = n;
	age = a;
	System.out.println("Welcome "+ name + ", you are "+ age + " years old!");
    }
    public Employee() {
	System.out.println("Welcome ");
    }
    public Employee(int a, String n) {
	name = n;
	age = a;
	System.out.println("Welcome "+ name + ", you are "+ age + " years old!");
    }

    public void myMethod(){
	System.out.println("Hello... is it me you're looking for?");
    }
    
}

public class EmployeeObj{
    public String name;
    public int age;
    
    public EmployeeObj(String n) {
	name = n;
	System.out.println("Welcome "+ name + "!");
    }
    public EmployeeObj(String n, int a) {
	name = n;
	age = a;
	System.out.println("Welcome "+ name + ", you are "+ age + " years old!");
    }
    public EmployeeObj() {
	System.out.println("Welcome ");
    }
    public EmployeeObj(int a, String n) {
	name = n;
	age = a;
	System.out.println("Welcome "+ name + ", you are "+ age + " years old!");
    }

    public void myMethod(){
	System.out.println("Hello... is it me you're looking for?");
    }
    
}

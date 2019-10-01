public class Employee {
    public static void main(String[] args){
	EmployeeObj e1 = new EmployeeObj();
	EmployeeObj e2 = new EmployeeObj("Alice");
	EmployeeObj e3 = new EmployeeObj("Bob", 32);
	e3.myMethod();
    }
}

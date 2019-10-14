public class Main{
    public static void main(String[] args){
	int year = 2000;
	House house1 = new House(82, 3, 8800000, 1998, "Startgatan 47");
	House house2 = new House(82, 13, 18800000, 2014, "Aldusgatan 126");

	Car car1 = new Car("Volvo P1800", 1000000, 53);
	Car car2 = new Car("Fiat Panda 4x4", 35000, 100000);
	
	Person person1 = new Person("Alice", "mäklare", 43, 'f', 1.55f, house1, car1);
	Person person2 = new Person("Bob", "Maskodlare", 24, 'm', 1.75f, house1, car2);
	Person person3 = new Person("Charlie", "Moped-pilot", 55, 'a', 1.69f, house2, car1);

	for (int i = 0; i<=20; i++){
	    System.out.println(year);
	    year++;
	}
	
    }
    
}

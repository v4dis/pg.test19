public class Person {
    String name = new String("Jane Doe");
    String occupation = new String("Astronaut");
    int age = 53;
    char gender = 'f';
    float length = 1.65f;
    House house;
    Car car;
    
    public Person(String n, String o, int a, char g, float l, House h, Car c) {
	name = n;
	occupation = o;
	age = a;
	gender = g;
	length = l;
	house = h;
	car = c;
    }
    
    public Person(House h){
	house = h;
    }

    public void ageIncrement(){
	age = age + 1;
    }
    
    public String toString(){
	return name + " " + occupation + " " + age +" " + gender + " " + length + ", " + house.streetAddress + ", " + car;
    }
}

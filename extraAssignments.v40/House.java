public class House{
    int surfaceArea, nrOfFloors, yearOfConstruction;
    float  monetaryValue;
    String streetAddress;

    public House(int s, int n, float m, int y, String st){
	surfaceArea = s;
	nrOfFloors = n;
	monetaryValue = m;
        yearOfConstruction = y;
	streetAddress = st;
    }

    public void depreciationRate(){
	monetaryValue = monetaryValue * 1.05f;
    }

    public String toString(){
	return surfaceArea + " " + nrOfFloors + " " + monetaryValue +" " + yearOfConstruction + " " + streetAddress;
    }
    
}

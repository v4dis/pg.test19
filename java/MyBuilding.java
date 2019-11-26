public class MyBuilding{
    public static void main(String[] args){

	House myHouse = new House();
	House yourHouse = new otherHouse();

	
	//	myHouse.changeAddress("ITgatan 1");
	// yourHouse.changeAddress("Korsvägen 75");
	

	System.out.println(myHouse.showAddress());
	System.out.println(yourHouse.showAddress());

    }
}

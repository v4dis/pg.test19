public class House{
    String address;
    int levels;
    int postCode;
    boolean isCool;
    char addressCharacter;

    public House(){
    address = "Standard Street";
    levels = 1;
    postCode = 22222;
    isCool = true;
    addressCharacter='A';
    }
    
    public otherHouse(){
    address = "Non Standard Street";
    levels = 3;
    postCode = 45670;
    isCool = false;
    addressCharacter='C';
    }
    
    public void changeAddress(String newAddress){
	address = newAddress;
    }

    public String showAddress(){
	return address;
    }
}

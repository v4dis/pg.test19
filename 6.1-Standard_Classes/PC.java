public class PC extends Computer {

    @Override
    public void printYourInventor(){
	super.printYourInventor();
	System.out.println("Bill Gates (Eller hur...)");
    }

    public void pcExclusive(){
	System.out.println("I'm a PC...");
    }

}

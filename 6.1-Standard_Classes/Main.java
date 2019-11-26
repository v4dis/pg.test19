public class Main{
    public static void main(String[] args){
	Computer c = new Computer();
	c.printYourInventor();

	Computer p1 = new PC();
	p1 = (PC)p1;
	
	PC p2 = new PC();

	Computer m1 = new Macintosh();
	Macintosh m2 = new Macintosh();

	PC p3 = (PC) p1;
	p1.printYourInventor();
	p3.pcExclusive();

	p2.printYourInventor();
	p2.pcExclusive();

	Macintosh m3 = (Macintosh) m1;
	m1.printYourInventor();
	m3.macExclusive();
	m2.printYourInventor();
	m2.macExclusive();
    }
}

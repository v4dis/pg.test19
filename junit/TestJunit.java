import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit {
    @Test

    public void testAdd() {
	String str = "Junit is working fine";
	assertEquals("Junit is working fine", str);
    }

    @Test
    public void testFib() {
	
	Fibo test = new Fibo();
	
	for (int i = 0; i<10; i++) {
   System.out.println("Iteration: " + i + " : " + test.fib(i));
   assertEquals(test.fib(10), 55);
	}
	
    }
}

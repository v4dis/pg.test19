public class Skeleton{ // A class should start with capital letter - always
    public static void main(String[] args){
	int x = 1; // Example variables
	int y = 1;

	// Primitive data types

	// Ingeger types
	byte byteMin = -128, byteMax = 127;              // 1 byte  
	short shortMin = -32768, shortMax = 32767;       // 2 bytes 
	int intMin=-2147483, intMax=2147483647;          // 4 bytes
	long longMin=-9223372036854775808L, longMax=9223372036854775807L;  // 8 bytes

	// Floating point types
	float floatMin= 0.123456f, floatMax=0.1234567f;  // 4 bytes
	double doubleMin=1.7e-308d, doubleMax=1.7e+308d;  // 8 bytes

	// Other primitive types
	boolean booleanMin=false, booleanMax=true;       // 1 bit   
	char c = 'a' ; char ascii = 66;                  // 2 bytes 
	
	
	// Non-primitive data types - Reference types
	String stringMe = "A String is actually an object";
	String[] arrayMe = {"This","is","Array"};
	int[] arrayInt = {1,2,3};
	//NewClass myObj1 = new NewClass();
	MyClass myObj2 = new MyClass();
	// insert "interface" example here
	
	/*
	  Primitive types are predefined in Java. Non-primitive except 
	  for String are not. 

	  Non-primitive types can be used to call
	  methods, the primitive types cannot.

	  Primitive types always have a value, while non-primitive can 
	  be null.

	  Primitive types always start with a lowercase letter, while
	  non-primitive types start capitalized.

	  Size of the primitive types depends on the data type. Non-
	  primitive types all have the same size. (what size? btw?)

	 */

	// Java type casting

	// Widening Casting (automatic) convert from smaller to larger type
	double myDouble = intMin;
	
	// Narrowing Casting (manual) convert larger type to smaller type.
	int myInt = (int) myDouble;
	
	// Java Operators
	// value = Operand, acted on by Operator (ex +)
	// Operator groups
	// Arithmetic operators
	int addition =        x + y;
	int subtraction =     x - y;
	int multiplication =  x * y;
	int division =        x / y;
	int modulus =         x / y;
	int increment =       ++x;
	int decrement =       --;x
	// lägg till x--, x++

	// Assignment operators
	x =  5;    // assign x to 5
	x += 5;    // increment x by 5
	x -= 5;    // decrement x by 5
	x *= 5;    // multiply x by 5
	x /= 5;    // devide x by 5
	x %= 5;    // modulus x by 5
	x &= 5;    // Bitwise AND assignment operator (?)
	x |= 5;    // bitwise inclusive OR and assignment operator (?)
	x ^= 5;    // bitwise exclusive OR and assignment operator (?)
	x >>= 5;   // right shift AND assignment operator (?)
	x <<= 5;   // left shift AND assignment operator (?)
	    
	// Comparison operators
	if (x == y) {};
	if (x != y) {};
	if (x > y)  {};
	if (x < y)  {};
	if (x >= y) {};
	if (x <= y) {};
	
	// Logical operators
	if (x < y && y > x) {};    // Logical AND
	if (x < y || x > y) {};    // Logical OR
	if (!(x > 5)) {};          // Logical NOT

	
	// Bitwise operators (&,|,^,~,<<,>>,>>>)
	int a1 = 60, b1 = 13, c1 = 0;
	c1 = a1 & b1;   // bitwise AND.              (binary and operator)
	c1 = a1 | b1;   // bitwise OR                (binary OR operator)
	c1 = a1 ^ b1;   // bitwise XOR               (binary XOR operator)
	c1 = ~ a1;      // bitwise compliment        (binary ones compliment operator)
	c1 = a1 << b1;  // Shift a1 by b1 bits left  (binary left shift operator)
	c1 = a1 >> b1;  // Shift a1 by b1 bits right (binary right shift operator)
	c1 = a1 >>> b1; // Shift a1 by b1 bits right (Shift right zero fill operator)
	                // and fill left bits with 0's.

	
    }
}

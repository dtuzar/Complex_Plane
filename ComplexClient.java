public class ComplexClient 
{
	public static void main(String[] args) 
	{
		//Make new instances of Complex objects: c1 and c2
		Complex c1 = new Complex(2, 3);
		Complex c2 = new Complex(2, -3);	
		//Add c1 and c2 and store the result in a new Complex #, c3
		Complex c3 = c1.add(c2);
		//Use getters to print c3 in the form: "__+__i"  (no spaces)
		
		String s = c3.getReal() + "+" + c3.getImag() + "i";
		System.out.println(s);
		
		//Multiply c1 by c2 and store the result in c4
		Complex c4 = c1.multBy(c2);		
		//Print c4
		Complex c5 = c4;
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c1);
		Complex c7 = new Complex(2, -3);
		//String expected = "2-3i";
		Complex c8 = new Complex(2, 0);
		//String expected = "2";
		Complex c9 = new Complex(0, -3);
		//String expected = "-3i";
		System.out.println(c7);
		System.out.println(c8);
		System.out.println(c9);
	}
}

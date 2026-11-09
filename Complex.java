
public class Complex 
{
	//fields
	private int real; // establish that "real" is an int and private
	private int imag; // establish that "imag" is an int and private
	private int quadrant; // establish that "quadrant" is an int and private
	
	//constructors
	public Complex(int real, int imag)
	{
		this.real = real;
		this.imag = imag;
		setQuadrant();
	}

	//methods
	public int getReal()
	{
		return this.real; //This is getting the real number and will allow everyone to read the code
	}
	
	public int getImag()
	{
		return this.imag; //This is getting the imaginary number and will allow everyone to read the code
	}
	
	public void setReal(int real) //This will let the real number change without fucking everything else up
	{
		this.real = real;
		setQuadrant();
	}
	
	public void setImag(int imag) //This will let the imaginary number change the imag without fucking everything else up
	{
		this.imag = imag;
		setQuadrant();
	}
	public void setQuadrant() //This will let the quadrant number change the real without fucking everything else up
	{								  //This one specifically is using the given imag and real to set the quadrant
		int fin = 0;
		if(real > 0 && imag > 0)
		{
			fin = 1;
		}
		if(real > 0 && imag < 0)
		{
			fin = 2;
		}
		if(real < 0 && imag < 0)
		{
			fin = 3;
		}
		if(real < 0 && imag > 0)
		{
			fin = 4;
		}
		this.quadrant = fin;
	}
	
	public Complex add(Complex other)
	{
		int a = this.real;
		int b = other.real;
		int c = this.imag;
		int d = other.imag;
		return new Complex(a + b, c + d);
	}
	
	public Complex multBy(Complex other)
	{
		int a = this.real;
		int b = other.real;
		int c = this.imag;
		int d = other.imag;
		int newImag = (a * b) - (c * d);
		int newReal = (c * d) - (a * b);
		return new Complex (newReal, newImag);
	}
	
	public double distanceTo(Complex other)
	{
		int diffReal = this.real;
		int diffImag = this.imag;
		return Math.sqrt(diffReal * diffReal + diffImag * diffImag);
	}
	public static double distanceBetween(Complex other, Complex that)
	{
		int diffReal = that.real;
		int diffImag = that.imag;
		int othReal = other.real;
		int othImag = other.imag;
		int realDis = diffReal - othReal;
		int imagDis = diffImag - othImag;
		return Math.sqrt(realDis * realDis + imagDis * imagDis);
	}
	public String toString()
	{
		String s = "";
		if ((real > 0 || real < 0) && imag > 0)
		{
			s = real + "+" + imag + "i";
		}
		if (real == 0 && imag > 0)
		{
			s = imag + "i";
		}
		if ((real > 0 || real < 0) && imag == 0)
		{
			s = real + "";
		}
		if ((real > 0 || real < 0) && imag < 0)
		{
			s = real + imag + "i";
		}
		if (real == 0 && imag < 0)
		{
			s = imag + "i";
		}
		return s;
	}
	
}

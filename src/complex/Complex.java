package complex;

public class Complex {
	private double real;
	private double imaginary;

	public Complex(double real, double imaginary) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.real = real;
		this.imaginary = imaginary;
	}

	public Complex(Complex complex) {
		this.real = complex.Re();
		this.imaginary = complex.Im();
	}

	public double Re() {
		return real;
	}

	public double Im() {
		return imaginary;
	}

	public String toStr() {
		if(imaginary >= 0) {
			return new String(real + "+" + imaginary + "i");
		}else {
			return new String(real + "" + imaginary + "i");
		}
	}

	public double getArgument() {
		return Math.atan2(imaginary, real);
	}

	public double abs() {
		return Math.sqrt(Math.pow(real, 2) + Math.pow(imaginary, 2));
	}

	public void add(Complex complex) {
		real += complex.Re();
		imaginary += complex.Im();
	}

	public void sub(Complex complex) {
		real -= complex.Re();
		imaginary -= complex.Im();
	}

	public void mul(Complex complex) {
		double real = this.real * complex.Re() - this.imaginary * complex.Im();
		double imaginary = this.real * complex.Im() + this.imaginary * complex.Re();
		this.real = real;
		this.imaginary = imaginary;
	}

	public void div(Complex complex) {
		double real = (this.real * complex.Re() + this.imaginary * complex.Im())
				/ (Math.pow(complex.Re(), 2) + Math.pow(complex.Im(), 2));
		double imaginary = (this.imaginary * complex.Re() - this.real * complex.Im())
				/ (Math.pow(complex.Re(), 2) + Math.pow(complex.Im(), 2));
		this.real = real;
		this.imaginary = imaginary;
	}

	public Complex conj() {
		return new Complex(real, -imaginary);
	}

	public static Complex add(Complex c1, Complex c2) {
		double real;
		double imaginary;

		real = c1.Re() + c2.Re();
		imaginary = c1.Im() + c2.Im();

		return new Complex(real, imaginary);
	}

	public static Complex sub(Complex c1, Complex c2) {
		double real;
		double imaginary;

		real = c1.Re() - c2.Re();
		imaginary = c1.Im() - c2.Im();

		return new Complex(real, imaginary);
	}

	public static Complex mul(Complex c1, Complex c2) {
		double real;
		double imaginary;

		real = c1.Re() * c2.Re() - c1.Im() * c2.Im();
		imaginary = c1.Re() * c2.Im() + c1.Im() * c2.Re();

		return new Complex(real, imaginary);
	}

	public static Complex div(Complex c1, Complex c2) {
		double real;
		double imaginary;

		real = (c1.Re() * c2.Re() + c1.Im() * c2.Im()) / (Math.pow(c2.Re(), 2) + Math.pow(c2.Im(), 2));
		imaginary = (c1.Im() * c2.Re() - c1.Re() * c2.Im()) / (Math.pow(c2.Re(), 2) + Math.pow(c2.Im(), 2));

		return new Complex(real, imaginary);
	}
}

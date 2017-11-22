package complex;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Complex a = new Complex(3.0, -4.0);
		Complex b = new Complex(1.0, 2.0);

		System.out.println(a.Re());
		System.out.println(a.Im());

		System.out.println(a.toStr());
		System.out.println(b.toStr());

		System.out.println(a.abs());
		System.out.println(a.getArgument());

		Complex a1 = new Complex(a);
		System.out.println(a1.toStr());

		a1.add(b);
		System.out.println(a1.toStr());

		a1.sub(b);
		System.out.println(a1.toStr());

		a1.mul(b);
		System.out.println(a1.toStr());

		a1.div(b);
		System.out.println(a1.toStr());


		System.out.println(a.conj().toStr());

		Complex c1 = Complex.add(a, b);
		System.out.println(c1.toStr());

		Complex c2 = Complex.sub(a, b);
		System.out.println(c2.toStr());

		Complex c3 = Complex.mul(a, b);
		System.out.println(c3.toStr());

		Complex c4 = Complex.div(a, b);
		System.out.println(c4.toStr());

	}

}

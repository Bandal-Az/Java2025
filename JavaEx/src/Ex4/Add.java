package Ex4;

public class Add extends Calc {

	@Override
	void setV(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	int R() {
		return a + b;
	}

}

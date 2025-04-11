package Ex4;
public class Won2Dollar extends Converter {
	private int M;

	public Won2Dollar(int M) {
		this.M = M;
	}

	protected double convert(double src) {
		return src / M;
	}

	protected String srcString() {
		return "원";
	}

	protected String destString() {
		return "달러";
	}

}

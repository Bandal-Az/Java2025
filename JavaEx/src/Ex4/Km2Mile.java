package Ex4;

public class Km2Mile extends Converter {

	private double M;

	public Km2Mile(double M) {
		this.M = M;
	}

	protected double convert(double src) {
		return src / M;
	}

	protected String srcString() {
		return "Km";
	}

	protected String destString() {
		return "Mile";
	}

}


package Ex4;

public class IPTV extends ColorTV {
	private String a;

	public IPTV(String a, int size, int c) {
		super(size, c);
		this.a = a;
	}

	public void printProperty() {
		System.out.print("나의 IPTV는 " + a + " 주소의 ");
		super.printProperty();
	}

}
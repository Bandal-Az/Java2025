package Ex3;

public class TV {
	String l;
	int y;
	int i;

	public TV(String l, int y, int i) {
		this.l = l;
		this.y = y;
		this.i = i;
	}

	public void show() {
		System.out.print(l + "에서 만든 " + y + "년형 " + i + "인치 TV");
	}

}
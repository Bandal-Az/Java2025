package Ex4;
public class ColorTV extends TV {
	private int c;
	public ColorTV(int size, int c) {
		super (size);
		this.c = c ;
	}
	public void printProperty() {
		System.out.println(super.getSize() + "인치 " + c + "컬러");
	}
}
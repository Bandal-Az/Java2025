package Ex3;

public class Song {
	String t;
	String a;
	int y;
	String c;
	public Song() {}
	public Song(String t, String a, int y, String c) {
		this.t = t;
		this.a = a;
		this.y = y;
		this.c = c;
	}

	public void show() {
		System.out.println(y + "년 " + c + "국적의 " + a + "가 부른 " + t);
	}
}

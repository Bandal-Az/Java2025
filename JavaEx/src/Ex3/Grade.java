package Ex3;

public class Grade {
	int m;
	int s;
	int e;
	
public Grade(int m, int s, int e) {
	this.m = m;
	this.s = s;
	this.e = e;
}
public int average() {
	return(m+s+e)/3;
}

}

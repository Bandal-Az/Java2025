package Ex3;

class S {
	private String S;

	public S() {
		S = ("---");
	}

	public String getS() {
		return S;
	}

	public void setS(String name) {
		S = name;
	}
}

class L {
	S s[] = new S[10];

	public L() {
		for (int i = 0; i < s.length; i++) {
			s[i] = new S();
		}
	}

	public void show() {
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i].getS() + "");
		}
		System.out.println();
	}

	public void B(String name, int n) {
		s[n - 1].setS(name);
	}

	public void C(String name) {
		for (int i = 0; i < s.length; i++) {
			if (s[i].getS().equals(name)) {
				s[i].setS("---");
			}
		}
	}
}

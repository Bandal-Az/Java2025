package Ex2;

public class Ex13 {

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			int a = i / 10;
			int b = i % 10;
			if ((a == 3 || a == 6 || a == 9) && (b == 3 || b == 6 || b == 9))
				System.out.println(i + "박수 짝짝");
			else if (a == 3 || a == 6 || a == 9 || b == 3 || b == 6 || b == 9)
				System.out.println(i + "박수 짝");

//			if ((a!=0) &&(a%3 == 0)&&(b!=0)&&(b%3 == 0)) 
//				System.out.println(i + "박수 짝짝");
//			else if ((a!=0) &&(a%3 == 0) || (b!=0) &&(b%3 == 0)) 
//				System.out.println(i + "박수 짝");
//			
		}
	}
}
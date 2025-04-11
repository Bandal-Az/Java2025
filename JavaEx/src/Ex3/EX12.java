package Ex3;
import java.util.Scanner;
public class EX12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean p = true ;
		System.out.println("콘서트 예약 시스템입니다.");
		L S = new L();
		L A = new L();
		L B = new L();
		while(p) {
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
			int c = sc.nextInt();
			switch(c) {
			case 1:
				System.out.print("좌석 구분 S(1), A(2), B(3)>>");
				int s = sc.nextInt();
				sc.nextLine();
				switch(s) {
				case 1:
					System.out.print(" S>> ");
					S.show();
					System.out.print(" 이름>> ");
					String name = sc.next();
					System.out.print(" 번호>> ");
					int n = sc.nextInt();
					sc.nextLine();
					S.B(name, n);
					break;
				case 2:
					System.out.print(" A>> ");
					S.show();
					System.out.print(" 이름>> ");
					name = sc.next();
					System.out.print(" 번호>> ");
					n = sc.nextInt();
					sc.nextLine();
					A.B(name, n);
					break;
				case 3:
					System.out.print(" B>> ");
					S.show();
					System.out.print(" 이름>> ");
					name = sc.next();
					System.out.print(" 번호>> ");
					n = sc.nextInt();
					sc.nextLine();
					B.B(name, n);
					break;
				}
				break;
			case 2:
				System.out.println(" S>> ");
				S.show();
				System.out.println(" A>> ");
				A.show();
				System.out.println(" B>> ");
				B.show();
				break;
			case 3:
				System.out.print("좌석 S:1, A:2, B:3>>");
				s = sc.nextInt();
				sc.nextLine();
				switch(s) {
				case 1:
					System.out.print(" S>> ");
					S.show();
					System.out.print(" 이름>> ");
					String name = sc.next();
					S.C(name);
					break;
				case 2:
					System.out.print(" A>> ");
					S.show();
					System.out.print(" 이름>> ");
					name = sc.next();
					A.C(name);
					break;
				case 3:
					System.out.print(" B>> ");
					S.show();
					System.out.print(" 이름>> ");
					name = sc.next();
					B.C(name);
					break;
				}
				break;
			case 4:
				p = false ;
				break;
			}
		}
		System.out.println("프로그램을 종료합니다.");
		sc.close();
	}

}

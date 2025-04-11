package Ex3;
import java.util.Scanner;

public class PhoneBook {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("인원수>>");
		int a = sc.nextInt();
		Phone phone[] = new Phone[a];

		for (int i = 0; i < phone.length; i++) {
			System.out.print("이름과 전화번호 (이름과 번호는 빈 칸없이 입력)>>");
			String name = sc.next();
			String tel = sc.nextLine();
			phone[i] = new Phone(name, tel);
		}
		System.out.println("저장되었습니다...");
		while (true) {
			System.out.println("검색할 이름>>");
			String s = sc.next();
			if (s.equals("그만"))
				return;
			for (int i = 0; i < phone.length; i++) {
				if (phone[i].getName().equals(s)) {
					System.out.println(s + "의 번호는" + phone[i].getTel() + " 입니다.");

					break;
				} else
					System.out.println(s + " 이 없습니다.");
			}
		}
	}

}
